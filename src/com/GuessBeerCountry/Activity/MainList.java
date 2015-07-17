package com.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Library.AppConfig;
import com.GuessBeerCountry.Library.ComponentName;
import com.GuessBeerCountry.Library.Language;
import com.GuessBeerCountry.Library.Query;
import com.GuessBeerCountry.Library.Title;
import com.GuessBeerCountry.Library.Utility;
import com.GuessBeerCountry.Model.Beer;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Alberto Tosi Brandi on 18/03/2015.
 */
public class MainList extends SherlockActivity {
	private final static String TAG = "MainList";
	
    public void onCreate(Bundle savedInstanceState) {
    	try{
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.list);
	
	        ActionBar actionBar = getSupportActionBar();
	        Utility.SetActionBar(actionBar, this);
	        Log.i(TAG, "Setting ACTIONBAR.");
        	     
	        DatabaseHelper databaseHelper = Utility.GetDataBaseHelper(this);
	        Log.i(TAG, "Getting Database Helper.");
	        
	        Object[] sharedPreference = Utility.GetSharedPreference(this);	        
	        if (sharedPreference.length == AppConfig.PREFERENCE) {
	        	ArrayList<Beer> beerList = Query.GetBeerList(sharedPreference[AppConfig.PREF_RANGE_INDEX].toString(), this);	            
	        	Log.i(TAG, "Populating Beer List.");
		            
	            final ListView beerListView = (ListView) findViewById(R.id.BeerListView);
	            beerListView.setAdapter(new BeerListAdapter(this, this.getBaseContext(), beerList, R.layout.stats_custom));
	            Log.i(TAG, "Getting the view from the list and attaching the strings in the list continents.");
	            
	            beerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
	                @Override
	                public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
	                    final Beer item = (Beer) parent.getItemAtPosition(position);
	                    listActivity(item);
	                }
	            });
	
	            Title.SetTitle(ComponentName.MainList, actionBar, this);
	            Log.i(TAG, "Setting Title.");
	        }
        } catch (Exception ex) {
            Log.e(TAG, "Main exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Utility.InitializeAudio(this);
        Utility.SetTransition(ComponentName.MainList, this);
    }

    private void listActivity(Beer item) {
        Intent intent = new Intent(this, BeerList.class);
        intent.putExtra("Key", item.getName());
        startActivity(intent);
    }    

    @Override
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
