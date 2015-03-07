package com.example.GuessBeerCountry.Library;

/**
 * Created by elyvitvit on 07/03/2015.
 */
public class WebConf {

    // Database connection string
    //public static final String DB_CONN = "http://192.168.0.16:8080/";
    public static final String DB_CONN = "http://www.albertotosibrandi.comeze.com/";

    // Database URI path
    public static final String URI_PATH = "GuessBeerCountryPHP/src/";

    // JSON Generator file
    public static final String URI_FILE = "JSONGenerator.php";

    // Separator used in the URI
    public static final String URI_SEP = "?";

    // First parameter used with the connection string
    public static final String[] PARAMETER = {"table=", "format="};

    // Separator used between the parameters
    public static final String PAR_SEP = "&";

    // Connection status code to web service OK
    public static final int STATUS_CODE = 200;

    // JSON objects mapped from the DB tables
    public static final String[] JSON_OBJECTS = {"Build", "Name", "Country", "Type", "Continent", "Area", "Score", "Stats"};

    // Extension of the entity provided from the Online DB
    public static final String[] EXSTENSION = {"json"};

    public static final int DEFAULT_VERSION = 1;

    // JSON Elements for Build
    public static final String TAG_BUILD_NUMBER = "Number";
    public static final String TAG_BUILD_NAME = "Name";
    public static final String TAG_BUILD_VERSION = "Version";
    public static final String TAG_BUILD_DEVELOPER = "Developer";
}
