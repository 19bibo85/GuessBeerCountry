package com.GuessBeerCountry.Activity;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Adapter.Base;
import com.GuessBeerCountry.Repository.ComponentName;
import com.GuessBeerCountry.Repository.Query;
import com.GuessBeerCountry.Repository.Title;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class BeerList extends SherlockActivity{
	private final static String TAG = "BeerList";
	
	public void onCreate(Bundle savedInstanceState) {
		try{
			super.onCreate(savedInstanceState);
	        setContentView(R.layout.list);
	        
	        ActionBar actionBar = getSupportActionBar();
	        Utility.SetActionBar(actionBar, this);
	        Log.i(TAG, "Setting ACTIONBAR.");
	    	
	    	final ListView baseListView = (ListView) findViewById(R.id.ListView);
            baseListView.setAdapter(new Base(this, this.getBaseContext(), Query.GetBeerList(getIntent().getExtras().getString("Key"), this), R.layout.simple_inflate));
            Log.i(TAG, "Getting the view from the list and attaching the strings in the list continents.");
	    		    	
	    	Title.SetTitle(ComponentName.MainList, actionBar, this);
            Log.i(TAG, "Setting Title.");
			
		}  catch (Exception ex) {
            Log.e(TAG, "MainList exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
	}
	
	@Override
	public void onResume(){
		super.onResume();
        Utility.InitializeAudio(this);
        Utility.SetTransition(ComponentName.BeerList, this);
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
