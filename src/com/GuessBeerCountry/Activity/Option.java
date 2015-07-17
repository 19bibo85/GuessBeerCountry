package com.GuessBeerCountry.Activity;

import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Library.CommitData;
import com.GuessBeerCountry.Library.ComponentName;
import com.GuessBeerCountry.Library.Utility;
import com.GuessBeerCountry.Task.ScoreAsync;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.util.Log;

public class Option extends DialogPreference{
	private final static String TAG = "Option";
	private int numRowScoDel = -1;
	private int numRowStaDel = -1;
	
	public Option(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {    	
        super.onDialogClosed(positiveResult);
        this.setPersistent(false);
        
        if(!positiveResult) return;
         
    	CommitData.SetCommitData(ComponentName.Setting, this);
    	Log.i(TAG, "Setting all the default setting values.");        	    	
    	DatabaseHelper databaseHelper = Utility.GetDataBaseHelper(this.getContext());        
		new ScoreAsync(this).execute(databaseHelper);
    	Log.i(TAG, "Delete Score from DB."); 			
		new StatsAsync(this).execute(databaseHelper);
		Log.i(TAG, "Delete Stats from DB.");
    }
    
    public void setNumRowScoDel(Object del){
    	numRowScoDel = (Integer)del;
    }
    
    public int getNumRowScoDel(){
    	return numRowScoDel;
    }
    
    public void setNumRowStaDel(Object del){
    	numRowStaDel = (Integer)del;
    }
    
    public int getNumRowStaDel(){
    	return numRowStaDel;
    }
}
