package com.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Adapter.Beer;
import com.GuessBeerCountry.Model.BeerBase;
import com.GuessBeerCountry.Repository.AppConfig;
import com.GuessBeerCountry.Repository.ComponentName;
import com.GuessBeerCountry.Repository.Query;
import com.GuessBeerCountry.Repository.Title;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import java.util.ArrayList;

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
        	     
	        Object[] sharedPreference = Utility.GetSharedPreference(this);	        
	        if (sharedPreference.length == AppConfig.PREFERENCE) {
	        	ArrayList<BeerBase> beerList = Query.GetBeerList(sharedPreference[AppConfig.PREF_RANGE_INDEX].toString(), this);	            
	        	Log.i(TAG, "Populating Beer List.");
		            
	            final ListView beerListView = (ListView) findViewById(R.id.ListView);
	            beerListView.setAdapter(new Beer(this, this.getBaseContext(), beerList, R.layout.simple_inflate));
	            Log.i(TAG, "Getting the view from the list and attaching the strings in the list continents.");
	            
	            beerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
	                @Override
	                public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
	                    final BeerBase item = (BeerBase) parent.getItemAtPosition(position);
	                    listActivity(item);
	                }
	            });
	
	            Title.SetTitle(ComponentName.MainList, actionBar, this);
	            Log.i(TAG, "Setting Title.");
	        }
        } catch (Exception ex) {
            Log.e(TAG, "MainList exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Utility.InitializeAudio(this);
        Utility.SetTransition(ComponentName.MainList, this);
    }

    private void listActivity(BeerBase item) {
        Intent intent = new Intent(this, Beer.class);
        intent.putExtra("Key", item.GetName());
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
