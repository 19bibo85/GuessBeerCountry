package com.GuessBeerCountry.Repository;

import java.util.ArrayList;
import java.util.Locale;

import com.GuessBeerCountry.Activity.Start;
import com.GuessBeerCountry.Activity.Stats;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Model.Base;
import com.GuessBeerCountry.Task.List;
import com.GuessBeerCountry.Task.R;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;

public class Query {
	private final static String TAG = "Query";
	private static SQLiteDatabase db;
	
	// Retrieve data from build table
	public static ArrayList<String> About(DatabaseHelper databaseHelper) {

        String[] info = new String[]{
        		AppConfig.ABOUT_RETRIEVE_VERSION_DEF, 
        		AppConfig.ABOUT_RETRIEVE_BUILD_DEF, 
        		AppConfig.ABOUT_RETRIEVE_DEVELOPER_DEF};
       
        SQLiteDatabase db = null;

        try {
            Log.i(TAG, "Staring querying BUILD table.");
            db = databaseHelper.getReadableDatabase();
            Cursor cursor = db.rawQuery("SELECT version, number, developer FROM Build", null);
            int count = cursor.getCount();

            if (count > 0) {

                while (cursor.moveToNext()) {
                    if (cursor.isNull(AppConfig.ABOUT_RETRIEVE_VERSION_INDEX))
                        info[AppConfig.ABOUT_RETRIEVE_VERSION_INDEX] = AppConfig.ABOUT_RETRIEVE_VERSION_DEF;
                    else
                        info[AppConfig.ABOUT_RETRIEVE_VERSION_INDEX] = Integer.toString(cursor.getInt(AppConfig.ABOUT_RETRIEVE_VERSION_INDEX));

                    Log.i(TAG, "VERSION is: " + info[AppConfig.ABOUT_RETRIEVE_VERSION_INDEX] + ".");

                    if (cursor.isNull(AppConfig.ABOUT_RETRIEVE_BUILD_INDEX))
                        info[AppConfig.ABOUT_RETRIEVE_BUILD_INDEX] = AppConfig.ABOUT_RETRIEVE_BUILD_DEF;
                    else
                        info[AppConfig.ABOUT_RETRIEVE_BUILD_INDEX] = Integer.toString(cursor.getInt(AppConfig.ABOUT_RETRIEVE_BUILD_INDEX));

                    Log.i(TAG, "NUMBER is: " + info[AppConfig.ABOUT_RETRIEVE_BUILD_INDEX] + ".");

                    if (cursor.isNull(AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX))
                        info[AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX] = AppConfig.ABOUT_RETRIEVE_DEVELOPER_DEF;
                    else
                        info[AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX] = cursor.getString(AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX);

                    Log.i(TAG, "DEVELOPER is: " + info[AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX] + ".");
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
	
	// Insert, Update or do nothing in score table.
    public static ArrayList<String> GetScore(DatabaseHelper databaseHelper) {
        ArrayList<String> scoreList = new ArrayList<String>();

        int corAns = Game.NumberCorrectAnswer;
        int wrgAns = Game.NumberWrongAnswer;
        int score = (corAns * AppConfig.SCORE_COR_ANS_FACTOR) - (wrgAns * AppConfig.SCORE_WRG_ANS_FACTOR);
        long value = (corAns + wrgAns) != 0 ? Math.round(((double) corAns / (double) (corAns + wrgAns)) * 100) : AppConfig.DEFAULT_VALUE;
        Log.i(TAG, "Calculate ANSWER values.");
        
        scoreList.add(Integer.toString(corAns));
        scoreList.add(Integer.toString(wrgAns));
        scoreList.add(Integer.toString(score));
        scoreList.add(Long.toString(value).concat("%"));
        Log.i(TAG, "Insert ANSWER values into list.");

        try {         
        	Log.i(TAG, "Create query SCORE table.");      
            db = databaseHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("gameMode", Start.Mode.getId());
            values.put("value", score);
            values.put("rate", value);

            String[] columns = {"value"}; // Columns
            String whereClause = "GameMode = ?"; // Where
            String[] whereArgs = {Integer.toString(Start.Mode.getId())}; // Arg
            Cursor cursor = db.query("score", columns, whereClause, whereArgs, null, null, null); // Get the cursor
            int count = cursor.getCount();

            Log.i(TAG, "Start querying SCORE table.");
            if (count == 0 && score > 0) {
                Log.i(TAG, "Inserting new score in SCORE table.");
                db.insert("score", null, values);
                db.close();
                scoreList.add("NEW");
                return scoreList;
            }

            Log.i(TAG, "Getting score value from SCORE table.");
            int scoreDB = Integer.parseInt(AppConfig.SCORE_DEFAULT_VALUE);
            while (cursor.moveToNext()) {
                if(!cursor.isNull(0))
                	scoreDB = cursor.getInt(0);
            }
            
            if (scoreDB >= score) {
                Log.i(TAG, "Current score value is lower than the SCORE in the database.");
                db.close();
                scoreList.add("OLD");
                return scoreList;
            }
            
            Log.i(TAG, "Updating score in SCORE table.");
            db.update("score", values, whereClause, whereArgs);
            scoreList.add("NEW");
        }catch(Exception ex){
            Log.e(TAG, "Score exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
        }
        return scoreList;
    }

    // Retrieve scores from score table.
    public static ArrayList<String> GetBestScores(DatabaseHelper databaseHelper) {
        String[] arrayObj = new String[AppConfig.BEST_SCORE_RETRIEVE_SIZE];
        arrayObj = Utility.FillDefaultVals(ComponentName.BestScore, arrayObj, AppConfig.BEST_SCORE_SCORE_DEFAULT, AppConfig.BEST_SCORE_RATE_DEFAULT);
        ArrayList<String> bestScoreList = Utility.CopyArrayToList(arrayObj);

        try {
            Log.i(TAG, "Staring querying SCORE table.");
            db = databaseHelper.getWritableDatabase();
            String[] columns = {"gameMode", "value", "rate"}; // Columns
            Cursor cursor = db.query("score", columns, null, null, null, null, null); // Get the cursor

            int count = cursor.getCount();
            if (count > 0) {
                while (cursor.moveToNext()) {
                    int gameMode = cursor.isNull(0) ? AppConfig.BEST_SCORE_GAME_MODE_DEFAULT : cursor.getInt(0);
                    Log.i(TAG, "Game Mode is: " + gameMode + ".");

                    String score = cursor.isNull(1) ? AppConfig.BEST_SCORE_SCORE_DEFAULT : Integer.toString(cursor.getInt(1));
                    Log.i(TAG, "Score is: " + score + ".");

                    String rate = cursor.isNull(2) ? AppConfig.BEST_SCORE_RATE_DEFAULT : Integer.toString((int) cursor.getDouble(2));
                    Log.i(TAG, "Rate is: " + rate + ".");

                    int rateIndx = (gameMode * 2) + 1;
                    if (rateIndx <= AppConfig.BEST_SCORE_RETRIEVE_SIZE) {
                        int scoreIndx = rateIndx - 1;
                        arrayObj[scoreIndx] = score;
                        arrayObj[rateIndx] = rate;
                    }
                }
            }
        }catch(Exception ex){
            Log.e(TAG, "Best Score exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
            Log.i(TAG, "Ending querying SCORE table.");
        }

        bestScoreList.clear();
        bestScoreList = Utility.CopyArrayToList(arrayObj);
        Log.i(TAG, "Returning score information.");

        return bestScoreList;
    }
    
    // Delete scores from score table.
    public static int DeleteAllScores(DatabaseHelper databaseHelper) {
        int numRows = 0;
        try {
            Log.i(TAG, "Staring deleting SCORE table.");            
            db = databaseHelper.getWritableDatabase();
            numRows = db.delete("Score", null, null);
        }catch(Exception ex){
            Log.e(TAG, "Deleting SCORE table exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
            Log.i(TAG, "Ending deleting SCORE table.");
        }
        return numRows;
    }

    // Retrieve list of countries to display
    public static ArrayList<Base> GetBaseList(String continent, Activity activity){
    	ArrayList<Base> beerList = new ArrayList<Base>();
    	    	
    	//TODO: 
        String whereCond = !continent.equals("All") ?
                           " WHERE Country = '" + continent + "'" :
                           " WHERE 1 = 1 ";
        whereCond = whereCond + " AND Plate.Version <> 0 GROUP BY Continent";
        String query = "SELECT Continent FROM Plate " + whereCond;

        db = Utility.GetDataBaseHelper(activity).getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();
        if (count > 0) {
            while (cursor.moveToNext()) {
                String name = AppConfig.PREF_RANGE_DEF;
                Base beer = new Base();
                if (!cursor.isNull(0))
                    name = cursor.getString(0);
                beer.SetName(name);
                beer.SetLanguage(Language.SetMainList(activity, continent));
                beer.SetImgId(Utility.SetImgId(name));
                beerList.add(beer);
            }
        }
        return beerList;
    }    

    // Retrieve list of beers to display
    public static ArrayList<Base> GetBeerList(String continent, Activity activity){
    	// Setting the condition for the where clause
    	String where = " WHERE Continent = '" + continent + "'";
    	where = where + " AND Plate.Version <> 0 AND Language.Version <> 0 ORDER BY Country, Name ASC";
    	
    	// Copy the list of the plate from the db that respect the condition above
    	return GameUtility.CopyDbToList(new ArrayList<Base>(), activity.getBaseContext(), where);
    }

    // Add new stats into the stastics table
    public static long AddStats(Context context, String imgID, int answer, int gameModeId){
		long numRowIns = 0;
		try { 
			db = Utility.GetDataBaseHelper(context).getWritableDatabase();
			
			ContentValues values = new ContentValues();
			values.put("imgID", imgID);
			values.put("answer", answer);
			values.put("gameMode", gameModeId);
			
			Object[] prefs = Utility.GetSharedPreference(context);
			if (prefs.length == AppConfig.PREFERENCE) {				
				values.put("language", prefs[AppConfig.PREF_LANGUAGE_INDEX].toString());
				values.put("theme", prefs[AppConfig.PREF_THEME_INDEX].toString());
				values.put("range", prefs[AppConfig.PREF_RANGE_INDEX].toString());
			}			
			numRowIns = db.insert("statistics", null, values);
			
		}catch(Exception ex){
            Log.e(TAG, "Add Stats exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
        }
		
		return numRowIns;
	}
	
	// Main query to show the list of strings in statistics
	public static ArrayList<String> GetStats(Context context, int gameModeId){
		final int DEFAULT_NUMERIC = 0;
		String defaultString;
		
		final String TABLE = "statistics";
		
		final String[] LIMITS ={"0", "2", "3", "4"};
		final String COR_ANS = "1";
		final String WRG_ANS = "0";
		
		String where = null;
		String[] condition = null;
		String[] wrgCondition = null;
		
		final int SIZE = 17;
		String[] info = new String[SIZE];		
		info = Utility.FillDefaultVals(ComponentName.Stats, info, Integer.toString(DEFAULT_NUMERIC), defaultString);
		ArrayList<String> obj = Utility.CopyArrayToList(info);
		
		switch(gameModeId){
			case 0:
				where = "gameMode >= ? and answer = ?";
				condition = new String[]{LIMITS[0], COR_ANS};
				wrgCondition = new String[]{LIMITS[0], WRG_ANS};
				break;
			case 1:
				where = "gameMode >= ? and gameMode <= ? and answer = ?";
				condition = new String[]{LIMITS[0],LIMITS[1], COR_ANS};
				wrgCondition = new String[]{LIMITS[0],LIMITS[1], WRG_ANS};
				break;
			case 2:
				where = "gameMode >= ? and gameMode <= ? and answer = ?";
				condition = new String[]{LIMITS[2],LIMITS[3], COR_ANS};
				wrgCondition = new String[]{LIMITS[2],LIMITS[3], WRG_ANS};
				break;
			default:
				break;
		}
		
		try{
			
			db = Utility.GetDataBaseHelper(context).getReadableDatabase();
			
			if(db != null){
				Cursor cursor = db.query(TABLE, null, where, condition, null, null, null);
				int count = cursor.getCount();
						
				if(count > 0)
				{						
					// Total number of plates (ALL_PLATES)
					info[0] = Integer.toString(count);
					
					// European plates (EUROPEAN_PLATES)
					cursor = db.query(TABLE, null, where + " and imgID like 'eu_%'", condition, null, null, null);
					count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
					info[1] = Integer.toString(count);
				
					// Rest of the world plates (ROTW_PLATES)
					cursor = db.query(TABLE, null, where + " and imgID like 'us_%'", condition, null, null, null);
					count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
					info[2] = Integer.toString(count);
					
					// Total correct answer (CORR_ANS)
					//cursor = db.query(TABLE, null, where + " and answer = ?", addCondition(condition, "1"), null, null, null);
					//count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
					//info[3] = Integer.toString(count);
					info[3] = info[0];
							
					// Total wrong answer (WRG_ANS)
					//cursor = db.query(TABLE, null, where + " and answer = ?", addCondition(condition, "0"), null, null, null);
					cursor = db.query(TABLE, null, where, wrgCondition, null, null, null);
					count = cursor != null ? cursor.getCount() : DEFAULT_NUMERIC;
					info[4] = Integer.toString(count);
					
					// The most 5 plate generated (MOST_PLATE)
					info[5] = FormatString(GetStringList(context, 0, where, condition, true), defaultString);
								
					// The least 5 plate generated (LEAST_PLATE)
					info[6] = FormatString(GetStringList(context, 0, where, condition, false), defaultString);
				
					// The most 5 European plate generated (MOST_EU_PLATE)			
					info[7] = FormatString(GetStringList(context, 0, where + " and imgID like 'eu_%'", condition, true), defaultString);
				
					// The least 5 European plate generated (LEAST_EU_PLATE)
					info[8] = FormatString(GetStringList(context, 0, where + " and imgID like 'eu_%'", condition, false), defaultString);
								
					// The most 5 Rest of the world plate generated (MOST_ROTW_PLATE)
					info[9] = FormatString(GetStringList(context, 0, where + " and imgID like 'us_%'", condition, true), defaultString);
					
					// The least 5 European plate generated (LEAST_ROTW_PLATE)
					info[10] = FormatString(GetStringList(context, 0, where + " and imgID like 'us_%'", condition, false), defaultString);
		
					// The most 3 language chosen (MOST_LANG)
					info[11] = FormatString(GetStringList(context, 1, where, condition, true), defaultString);
					
					// The most 3 language chosen (LEAST_LANG)
					info[12] = FormatString(GetStringList(context, 1, where, condition, false), defaultString);
					
					// The most 3 theme chosen (MOST_THEME)
					info[13] = FormatString(GetStringList(context, 2, where, condition, true), defaultString);
					
					// The least 3 theme chosen (LEAST_THEME)
					info[14] = FormatString(GetStringList(context, 2, where, condition, false), defaultString);
					
					// The most 1 range chosen (MOST_RANGE)
					info[15] = FormatString(GetStringList(context, 3, where, condition, true), defaultString);
					
					// The least 1 range chosen (LEAST_RANGE)
					info[16] = FormatString(GetStringList(context, 3, where, condition, false), defaultString);
				}
				
				obj.clear();
				obj = Utility.CopyArrayToList(info);
			}
			
		}catch(Exception ex){
            Log.e(TAG, "Add Stats exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
        }
		
		return obj;
	}

	// Delete all stats
	public static int DeleteStats(DatabaseHelper databaseHelper){
		int numRows = 0;
		try{
			db = databaseHelper.getWritableDatabase();
			numRows = db.delete("statistics", null, null);
		}catch(Exception ex){
            Log.e(TAG, "Delete Stats exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }finally {
            db.close();
        }		
		return numRows;
	}
	
	// Format the string or the list of strings to print
	private static String FormatString(ArrayList<String> nameList, String defaultString){
		String result = defaultString;
		if(nameList != null && nameList.size() > 0){
			String strConc = "";
			for(int i=0; i < nameList.size(); i++){
				strConc += nameList.size() != 1 ? 
												i != (nameList.size() - 1)
																		?																		
																		+(i+1) + " - " + nameList.get(i)+ "\n"
																		:
																		+(i+1) + " - " + nameList.get(i)
												: 
												+(i+1) + " - " + nameList.get(i);
			}
			result = strConc;
		}
		
		return result;
	}
	
	// Get the list of string for the query passed
	private static ArrayList<String> GetStringList(Context context, int queryType, String where, String[] condition, boolean isMax){
		String query = null;
		String order = isMax ? "DESC" : "ASC";
		ArrayList<String> res = null;
		
		Object[] prefs = Utility.GetSharedPreference(context);
		if (prefs.length != AppConfig.PREFERENCE) return res;
		
		String lang = prefs[AppConfig.PREF_LANGUAGE_INDEX].toString();
		
		switch(queryType)
		{
			case 0: // ImgID
				query = "SELECT Language."+ lang +", numImgID as newPlate " +
						"FROM(SELECT ImgID, COUNT(*) as numImgID " +
						"FROM Statistics WHERE "+ where +" GROUP BY ImgID) as NewTable " +
						"INNER JOIN Plate on Plate.ImgID = NewTable.ImgID " + 
						"INNER JOIN Language on Language.ImgID = Plate.ImgID ORDER BY numImgID "+ order +" LIMIT 5";
				break;
			case 1: // Language
				query = "SELECT NewTable.Language, numLang as newLang " +
						"FROM(SELECT Language, COUNT(*) as numLang " +
						"FROM Statistics WHERE "+ where +" GROUP BY Language) as NewTable ORDER BY numLang "+ order + " LIMIT 3";				
				break;
			case 2: // Theme				
				query = "SELECT NewTable.Theme, numTheme as newTheme " +
						"FROM(SELECT Theme, COUNT(*) as numTheme " +
						"FROM Statistics WHERE "+ where +" GROUP BY Theme) as NewTable ORDER BY numTheme "+ order + " LIMIT 3";
				break;
			case 3: // Range
				query = "SELECT NewTable.Range, numRange as newRange " +
						"FROM(SELECT Range, COUNT(*) as numRange " +
						"FROM Statistics WHERE "+ where +" GROUP BY Range) as NewTable ORDER BY numRange "+ order + " LIMIT 1";
				break;
			default:
				break;
		}
		
		// Concatenation of the name and number
		if(query != null){
			Cursor cursor = db.rawQuery(query, condition);
			if(cursor != null && cursor.getCount() > 0){
				res = new ArrayList<String>();
				while (cursor.moveToNext()) {
					String conc = null;
					if (!cursor.isNull(0))
						conc = queryType != 0 ? Language.GetStatsLocalized(context, queryType, lang, cursor.getString(0)) : cursor.getString(0);
					if (!cursor.isNull(1))
					{
						conc += " (" + cursor.getString(1) + ")";
						res.add(conc);
					}
				}
			}
		}
		
		return res;
	}	
	
	private String NoResultLocalized(Context context){
		String result = "No Results";
		if(context != null){
			Object[] prefs = Utility.GetSharedPreference(context);
			String lang = prefs.length == AppConfig.PREFERENCE ? prefs[AppConfig.PREF_LANGUAGE_INDEX].toString() : Locale.getDefault().getLanguage();
			String xmlStr = "stats_async_".concat(lang);
			result = context.getResources().getString(Utility.GetResId(xmlStr, android.R.string.class));
		}
		return result;
	}
}
