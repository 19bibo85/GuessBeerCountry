package com.GuessBeerCountry.Task;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;

import com.GuessBeerCountry.Activity.Main;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Library.Utility;

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
            result = queryAbout(databaseHelper[0]);
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

    public ArrayList<String> queryAbout(DatabaseHelper databaseHelper) {
        final String VERSION_DEFAULT = "1";
        final String NUMBER_DEFAULT = "1";
        final String DEVELOPER_DEFAULT = "Alberto Tosi Brandi";

        String[] info = new String[]{VERSION_DEFAULT, NUMBER_DEFAULT, DEVELOPER_DEFAULT};

        String query = "SELECT version, number, developer FROM Build";
        SQLiteDatabase db = null;

        try {
            Log.i(TAG, "Staring querying BUILD table.");
            db = databaseHelper.getReadableDatabase();
            Cursor cursor = db.rawQuery(query, null);
            int count = cursor.getCount();

            if (count > 0) {

                while (cursor.moveToNext()) {
                    if (cursor.isNull(0))
                        info[0] = VERSION_DEFAULT;
                    else
                        info[0] = Integer.toString(cursor.getInt(0));

                    Log.i(TAG, "VERSION is: " + info[0] + ".");

                    if (cursor.isNull(1))
                        info[1] = NUMBER_DEFAULT;
                    else
                        info[1] = Integer.toString(cursor.getInt(1));

                    Log.i(TAG, "NUMBER is: " + info[1] + ".");

                    if (cursor.isNull(2))
                        info[2] = DEVELOPER_DEFAULT;
                    else
                        info[2] = cursor.getString(2);

                    Log.i(TAG, "DEVELOPER is: " + info[2] + ".");
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
}
