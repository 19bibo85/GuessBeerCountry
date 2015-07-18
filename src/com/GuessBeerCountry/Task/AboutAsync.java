package com.GuessBeerCountry.Task;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;

import com.GuessBeerCountry.Activity.Main;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Repository.AppConfig;
import com.GuessBeerCountry.Repository.Query;
import com.GuessBeerCountry.Repository.Utility;

import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 15/03/2015.
 */
public class AboutAsync extends AsyncTask<DatabaseHelper, Void, Object> {
    private final static String TAG = "AboutAsync";
    private Main mainActivity = null;

    public AboutAsync(Main mainActivity) {
        this.mainActivity = mainActivity;
        Log.i(TAG, "Assigning MAIN activity.");
    }

    @Override
    protected Object doInBackground(DatabaseHelper... databaseHelper) {
        Object result = null;

        if (databaseHelper != null){
            result = Query.About(databaseHelper[0]);
            Log.i(TAG, "Quering build table.");
        }

        return result;
    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        if (mainActivity != null) {
            mainActivity.aboutActivity(result);
            Log.i(TAG, "Starting ABOUT activity.");
        }
    }
}
