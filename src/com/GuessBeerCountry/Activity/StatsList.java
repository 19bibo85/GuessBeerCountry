package com.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Adapter.Base;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Repository.AppConfig;
import com.GuessBeerCountry.Repository.ComponentName;
import com.GuessBeerCountry.Repository.Language;
import com.GuessBeerCountry.Repository.Title;
import com.GuessBeerCountry.Repository.Utility;
import com.GuessBeerCountry.Task.ScoreAsync;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class StatsList extends SherlockActivity {
	private final static String TAG = "StatsList";
	
	public static String GameGeneralName;
	public static String GameTimeName;
	public static String GameNoTimeName;
	
    public static TextView General;
    public static TextView Time;
    public static TextView NoTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	try
    	{
    		super.onCreate(savedInstanceState);
    		setContentView(R.layout.list);
        
		    ActionBar actionBar = getSupportActionBar();
		    Utility.SetActionBar(actionBar, this);
		    Log.i(TAG, "Setting ACTIONBAR.");
	        
	        // Adding the object to the list to display
		    ArrayList<com.GuessBeerCountry.Model.Base> baseList = new ArrayList<com.GuessBeerCountry.Model.Base>();
	        baseList.add(new com.GuessBeerCountry.Model.Base(AppConfig.STATS_LIST_GENERAL_INDEX, 
	        					  GameGeneralName, 
	        					  null, 
	        					  AppConfig.STATS_LIST_GENERAL_IMG));
	        baseList.add(new com.GuessBeerCountry.Model.Base(AppConfig.STATS_LIST_TIME_INDEX, 
	        				      GameTimeName, 
	        				      null, 
	        				      AppConfig.STATS_LIST_TIME_IMG));
	        baseList.add(new com.GuessBeerCountry.Model.Base(AppConfig.STATS_LIST_NO_TIME_INDEX, 
	        					  GameNoTimeName, 
	        					  null, 
	        					  AppConfig.STATS_LIST_NO_TIME_IMG));
	        Log.i(TAG, "Populating Stats List.");
	        
			// Getting the view from the list and attaching the strings in the list continents
	        final ListView baseListView = (ListView) findViewById(R.id.ListView);
	        baseListView.setAdapter(new Base(this, this.getBaseContext(), baseList, R.layout.simple_inflate));
	        Log.i(TAG, "Getting the view from the list and attaching the strings in the list continents.");
	        
	        baseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	          @Override
	          public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
	        	  final com.GuessBeerCountry.Model.Base item = (com.GuessBeerCountry.Model.Base) parent.getItemAtPosition(position);
	        	  int itemID = item != null ? item.GetId() : -1;
	        	  
	        	  DatabaseHelper databaseHelper = Utility.GetDataBaseHelper(getBaseContext());
	        	  new StatsAsync(this, itemID).execute(databaseHelper);
	              Log.i(TAG, "Instancing Stats Task.");
	          	}
	        });
	        
	        Title.SetTitle(ComponentName.MainList, actionBar, this);
            Log.i(TAG, "Setting Title.");
            
            Language.SetLanguage(ComponentName.MainList, this);
            Log.i(TAG, "Setting Language.");
    	}catch(Exception ex){
    		 Log.e(TAG, "MainList exception.");
             Log.e(TAG, "Message: " + ex.getMessage());    		
    	}
    }
    
    @Override
	public void onResume(){
		super.onResume();
		Log.i(TAG, "Setting Audio.");
		Utility.InitializeAudio(this);
		Log.i(TAG, "Setting Transition.");
		Utility.SetTransition(ComponentName.StatsList, this);
	}
   
   @SuppressWarnings("unchecked")
   public void statsActivity(Object obj){
	   if(obj instanceof ArrayList<?>){
		   Intent intent = new Intent(this, Stats.class);
		   intent.putStringArrayListExtra(ComponentName.StatsList.toString(), (ArrayList<String>) obj);
		   startActivity(intent);
		   overridePendingTransition(R.anim.animation_enter_foward, R.anim.animation_leave_foward);
		   Log.i(TAG, "STATS activity is started.");
	   }
   }
   
   @Override
	public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
	    switch (item.getItemId()) {
	    case android.R.id.home:
	        finish();
	        return true;
	    default: return super.onOptionsItemSelected(item);  
	    }
	}
}