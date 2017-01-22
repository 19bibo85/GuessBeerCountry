package com.GuessBeerCountry.Task;

import com.GuessBeerCountry.Activity.Option;
import com.GuessBeerCountry.Activity.StatsList;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Repository.Query;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class StatsAsync extends AsyncTask<DatabaseHelper, Void, Object>{
	private final static String TAG = "StatAsync";
	
	private Context context = null;
	private StatsList statsList = null;
	private Option dialogPreference = null;
	//private GameLayout gameLayout = null;
	private String imgId = null;
	private int answer = -1;
	private int gameModeId = -1;
		
	public StatsAsync(Context context, 
			//GameLayout gameLayout, 
			String imgId, int answer, int gameModeId){
		this.context = context;
		//this.gameLayout = gameLayout;
		this.imgId = imgId;
		this.answer = answer;
		this.gameModeId = gameModeId;
	}
	
	public StatsAsync(StatsList statsList, int gameModeId){
		this.statsList = statsList;
		this.gameModeId = gameModeId;
	}
	
	public StatsAsync(Option dialogPreference){
		this.dialogPreference = dialogPreference;
	}
	
	@Override
	protected Object doInBackground(DatabaseHelper... databaseHelper) {
		Object result = null;		
		//if(context != null && gameLayout != null && imgId != null && answer != -1 && gameModeId != -1){
		//	Log.i(TAG, "Add new statistics.");
		//	result = Query.AddStats(context, imgId, answer, gameModeId);
		//}else 
			if(statsList != null && databaseHelper != null && gameModeId != -1){
			Log.i(TAG, "Retrieve statistics.");
			result = Query.GetStats(statsList, gameModeId);
		}else if(dialogPreference != null){
			Log.i(TAG, "Delete statistics.");
			result = Query.DeleteStats(databaseHelper[0]);
		}
		return result;
	}
	
	@Override
	protected void onPostExecute(Object result) {
		super.onPostExecute(result);
		//if(gameLayout != null){
		//	gameLayout.setNumRowAdd(result);
		//}else 
			if(statsList != null){
			statsList.statsActivity(result);
		} else if(dialogPreference != null){
			dialogPreference.setNumRowStaDel(result);
		}
	}
}