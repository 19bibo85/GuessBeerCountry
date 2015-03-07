package com.example.GuessBeerCountry.Database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by elyvitvit on 06/03/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "gueseBeer.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(SherlockActivity activity) {
        super(activity.getBaseContext(), DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase database) {
        Database.onCreate(database);
    }

    // Method is called during an upgrade of the database,
    // e.g. if you increase the database version
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        Database.onUpgrade(database, oldVersion, newVersion);
    }
}
