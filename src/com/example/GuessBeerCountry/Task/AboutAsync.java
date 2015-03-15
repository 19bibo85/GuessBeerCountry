package com.example.GuessBeerCountry.Task;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.example.GuessBeerCountry.Activity.Main;
import com.example.GuessBeerCountry.Database.DatabaseHelper;
import com.example.GuessBeerCountry.Library.Utility;

import java.util.ArrayList;

/**
 * Created by elyvitvit on 15/03/2015.
 */
public class AboutAsync extends AsyncTask<DatabaseHelper, Void, Object> {
    private Main mainActivity = null;

    public AboutAsync(Main mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    protected Object doInBackground(DatabaseHelper... databaseHelper) {
        Object result = null;

        if (databaseHelper != null)
            result = queryAbout(databaseHelper[0]);

        return result;
    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);
        if (mainActivity != null) {
            mainActivity.aboutActivity(result);
        }
    }

    public ArrayList<String> queryAbout(DatabaseHelper databaseHelper) {
        final String VERSION_DEFAULT = "0";
        final String NUMBER_DEFAULT = "0";
        final String DEVELOPER_DEFAULT = "Alberto Tosi Brandi";
        String[] info = new String[]{VERSION_DEFAULT, NUMBER_DEFAULT, DEVELOPER_DEFAULT};

        String query = "SELECT version, number, developer FROM Build";
        SQLiteDatabase db = databaseHelper.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        if (count > 0) {

            while (cursor.moveToNext()) {
                if (cursor.isNull(0))
                    info[0] = "1";
                else
                    info[0] = Integer.toString(cursor.getInt(0));

                if (cursor.isNull(1))
                    info[1] = "1";
                else
                    info[1] = Integer.toString(cursor.getInt(1));

                if (cursor.isNull(2))
                    info[2] = "Alberto Tosi Brandi";
                else
                    info[2] = cursor.getString(2);
            }
        }

        db.close();

        ArrayList<String> obj = Utility.CopyArrayToList(info);

        return obj;
    }
}
