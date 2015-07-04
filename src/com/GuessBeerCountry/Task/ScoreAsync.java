package com.GuessBeerCountry.Task;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;

import com.GuessBeerCountry.Activity.Main;
import com.GuessBeerCountry.Activity.Start;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Library.ComponentName;
import com.GuessBeerCountry.Library.Utility;

import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 15/03/2015.
 */
public class ScoreAsync extends AsyncTask<DatabaseHelper, Void, Object> {
    private final static String TAG = "ScoreAsync";
    private Main mainActivity = null;
    private Game gameActivity = null;
    private OptionDialogPreference dialogPreference = null;
    private SQLiteDatabase db;

    // Constructor for Best Scores
    public ScoreAsync(Main mainActivity) {
        this.mainActivity = mainActivity;
        Log.i(TAG, "Assigning MAIN activity.");
    }

    // Constructor for Score
    public ScoreAsync(Game gameActivity) {
        this.gameActivity = gameActivity;
        Log.i(TAG, "Assigning GAME activity.");
    }

    // Constructor for Setting
    public ScoreAsync(OptionDialogPreference dialogPreference) {
        this.dialogPreference = dialogPreference;
        Log.i(TAG, "Assigning DIALOG PREFERENCE activity.");
    }

    @Override
    protected Object doInBackground(DatabaseHelper... databaseHelper) {
        Object result = null;

        if (mainActivity != null) {
            Log.i(TAG, "Querying score table to retrieve scores.");
            result = queryBestScores(databaseHelper[0]);
        } else if (gameActivity != null) {
            Log.i(TAG, "Querying score table to update score.");
            result = queryScore(databaseHelper[0]);
        } else if (dialogPreference != null) {
            Log.i(TAG, "Querying score table to clean up all scores.");
            result = deleteAllScores(databaseHelper[0]);
        }

        return result;
    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        if (mainActivity != null) {
            mainActivity.bestScoreActivity(result);
            Log.i(TAG, "Starting BEST SCORES activity.");
        } else if (gameActivity != null) {
            gameActivity.scoreActivity(result);
            Log.i(TAG, "Starting SCORE activity.");
        } else if (dialogPreference != null) {
            dialogPreference.setNumRowScoDel(result);
            Log.i(TAG, "SCORES have been cleaned up.");
        }
    }

    // Insert, Update or do nothing in score table.
    public ArrayList<String> queryScore(DatabaseHelper databaseHelper) {
        ArrayList<String> obj = new ArrayList<String>();
        final int DEFAULT_VALUE = 0;
        final int COR_ANS_FACTOR = 3;
        final int WRG_ANS_FACTOR = 2;

        // Getting correct and wrong answers of the last game
        int corAns = Game.NumberCorrectAnswer;
        int wrgAns = Game.NumberWrongAnswer;
        obj.add(Integer.toString(corAns));
        obj.add(Integer.toString(wrgAns));

        // Calculating the score
        int score = (corAns * COR_ANS_FACTOR) - (wrgAns * WRG_ANS_FACTOR);
        obj.add(Integer.toString(score));

        // Calculating the rate
        long value = (corAns + wrgAns) != 0 ? Math.round(((double) corAns / (double) (corAns + wrgAns)) * 100) : DEFAULT_VALUE;
        String rate = Long.toString(value).concat("%");
        obj.add(rate);

        try {
            Log.i(TAG, "Staring querying SCORE table.");
            // Open the db, gets the score for the mode selected
            db = databaseHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("gameMode", Start.Mode.getId());
            values.put("value", score);
            values.put("rate", value);

            String[] columns = {"value"}; // Columns
            String whereClause = "GameMode = ?"; // Where
            String[] whereArgs = {Integer.toString(Start.Mode.getId())}; // Arg
            Cursor cursor = db.query("score", columns, whereClause, whereArgs, null, null, null); // Get the cursor
            int count = cursor.getCount();

            // Insert score in case the table is empty
            if (count == 0 && score > 0) {
                Log.i(TAG, "Inserting new score in SCORE table.");
                db.insert("score", null, values);
                db.close();
                obj.add("NEW");
                return obj;
            }

            int scoreDB = DEFAULT_VALUE;
            while (cursor.moveToNext()) {
                scoreDB = cursor.isNull(0) ? DEFAULT_VALUE : cursor.getInt(0);
            }

            // Check if the score in db is higher than the last score
            if (scoreDB >= score) {
                Log.i(TAG, "Current score is lower than the score in the database.");
                db.close();
                obj.add("OLD");
                return obj;
            }

            // Update the score in db
            Log.i(TAG, "Updating score in SCORE table.");
            db.update("score", values, whereClause, whereArgs);
            obj.add("NEW");
        }catch(Exception ex){
            Log.e(TAG, "Score exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
        }
        return obj;
    }

    // Retrieve scores from score table.
    private ArrayList<String> queryBestScores(DatabaseHelper databaseHelper) {
        final int SIZE = 10;
        final int GAME_MODE_DEFAULT = -1;
        final String SCORE_DEFAULT = "0";
        final String RATE_DEFAULT = "0";

        String[] arrayObj = new String[SIZE];
        arrayObj = Utility.FillDefaultVals(ComponentName.BestScore, arrayObj, SCORE_DEFAULT, RATE_DEFAULT);
        ArrayList<String> obj = Utility.CopyArrayToList(arrayObj);

        try {
            Log.i(TAG, "Staring querying SCORE table.");
            // Open the db, gets the score for all the game mode
            db = databaseHelper.getWritableDatabase();
            String[] columns = {"gameMode", "value", "rate"}; // Columns
            Cursor cursor = db.query("score", columns, null, null, null, null, null); // Get the cursor

            int count = cursor.getCount();
            if (count > 0) {
                while (cursor.moveToNext()) {
                    int gameMode = cursor.isNull(0) ? GAME_MODE_DEFAULT : cursor.getInt(0);
                    Log.i(TAG, "Game Mode is: " + gameMode + ".");

                    String score = cursor.isNull(1) ? SCORE_DEFAULT : Integer.toString(cursor.getInt(1));
                    Log.i(TAG, "Score is: " + score + ".");

                    String rate = cursor.isNull(2) ? RATE_DEFAULT : Integer.toString((int) cursor.getDouble(2));
                    Log.i(TAG, "Rate is: " + rate + ".");

                    int rateIndx = (gameMode * 2) + 1;
                    if (rateIndx <= SIZE) {
                        int scoreIndx = rateIndx - 1;
                        arrayObj[scoreIndx] = score;
                        arrayObj[rateIndx] = rate;
                    }
                }
            }
        }catch(Exception ex){
            Log.e(TAG, "Best Score exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
            Log.i(TAG, "Ending querying SCORE table.");
        }

        obj.clear();
        obj = Utility.CopyArrayToList(arrayObj);
        Log.i(TAG, "Returning score information.");

        return obj;
    }

    private int deleteAllScores(DatabaseHelper databaseHelper) {
        int numRows = 0;
        try {
            Log.i(TAG, "Staring deleting SCORE table.");
            // Open the db, gets the score for all the game mode
            db = databaseHelper.getWritableDatabase();
            numRows = db.delete("Score", null, null);
        }catch(Exception ex){
            Log.e(TAG, "Deleting SCORE table exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
            Log.i(TAG, "Ending deleting SCORE table.");
        }
        return numRows;
    }
}
