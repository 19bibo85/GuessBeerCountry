package com.GuessBeerCountry.Task;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;

import com.GuessBeerCountry.Activity.Main;
import com.GuessBeerCountry.Activity.Option;
import com.GuessBeerCountry.Activity.Start;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Repository.ComponentName;
import com.GuessBeerCountry.Repository.Query;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.SherlockActivity;

import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 15/03/2015.
 */
public class ScoreAsync extends AsyncTask<DatabaseHelper, Void, Object> {
    private final static String TAG = "ScoreAsync";
    private Main main = null;
    //private Game game = null;
    private Option dialog = null;
        
    // Constructor for Best Scores
    public <T> ScoreAsync(T activity) {
    	if(activity instanceof Main){
    		this.main = (Main) activity;
            Log.i(TAG, "Assigning MAIN activity.");
    	}
    	//else if(activity instanceof Game){
    		//this.game = (Game) activity;
            //Log.i(TAG, "Assigning GAME activity.");
    	//}
    	else if(activity instanceof Option){
    		this.dialog = (Option) activity;
            Log.i(TAG, "Assigning DIALOG PREFERENCE activity.");
    	}
    }

    @Override
    protected Object doInBackground(DatabaseHelper... databaseHelper) {
        Object result = null;
        if (main != null) {
            Log.i(TAG, "Querying score table to retrieve scores.");
            result = Query.GetBestScores(databaseHelper[0]);
        //} else if (game != null) {
         //   Log.i(TAG, "Querying score table to update score.");
        //    result = Query.GetScore(databaseHelper[0]);
        } else if (dialog != null) {
            Log.i(TAG, "Querying score table to clean up all scores.");
            result = Query.DeleteAllScores(databaseHelper[0]);
        }

        return result;
    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        if (main != null) {
            main.bestScoreActivity(result);
            Log.i(TAG, "Starting BEST SCORES activity.");
        //} else if (game != null) {
        //    game.scoreActivity(result);
        //    Log.i(TAG, "Starting SCORE activity.");
        } else if (dialog != null) {
            dialog.setNumRowScoDel(result);
            Log.i(TAG, "SCORES have been cleaned up.");
        }
    }    
}
