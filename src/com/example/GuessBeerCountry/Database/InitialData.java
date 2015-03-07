package com.example.GuessBeerCountry.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by elyvitvit on 07/03/2015.
 */
public class InitialData {
    private static ContentValues values = new ContentValues();

    public static void InsertBuild(SQLiteDatabase db) {
        values.clear();

        values.put(Database.BUILD[1], 1);
        values.put(Database.BUILD[2], "Guess License Plate");
        values.put(Database.BUILD[3], 1);
        values.put(Database.BUILD[4], "Alberto Tosi Brandi");
        db.insert(Database.TABLES[0], null, values);
    }

    public static void InsertName(SQLiteDatabase db) {

    }

    public static void InsertCountry(SQLiteDatabase db) {

    }

    public static void InsertType(SQLiteDatabase db) {

    }

    public static void InsertContinent(SQLiteDatabase db) {

    }

    public static void InsertArea(SQLiteDatabase db) {

    }

    public static void InsertScore(SQLiteDatabase db) {

    }

    public static void InsertStats(SQLiteDatabase db) {

    }
}
