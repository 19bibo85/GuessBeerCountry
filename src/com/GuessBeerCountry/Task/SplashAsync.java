package com.GuessBeerCountry.Task;

import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.view.Window;
import android.widget.Toast;

import com.GuessBeerCountry.Activity.SplashScreen;
import com.GuessBeerCountry.Database.Database;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Database.InitialData;
import com.GuessBeerCountry.Network.ServerError;
import com.GuessBeerCountry.Network.ThreadSafeHttpClientFactory;
import com.GuessBeerCountry.Network.WebConf;
import com.GuessBeerCountry.Repository.*;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by elyvitvit on 07/03/2015.
 */
public class SplashAsync extends AsyncTask<DatabaseHelper, Integer, ServerError> {
    private final Context context;
    private final SplashScreen activity;
    private final int TIMER = 4000;
    private ProgressDialog loadingDialog;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    public SplashAsync(SplashScreen activity) {
        this.context = activity.getBaseContext();
        this.activity = activity;

        dialog();
    }

    private void dialog(){
        // Progress Dialog
        this.loadingDialog = new ProgressDialog(activity, android.R.style.Theme_Translucent);
        this.loadingDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.loadingDialog.setCancelable(false);

        if (!this.loadingDialog.isShowing()) {
            this.loadingDialog.show();
        }

        //this.loadingDialog.setContentView(R.layout.custom_progress_dialog);
    }

