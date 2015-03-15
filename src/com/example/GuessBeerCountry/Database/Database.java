package com.example.GuessBeerCountry.Database;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by elyvitvit on 06/03/2015.
 */
public class Database {
    // Database tables
    public static final String[] TABLES = {"build", "name", "country", "type", "continent", "area", "score", "statistics"};

    public static final String[] BUILD = {"_id", "name", "number", "developer", "dtModified"};
    private static final String DATABASE_CREATE_BUILD =
            " CREATE TABLE "
                    + TABLES[0]
                    + "("
                    + BUILD[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + BUILD[1] + " TEXT NOT NULL, "
                    + BUILD[2] + " INTEGER NOT NULL, "
                    + BUILD[3] + " TEXT NOT NULL, "
                    + BUILD[4] + " DATETIME NOT NULL "
                    + ");";


    public static final String[] NAME = {"_id", "imgID", "name", "countryCode", "typeID", "difficulty", "dtModified"};
    private static final String DATABASE_CREATE_NAME =
            " CREATE TABLE "
                    + TABLES[1]
                    + "("
                    + NAME[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + NAME[1] + " TEXT NOT NULL, "
                    + NAME[2] + " TEXT NOT NULL,"
                    + NAME[3] + " INTEGER NOT NULL, "
                    + NAME[4] + " INTEGER NOT NULL, "
                    + NAME[5] + " INTEGER NOT NULL, "
                    + NAME[6] + " DATETIME NOT NULL "
                    + ");";


    public static final String[] COUNTRY = {"countryCode", "areaCode", "en", "it", "es", "fr", "pt", "dtModified"};
    private static final String DATABASE_CREATE_COUNTRY =
            " CREATE TABLE "
                    + TABLES[2]
                    + "("
                    + COUNTRY[0] + " INTEGER PRIMARY KEY, "
                    + COUNTRY[1] + " INTEGER NOT NULL,"
                    + COUNTRY[2] + " TEXT NOT NULL, "
                    + COUNTRY[3] + " TEXT NOT NULL, "
                    + COUNTRY[4] + " TEXT NOT NULL, "
                    + COUNTRY[5] + " TEXT NOT NULL, "
                    + COUNTRY[6] + " TEXT NOT NULL, "
                    + COUNTRY[7] + " DATETIME NOT NULL "
                    + ")";


    public static final String[] TYPE = {"typeID", "name", "dtModified"};
    private static final String DATABASE_CREATE_TYPE =
            " CREATE TABLE "
                    + TABLES[3]
                    + "("
                    + TYPE[0] + " INTEGER PRIMARY KEY, "
                    + TYPE[1] + " INTEGER NOT NULL, "
                    + TYPE[2] + " TEXT NOT NULL, "
                    + TYPE[3] + " DATETIME NOT NULL "
                    + ");";


    public static final String[] CONTINENT = {"continentCode", "en", "it", "es", "fr", "pt", "dtModified"};
    private static final String DATABASE_CREATE_CONTINENT =
            " CREATE TABLE "
                    + TABLES[4]
                    + "("
                    + CONTINENT[0] + " INTEGER PRIMARY KEY, "
                    + CONTINENT[1] + " TEXT NOT NULL, "
                    + CONTINENT[2] + " TEXT NOT NULL, "
                    + CONTINENT[3] + " TEXT NOT NULL, "
                    + CONTINENT[4] + " TEXT NOT NULL "
                    + CONTINENT[5] + " TEXT NOT NULL, "
                    + CONTINENT[6] + " DATETIME NOT NULL "
                    + ");";


    public static final String[] AREA = {"areaCode", "continentCode", "en", "it", "es", "fr", "pt", "dtModified"};
    private static final String DATABASE_CREATE_AREA =
            " CREATE TABLE "
                    + TABLES[5]
                    + "("
                    + AREA[0] + " INTEGER PRIMARY KEY, "
                    + AREA[1] + " INTEGER NOT NULL, "
                    + AREA[2] + " TEXT NOT NULL, "
                    + AREA[3] + " TEXT NOT NULL, "
                    + AREA[4] + " TEXT NOT NULL, "
                    + AREA[5] + " TEXT NOT NULL, "
                    + AREA[6] + " TEXT NOT NULL, "
                    + AREA[7] + " DATETIME NOT NULL "
                    + ");";


    public static final String[] SCORE = {"_id", "gameMode", "value", "rate"};
    private static final String DATABASE_CREATE_SCORE =
            " CREATE TABLE "
                    + TABLES[6]
                    + "("
                    + SCORE[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + SCORE[1] + " INTEGER NOT NULL, "
                    + SCORE[2] + " INTEGER NOT NULL,"
                    + SCORE[3] + " DOUBLE NOT NULL"
                    + ");";


    public static final String[] STATS = {"_id", "imgID", "answer", "gameMode", "language", "theme", "range"};
    private static final String DATABASE_CREATE_STATS =
            " CREATE TABLE "
                    + TABLES[7]
                    + "("
                    + STATS[0] + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + STATS[1] + " TEXT NOT NULL, "
                    + STATS[2] + " INTEGER NOT NULL,"
                    + STATS[3] + " INTEGER NOT NULL, "
                    + STATS[4] + " TEXT NOT NULL, "
                    + STATS[5] + " TEXT NOT NULL,"
                    + STATS[6] + " TEXT NOT NULL"
                    + ");";

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE_BUILD);
        database.execSQL(DATABASE_CREATE_NAME);
        database.execSQL(DATABASE_CREATE_COUNTRY);
        database.execSQL(DATABASE_CREATE_TYPE);
        database.execSQL(DATABASE_CREATE_CONTINENT);
        database.execSQL(DATABASE_CREATE_AREA);
        database.execSQL(DATABASE_CREATE_SCORE);
        database.execSQL(DATABASE_CREATE_STATS);
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {

    }
}
