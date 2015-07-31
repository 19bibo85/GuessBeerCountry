package com.GuessBeerCountry.Repository;

import java.util.ArrayList;
import java.util.Locale;

import com.GuessBeerCountry.Activity.Start;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Model.Base;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;

public class Query {
	private final static String TAG = "Query";
	private static SQLiteDatabase db;
	
	// Retrieve data from build table
	public static ArrayList<String> About(DatabaseHelper databaseHelper) {

        String[] info = new String[]{
        		AppConfig.ABOUT_RETRIEVE_VERSION_DEF, 
        		AppConfig.ABOUT_RETRIEVE_BUILD_DEF, 
        		AppConfig.ABOUT_RETRIEVE_DEVELOPER_DEF};
       
        SQLiteDatabase db = null;

        try {
            Log.i(TAG, "Staring querying BUILD table.");
            db = databaseHelper.getReadableDatabase();
            Cursor cursor = db.rawQuery("SELECT version, number, developer FROM Build", null);
            int count = cursor.getCount();

            if (count > 0) {

                while (cursor.moveToNext()) {
                    if (cursor.isNull(AppConfig.ABOUT_RETRIEVE_VERSION_INDEX))
                        info[AppConfig.ABOUT_RETRIEVE_VERSION_INDEX] = AppConfig.ABOUT_RETRIEVE_VERSION_DEF;
                    else
                        info[AppConfig.ABOUT_RETRIEVE_VERSION_INDEX] = Integer.toString(cursor.getInt(AppConfig.ABOUT_RETRIEVE_VERSION_INDEX));

                    Log.i(TAG, "VERSION is: " + info[AppConfig.ABOUT_RETRIEVE_VERSION_INDEX] + ".");

                    if (cursor.isNull(AppConfig.ABOUT_RETRIEVE_BUILD_INDEX))
                        info[AppConfig.ABOUT_RETRIEVE_BUILD_INDEX] = AppConfig.ABOUT_RETRIEVE_BUILD_DEF;
                    else
                        info[AppConfig.ABOUT_RETRIEVE_BUILD_INDEX] = Integer.toString(cursor.getInt(AppConfig.ABOUT_RETRIEVE_BUILD_INDEX));

                    Log.i(TAG, "NUMBER is: " + info[AppConfig.ABOUT_RETRIEVE_BUILD_INDEX] + ".");

                    if (cursor.isNull(AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX))
                        info[AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX] = AppConfig.ABOUT_RETRIEVE_DEVELOPER_DEF;
                    else
                        info[AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX] = cursor.getString(AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX);

                    Log.i(TAG, "DEVELOPER is: " + info[AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX] + ".");
                }
            }
        }catch (Exception ex){
            Log.e(TAG, "Start exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
            Log.i(TAG, "Ending querying BUILD table.");
        }

        ArrayList<String> obj = Utility.CopyArrayToList(info);
        Log.i(TAG, "Returning build information.");

        return obj;
    }
	
	// Insert, Update or do nothing in score table.
    public static ArrayList<String> GetScore(DatabaseHelper databaseHelper) {
        ArrayList<String> scoreList = new ArrayList<String>();

        int corAns = Game.NumberCorrectAnswer;
        int wrgAns = Game.NumberWrongAnswer;
        int score = (corAns * AppConfig.SCORE_COR_ANS_FACTOR) - (wrgAns * AppConfig.SCORE_WRG_ANS_FACTOR);
        long value = (corAns + wrgAns) != 0 ? Math.round(((double) corAns / (double) (corAns + wrgAns)) * 100) : AppConfig.DEFAULT_VALUE;
        Log.i(TAG, "Calculate ANSWER values.");
        
        scoreList.add(Integer.toString(corAns));
        scoreList.add(Integer.toString(wrgAns));
        scoreList.add(Integer.toString(score));
        scoreList.add(Long.toString(value).concat("%"));
        Log.i(TAG, "Insert ANSWER values into list.");

        try {         
        	Log.i(TAG, "Create query SCORE table.");      
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

            Log.i(TAG, "Start querying SCORE table.");
            if (count == 0 && score > 0) {
                Log.i(TAG, "Inserting new score in SCORE table.");
                db.insert("score", null, values);
                db.close();
                scoreList.add("NEW");
                return scoreList;
            }

            Log.i(TAG, "Getting score value from SCORE table.");
            int scoreDB = Integer.parseInt(AppConfig.SCORE_DEFAULT_VALUE);
            while (cursor.moveToNext()) {
                if(!cursor.isNull(0))
                	scoreDB = cursor.getInt(0);
            }
            
            if (scoreDB >= score) {
                Log.i(TAG, "Current score value is lower than the SCORE in the database.");
                db.close();
                scoreList.add("OLD");
                return scoreList;
            }
            
            Log.i(TAG, "Updating score in SCORE table.");
            db.update("score", values, whereClause, whereArgs);
            scoreList.add("NEW");
        }catch(Exception ex){
            Log.e(TAG, "Score exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
        }
        return scoreList;
    }

    // Retrieve scores from score table.
    public static ArrayList<String> GetBestScores(DatabaseHelper databaseHelper) {
        String[] arrayObj = new String[AppConfig.BEST_SCORE_RETRIEVE_SIZE];
        arrayObj = Utility.FillDefaultVals(ComponentName.BestScore, arrayObj, AppConfig.BEST_SCORE_SCORE_DEFAULT, AppConfig.BEST_SCORE_RATE_DEFAULT);
        ArrayList<String> bestScoreList = Utility.CopyArrayToList(arrayObj);

        try {
            Log.i(TAG, "Staring querying SCORE table.");
            db = databaseHelper.getWritableDatabase();
            String[] columns = {"gameMode", "value", "rate"}; // Columns
            Cursor cursor = db.query("score", columns, null, null, null, null, null); // Get the cursor

            int count = cursor.getCount();
            if (count > 0) {
                while (cursor.moveToNext()) {
                    int gameMode = cursor.isNull(0) ? AppConfig.BEST_SCORE_GAME_MODE_DEFAULT : cursor.getInt(0);
                    Log.i(TAG, "Game Mode is: " + gameMode + ".");

                    String score = cursor.isNull(1) ? AppConfig.BEST_SCORE_SCORE_DEFAULT : Integer.toString(cursor.getInt(1));
                    Log.i(TAG, "Score is: " + score + ".");

                    String rate = cursor.isNull(2) ? AppConfig.BEST_SCORE_RATE_DEFAULT : Integer.toString((int) cursor.getDouble(2));
                    Log.i(TAG, "Rate is: " + rate + ".");

                    int rateIndx = (gameMode * 2) + 1;
                    if (rateIndx <= AppConfig.BEST_SCORE_RETRIEVE_SIZE) {
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

        bestScoreList.clear();
        bestScoreList = Utility.CopyArrayToList(arrayObj);
        Log.i(TAG, "Returning score information.");

        return bestScoreList;
    }
    
    // Delete scores from score table.
    public static int DeleteAllScores(DatabaseHelper databaseHelper) {
        int numRows = 0;
        try {
            Log.i(TAG, "Staring deleting SCORE table.");            
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

    // Retrieve list of countries to display
    public static ArrayList<Base> GetBaseList(String continent, Activity activity){
    	ArrayList<Base> beerList = new ArrayList<Base>();
    	    	
    	//TODO: 
        String whereCond = !continent.equals("All") ?
                           " WHERE Country = '" + continent + "'" :
                           " WHERE 1 = 1 ";
        whereCond = whereCond + " AND Plate.Version <> 0 GROUP BY Continent";
        String query = "SELECT Continent FROM Plate " + whereCond;

        db = Utility.GetDataBaseHelper(activity).getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();
        if (count > 0) {
            while (cursor.moveToNext()) {
                String name = AppConfig.PREF_RANGE_DEF;
                Base beer = new Base();
                if (!cursor.isNull(0))
                    name = cursor.getString(0);
                beer.SetName(name);
                beer.SetLanguage(Language.SetMainList(activity, continent));
                beer.SetImgId(Utility.SetImgId(name));
                beerList.add(beer);
            }
        }
        return beerList;
    }    

    // Retrieve list of beers to display
    public static ArrayList<Base> GetBeerList(String continent, Activity activity){    	
    	// Setting the condition for the where clause
    	String where = " WHERE Continent = '" + continent + "'";
    	where = where + " AND Plate.Version <> 0 AND Language.Version <> 0 ORDER BY Country, Name ASC";
    	
    	// Copy the list of the plate from the db that respect the condition above
    	return GameUtility.CopyDbToList(new ArrayList<Base>(), activity.getBaseContext(), where);
    }
}
