package com.GuessBeerCountry.Activity;

import java.util.ArrayList;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Model.Review;
import com.GuessBeerCountry.Repository.ComponentName;
import com.GuessBeerCountry.Repository.Title;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class ReviewList extends SherlockActivity{
	private final static String TAG = "ReviewList";
	
	public void onCreate(Bundle savedInstanceState) {
		try{
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.list);
	        
	        ActionBar actionBar = getSupportActionBar();
	        Utility.SetActionBar(actionBar, this);
	        Log.i(TAG, "Setting ACTIONBAR.");
	        
	        ArrayList<Review> reviewList = Game.ReviewList;
	        Log.i(TAG, "Populating Review List.");
	        
	        final ListView reviewListView = (ListView) findViewById(R.id.ListView);
	        reviewListView.setAdapter(new com.GuessBeerCountry.Adapter.Review(this, this.getBaseContext(), reviewList));
	        Log.i(TAG, "Inflating list items.");
	        
	        Title.SetTitle(ComponentName.ReviewList, actionBar, this);
            Log.i(TAG, "Setting Title.");
		}catch (Exception ex) {
            Log.e(TAG, "ReviewList exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
   }
    
    @Override
	public void onResume(){
		super.onResume();
		Utility.InitializeAudio(this);
		Utility.SetTransition(ComponentName.ReviewList, this);
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