    @Override
    protected ServerError doInBackground(DatabaseHelper... params) {
        this.databaseHelper = params[0];

        // Setting the values of default
        //setDefaultValues();

        // Getting the shared preferences
        //Object[] sharedPreference = Utility.GetSharedPreference(activity);
        //boolean hasToBeUpdated = sharedPreference.length == AppConfig.PREFERENCE ? (Boolean) sharedPreference[AppConfig.PREF_UPDATE_INDEX] : false;

        return ServerError.NO_ERROR; //hasToBeUpdated ? updateDatabase() : ServerError.NO_ERROR;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(ServerError result) {
        super.onPostExecute(result);
        loadingDialog.dismiss();

        if (result != null && !result.equals(ServerError.NO_ERROR)) {
            Toast toast = Toast.makeText(context,
                                         Language.GetServerErrorLanguage(result,
                                                                         activity,
                                                                         ComponentName.Splashscreen,
                                                                         AppConfig.SERVER_ERROR_LANGUAGE_SIZE),
                                         Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();
        }

        new CountDownTimer(TIMER, 1000) {

            public void onTick(long millisUntilFinished) {
                // Do nothing
            }

            public void onFinish() {
                activity.onTaskFinished();
            }
        }.start();
    }

    private void setDefaultValues() {
        if (databaseHelper != null) {
            db = databaseHelper.getReadableDatabase();
            Cursor cursor = db.query("Name", null, null, null, null, null, null);
            int count = cursor.getCount();

            if (count == 0) {
                // Setting all the default setting values
                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(PreferenceName.Language.toString(), Locale.getDefault().getLanguage());
                editor.putString(PreferenceName.Theme.toString(), "Theme 1");
                editor.putString(PreferenceName.Range.toString(), "Europe");
                editor.putBoolean(PreferenceName.Update.toString(), true);
                editor.putBoolean(PreferenceName.Sound.toString(), false);
                editor.commit();

                // Insert Build
                InitialData.InsertBuild(db);
                // Insert Plate
                InitialData.InsertName(db);
                // Insert Country
                InitialData.InsertCountry(db);
                // Insert Type
                InitialData.InsertType(db);
                // Insert Continent
                InitialData.InsertContinent(db);
                // InsertArea
                InitialData.InsertArea(db);
            }

            db.close();
        }
    }

    private ServerError updateDatabase() {
        // Updating, passing the connection to the db, the DB records in the tables(build, plate and language)
        return updateDatabase(WebConf.DB_CONN, WebConf.JSON_OBJECTS, WebConf.DEFAULT_VERSION);
    }

    private ServerError updateDatabase(String conn, String[] objJS, int serverVersion) {

        // Number of JSON main object that will be processed
        int numObjJS = objJS.length;

        // In case there are no JSON object to process on the server shows an error message
        if (numObjJS == 0) {
            return ServerError.OBJECT_NOT_FOUND;
        }

        // Instance of List of entities
        ArrayList<HttpEntity> objJSEntities = new ArrayList<HttpEntity>();

        // Create a number of JSON arrays equals to the number of JSON objects
        // because each JSON object contains a JSON array
        JSONArray[] arrayJson = new JSONArray[numObjJS];

        // Check if the objects passed have been parsed correctly, in case even one of those
        // has not been parsed correctly the app will return an error
        ServerError res = tryToParseJSON(conn, objJS, numObjJS, objJSEntities, arrayJson, serverVersion);

        return res;
    }

    private ServerError tryToParseJSON(String conn, String[] objJS, int numObjJS, ArrayList<HttpEntity> objJSEntities, JSONArray[] arrayJson, int serverVersion) {
        // Parsing each JSON object in a string, then create a JSONArray from the name of
        // the JSON object, that should be similar to the name of the DB table,
        // and in the end put it in the array that contains the JSON arrays

        ServerError res = ServerError.NO_ERROR;

        // Processing all the JSON objects found on the server
        for (int i = 0; i < numObjJS; i++) {

            // Parsing the JSON object selected
            ServerError entityRes = tryToGetEntity(conn, objJS[i], WebConf.EXSTENSION[0], objJSEntities);

            // In case it's not possible to get the entity of the JSON object return an error
            if (!entityRes.equals(ServerError.NO_ERROR)) {
                return entityRes;
            }

            //Log.e("SERVER", "Entity " + objJS[i] + " has been gotten correctly");

            // In case the JSON object has not been parsed correctly return an error
            ServerError parsing = parseEntity(objJS, i, objJSEntities, arrayJson);
            if (!parsing.equals(ServerError.NO_ERROR)) {
                return parsing;
            }

            //Log.e("SERVER", "Entity " + objJS[i] + " has been parsed correctly");

            // Set an instance of the DB writable, needs to be updated
            db = databaseHelper.getWritableDatabase();

            //Log.e("SERVER", "Moving entitiy " + objJS[i] +"  to DB");

            // Move the each JSON array got from the respective JSON object
            // to the DB using the respective DB object.
            res = moveToDB(objJS, i, arrayJson, serverVersion);
            if (res.equals(ServerError.OLD_BUILD)) {
                //Log.e("SERVER", "Build is old, no data will be moved to the DB.");
                return res;
            }

            //Log.e("SERVER", "Entity " + objJS[i] + " has been moved correctly to the DB");

            // Closing database connection
            db.close();
        }

        //Log.e("SERVER", "Entities have been parsed and moved to the DB correctly");

        return res;
    }

    private ServerError tryToGetEntity(String conn, String objJSName, String extension, ArrayList<HttpEntity> objJSEntities) {
        // Building string for URI
        String uriPath = WebConf.URI_PATH;
        String uriFile = WebConf.URI_FILE;
        String uriSeparator = WebConf.URI_SEP;
        String uri = uriPath.concat(uriFile).concat(uriSeparator);

        // Building string for Parameters
        String firstPar = WebConf.PARAMETER[0].concat(objJSName);
        String separator = WebConf.PAR_SEP;
        String secondPar = WebConf.PARAMETER[1].concat(extension);
        String parameters = firstPar.concat(separator).concat(secondPar);

        HttpClient client = ThreadSafeHttpClientFactory.INSTANCE.getThreadSafeHttpClient();
        HttpGet httpGet = new HttpGet(conn.concat(uri).concat(parameters));
        //Log.e("SERVER", "parseJSONFile: " + httpGet.getURI().toString());

        try {

            HttpResponse response = client.execute(httpGet);
            //Log.e("SERVER", "parseJSONFile: " + response.getStatusLine().toString());

            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();

            if (statusCode == WebConf.STATUS_CODE) {
                HttpEntity entity = response.getEntity();
                objJSEntities.add(entity);
            } else {
                //Log.e("SERVER", statusLine.toString());
                return ServerError.CONNECTION;
            }
        } catch (ClientProtocolException ee) {
            //Log.e("SERVER", ee.getMessage());
            return ServerError.PROTOCOL;

        } catch (IOException ee) {
            //Log.e("SERVER", ee.getMessage());
            return ServerError.STREAM;
        }

        return ServerError.NO_ERROR;
    }

    private ServerError parseEntity(String[] objJS, int i, ArrayList<HttpEntity> objJSEntities, JSONArray[] arrayJson) {
        //Log.e("SERVER", "Number of entities: " + objJSEntities.size());

        //if (objJSEntities.size() > 0) {

        //	for (int i = 0; i < objJSEntities.size(); i++) {

        //StringBuilder builder = new StringBuilder();
        HttpEntity entity = objJSEntities.get(i);
        //InputStream content;
        try {
                    /*
                    content = entity.getContent();
					BufferedReader reader = new BufferedReader(	new InputStreamReader(content, "UTF-8"), 8000);
					String line;

					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}

					content.close();

					String parStr = builder.toString();*/

            String parStr = EntityUtils.toString(entity, HTTP.UTF_8);

            //String parStr = URLDecoder.decode(builder.toString(), "UTF-8");
            //Log.e("SERVER", "Entity to parse: " + parStr);

            // Getting the JSON object for the entity parsed
            JSONObject jsonObject = new JSONObject(parStr);
            // Getting the JSON array of the JSON object parsed,
            // because for each JSON object there is only one JSON array
            //Log.e("SERVER", "JSON obj name " + objJS[i] + " assigned.");
            arrayJson[i] = jsonObject.getJSONArray(objJS[i]);

        } catch (NumberFormatException e) {
            return ServerError.CONNECTION;
        } catch (IllegalStateException e) {
            return ServerError.CONNECTION;
        } catch (IOException e) {
            return ServerError.CONNECTION;
        } catch (JSONException e) {
            return ServerError.CONNECTION;
        }
        //}
        //}

        return ServerError.NO_ERROR;
    }

    private ServerError moveToDB(String[] objJS, int i, JSONArray[] arrayJson, int serverVersion) {
        // No error as Default
        ServerError res = ServerError.NO_ERROR;

        // Since there is a JSONArray for each JSON object processed
        // going trough all the JSON object to get each JSON array file
        //for(int i = 0; i < numObjJS; i++)
        //{
        // Getting the JSON Array selected
        JSONArray jsonSel = arrayJson[i];
        //Log.e("SERVER", "JSON array selected: "+ objJS[i]);

        // Set the instance for the values to insert into the lite db
        ContentValues values = new ContentValues();

        // Start going through the JSON Array selected
        for (int j = 0; j < jsonSel.length(); j++) {
            try {
                // Getting the every single JSON object of the main JSON Array selected
                JSONObject objSel = jsonSel.getJSONObject(j);
                // Moving to the DB passing by the object
                res = setValuesToDB(objSel, objJS[i], values, serverVersion);
                if (res.equals(ServerError.OLD_BUILD))
                    return res;

            } catch (JSONException e) {
                e.printStackTrace();
                return ServerError.GENERAL;
            }
        }
        //}

        return res;
    }

    private ServerError setValuesToDB(JSONObject jsObj, String objJS, ContentValues values, int serverVersion) throws JSONException {
        ServerError result = ServerError.NO_ERROR;
        String[] columns = null;
        String whereClause = null;
        String[] whereArgs = null;

        if (objJS.equals(WebConf.JSON_OBJECTS[0])) {

            serverVersion = jsObj.getInt(WebConf.TAG_BUILD_DATE);
            columns = new String[]{Database.BUILD[4]};

            // Settings the values to insert or update
            values.put(Database.BUILD[1], jsObj.getInt(WebConf.TAG_BUILD_NAME));
            values.put(Database.BUILD[2], jsObj.getString(WebConf.TAG_BUILD_NUMBER));
            values.put(Database.BUILD[3], jsObj.getString(WebConf.TAG_BUILD_DEVELOPER));
            values.put(Database.BUILD[4], serverVersion);

        } else if (objJS.equals(WebConf.JSON_OBJECTS[1])) {

            serverVersion = jsObj.getInt(WebConf.TAG_NAME_DATE);
            columns = new String[]{Database.NAME[6]};
            whereClause = "imgID = ?";
            whereArgs = new String[]{jsObj.getString(WebConf.TAG_NAME_IMG_ID)};

            // Settings the values to insert or update
            values.put(Database.NAME[1], jsObj.getString(WebConf.TAG_NAME_IMG_ID));
            values.put(Database.NAME[2], jsObj.getString(WebConf.TAG_NAME_NAME));
            values.put(Database.NAME[3], jsObj.getString(WebConf.TAG_NAME_COUNTRY_CODE));
            values.put(Database.NAME[4], jsObj.getInt(WebConf.TAG_NAME_TYPE_ID));
            values.put(Database.NAME[5], jsObj.getInt(WebConf.TAG_NAME_DIFFICULTY));
            values.put(Database.NAME[6], serverVersion);

        } else if (objJS.equals(WebConf.JSON_OBJECTS[2])) {

            serverVersion = jsObj.getInt(WebConf.TAG_COUNTRY_DATE);
            columns = new String[]{Database.COUNTRY[7]};
            whereClause = "countryCode = ?";
            whereArgs = new String[]{jsObj.getString(WebConf.TAG_COUNTRY_CODE)};

            // Settings the values to insert or update
            values.put(Database.COUNTRY[0], jsObj.getInt(WebConf.TAG_COUNTRY_CODE));
            values.put(Database.COUNTRY[1], jsObj.getInt(WebConf.TAG_COUNTRY_AREA_CODE));
            values.put(Database.COUNTRY[2], jsObj.getString(WebConf.TAG_COUNTRY_ENGLISH));
            values.put(Database.COUNTRY[3], jsObj.getString(WebConf.TAG_COUNTRY_ITALIAN));
            values.put(Database.COUNTRY[4], jsObj.getString(WebConf.TAG_COUNTRY_SPANISH));
            values.put(Database.COUNTRY[5], jsObj.getString(WebConf.TAG_COUNTRY_FRENCH));
            values.put(Database.COUNTRY[6], jsObj.getString(WebConf.TAG_COUNTRY_PORTUGUESE));
            values.put(Database.COUNTRY[7], serverVersion);

        } else if (objJS.equals(WebConf.JSON_OBJECTS[3])) {

            serverVersion = jsObj.getInt(WebConf.TAG_TYPE_DATE);
            columns = new String[]{Database.TYPE[2]};
            whereClause = "typeId = ?";
            whereArgs = new String[]{jsObj.getString(WebConf.TAG_TYPE_ID)};

            // Settings the values to insert or update
            values.put(Database.TYPE[0], jsObj.getInt(WebConf.TAG_TYPE_ID));
            values.put(Database.TYPE[1], jsObj.getString(WebConf.TAG_TYPE_NAME));
            values.put(Database.TYPE[2], jsObj.getString(WebConf.TAG_TYPE_DATE));

        } else if (objJS.equals(WebConf.JSON_OBJECTS[4])) {

            serverVersion = jsObj.getInt(WebConf.TAG_CONTINENT_DATE);
            columns = new String[]{Database.CONTINENT[6]};
            whereClause = "continentCode = ?";
            whereArgs = new String[]{jsObj.getString(WebConf.TAG_CONTINENT_DATE)};

            // Settings the values to insert or update
            values.put(Database.CONTINENT[0], jsObj.getInt(WebConf.TAG_CONTINENT_CODE));
            values.put(Database.CONTINENT[1], jsObj.getString(WebConf.TAG_CONTINENT_ENGLISH));
            values.put(Database.CONTINENT[2], jsObj.getString(WebConf.TAG_CONTINENT_ITALIAN));
            values.put(Database.CONTINENT[3], jsObj.getString(WebConf.TAG_CONTINENT_SPANISH));
            values.put(Database.CONTINENT[4], jsObj.getString(WebConf.TAG_CONTINENT_FRENCH));
            values.put(Database.CONTINENT[5], jsObj.getString(WebConf.TAG_CONTINENT_PORTUGUESE));
            values.put(Database.CONTINENT[6], serverVersion);

        } else if (objJS.equals(WebConf.JSON_OBJECTS[5])) {

            serverVersion = jsObj.getInt(WebConf.TAG_AREA_DATE);
            columns = new String[]{Database.CONTINENT[6]};
            whereClause = "arCode = ?";
            whereArgs = new String[]{jsObj.getString(WebConf.TAG_CONTINENT_DATE)};

            // Settings the values to insert or update
            values.put(Database.CONTINENT[0], jsObj.getInt(WebConf.TAG_CONTINENT_CODE));
            values.put(Database.CONTINENT[1], jsObj.getString(WebConf.TAG_CONTINENT_ENGLISH));
            values.put(Database.CONTINENT[2], jsObj.getString(WebConf.TAG_CONTINENT_ITALIAN));
            values.put(Database.CONTINENT[3], jsObj.getString(WebConf.TAG_CONTINENT_SPANISH));
            values.put(Database.CONTINENT[4], jsObj.getString(WebConf.TAG_CONTINENT_FRENCH));
            values.put(Database.CONTINENT[5], jsObj.getString(WebConf.TAG_CONTINENT_PORTUGUESE));
            values.put(Database.CONTINENT[6], serverVersion);
        }

        // Inserting or updating the values just set
        result = insOrUpDB(jsObj, objJS, columns, whereClause, whereArgs, values, serverVersion);

        return result;
    }

    private ServerError insOrUpDB(JSONObject jsObj, String objJS, String[] columns, String whereClause, String[] whereArgs, ContentValues values, int serverVersion) throws JSONException {
        ServerError result = ServerError.NO_ERROR;

        Cursor cursor = db.query(objJS, columns, whereClause, whereArgs, null, null, null);
        int count = cursor.getCount();

        if (count > 0) {
            // Getting the version
            int currDBVersion = 0;
            while (cursor.moveToNext()) {
                if (cursor.isNull(0))
                    currDBVersion = 0;
                else
                    currDBVersion = cursor.getInt(0);
            }

            if (objJS.equals(WebConf.JSON_OBJECTS[0])) {
                //Log.e("SERVER", "Current version: "+currDBVersion + " Server version: "+serverVersion);
                if (currDBVersion == serverVersion) {
                    return ServerError.OLD_BUILD;
                }

                db.update(objJS, values, whereClause, whereArgs);

            } else if (objJS.equals(WebConf.JSON_OBJECTS[1])) {
                // In case the plate processed is a new version update it in the DB
                if (currDBVersion != serverVersion) {
                    db.update(objJS, values, whereClause, whereArgs);
                }
            } else if (objJS.equals(WebConf.JSON_OBJECTS[2])) {
                // In case the language processed is a new version update it in the DB
                if (currDBVersion != serverVersion) {
                    //Log.e("DATABASE", values.getAsString("it"));
                    db.update(objJS, values, whereClause, whereArgs);
                }
            }
        } else {
            db.insert(objJS, null, values);
        }

        return result;
    }
}
