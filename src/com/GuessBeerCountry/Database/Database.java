package com.GuessBeerCountry.Database;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Alberto on 06/03/2015.
 */
public class Database {
    private final static String TAG = "Database";
    public static final String[] TABLES = {"build", "name", "country", "type", "continent", "area", "score", "statistics"};

    // Build table definition
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

    // Name table definition
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

    // Country table definition
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

    // Type table definition
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

    // Continent table definition
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

    // Area table definition
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

    // Score table definition
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

    // Stats table definition
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
        // Create build table
        database.execSQL(DATABASE_CREATE_BUILD);
        Log.i(TAG, "Creating BUILD table.");

        // Create name table
        database.execSQL(DATABASE_CREATE_NAME);
        Log.i(TAG, "Creating NAME table.");

        // Create country table
        database.execSQL(DATABASE_CREATE_COUNTRY);
        Log.i(TAG, "Creating COUNTRY table.");

        // Create type table
        database.execSQL(DATABASE_CREATE_TYPE);
        Log.i(TAG, "Creating TYPE table.");

        // Create continent table
        database.execSQL(DATABASE_CREATE_CONTINENT);
        Log.i(TAG, "Creating CONTINENT table.");

        // Create area table
        database.execSQL(DATABASE_CREATE_AREA);
        Log.i(TAG, "Creating AREA table.");

        // Create score table
        database.execSQL(DATABASE_CREATE_SCORE);
        Log.i(TAG, "Creating SCORE table.");

        // Create stats table
        database.execSQL(DATABASE_CREATE_STATS);
        Log.i(TAG, "Creating STATS table.");
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {

    }
}
