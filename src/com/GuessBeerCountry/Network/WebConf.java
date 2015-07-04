package com.GuessBeerCountry.Network;

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
    public static final String[] PARAMETER = {"table=", "format=", "date="};

    // Separator used between the parameters
    public static final String PAR_SEP = "&";

    // Connection status code to web service OK
    public static final int STATUS_CODE = 200;

    // JSON objects mapped from the DB tables
    public static final String[] JSON_OBJECTS = {"Build", "Name", "Country", "Type", "Continent", "Area", "Score", "Stats"};

    // Extension of the entity provided from the Online DB
    public static final String[] EXSTENSION = {"json"};

    public static final int DEFAULT_VERSION = 1;

    // JSON Tags for Build
    public static final String TAG_BUILD_NAME = "name";
    public static final String TAG_BUILD_NUMBER = "number";
    public static final String TAG_BUILD_DEVELOPER = "developer";
    public static final String TAG_BUILD_DATE = "dtModified";

    // JSON Tags for Name
    public static final String TAG_NAME_IMG_ID = "imgID";
    public static final String TAG_NAME_NAME = "name";
    public static final String TAG_NAME_COUNTRY_CODE = "countryCode";
    public static final String TAG_NAME_TYPE_ID = "typeID";
    public static final String TAG_NAME_DIFFICULTY = "difficulty";
    public static final String TAG_NAME_DATE = "dtModified";

    // JSON Tags for Country
    public static final String TAG_COUNTRY_CODE = "countryCode";
    public static final String TAG_COUNTRY_AREA_CODE = "areaCode";
    public static final String TAG_COUNTRY_ENGLISH = "en";
    public static final String TAG_COUNTRY_ITALIAN = "it";
    public static final String TAG_COUNTRY_SPANISH = "es";
    public static final String TAG_COUNTRY_FRENCH = "fr";
    public static final String TAG_COUNTRY_PORTUGUESE = "pt";
    public static final String TAG_COUNTRY_DATE = "dtModified";

    // JSON Tags for Type
    public static final String TAG_TYPE_ID = "typeID";
    public static final String TAG_TYPE_NAME = "name";
    public static final String TAG_TYPE_DATE = "dtModified";

    // JSON Tags for Continent
    public static final String TAG_CONTINENT_CODE = "continentCode";
    public static final String TAG_CONTINENT_ENGLISH = "en";
    public static final String TAG_CONTINENT_ITALIAN = "it";
    public static final String TAG_CONTINENT_SPANISH = "es";
    public static final String TAG_CONTINENT_FRENCH = "fr";
    public static final String TAG_CONTINENT_PORTUGUESE = "pt";
    public static final String TAG_CONTINENT_DATE = "dtModified";

    // JSON Tags for Area
    public static final String TAG_AREA_CODE = "areaCode";
    public static final String TAG_AREA_ENGLISH = "en";
    public static final String TAG_AREA_ITALIAN = "it";
    public static final String TAG_AREA_SPANISH = "es";
    public static final String TAG_AREA_FRENCH = "fr";
    public static final String TAG_AREA_PORTUGUESE = "pt";
    public static final String TAG_AREA_DATE = "dtModified";
}
