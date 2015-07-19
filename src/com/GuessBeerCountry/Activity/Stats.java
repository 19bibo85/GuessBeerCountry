package com.GuessBeerCountry.Activity;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Repository.CommitData;
import com.GuessBeerCountry.Repository.ComponentName;
import com.GuessBeerCountry.Repository.Language;
import com.GuessBeerCountry.Repository.RetrieveData;
import com.GuessBeerCountry.Repository.Theme;
import com.GuessBeerCountry.Repository.Title;
import com.GuessBeerCountry.Repository.Utility;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import android.widget.ScrollView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Stats extends SherlockActivity{
	private final static String TAG = "Stats";
	public static ScrollView ScrollView;
	public static TextView Stats;
	public static TextView LabAllBeers;
	public static TextView AllBeers;
	public static TextView LabCorrAns;
	public static TextView CorrAns;
	public static TextView LabWrgAns;
	public static TextView WrgAns;
	public static TextView LabMostBeer;
	public static TextView MostBeer;
	public static TextView LabLeastBeer;
	public static TextView LeastBeer;
	public static TextView LabMostLang;
	public static TextView MostLang;
	public static TextView LabLeastLang;
	public static TextView LeastLang;
	public static TextView LabMostTheme;
	public static TextView MostTheme;
	public static TextView LabLeastTheme;
	public static TextView LeastTheme;
	public static TextView LabMostRange;
	public static TextView MostRange;
	public static TextView LabLeastRange;
	public static TextView LeastRange;	
	public static Button Back;
	
	//private static final String DEFAULT_STRING = "0";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stats);
		
		ActionBar actionBar = getSupportActionBar();
        Utility.SetActionBar(actionBar, this);
        Log.i(TAG, "Setting ACTIONBAR.");
		
		ScrollView = (ScrollView) findViewById(R.id.scroll_view);
		
		Stats = (TextView) findViewById(R.id.stats);
		Stats.setTypeface(Utility.GetFont(this));
				
		// Total number of beers (ALL_BEERS)
		LabAllBeers = (TextView) findViewById(R.id.lab_all_beers);
		AllBeers = (TextView) findViewById(R.id.all_beers);
		LabAllBeers.setTypeface(Utility.GetFont(this));
		AllBeers.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting total number of beers.");
		
		// Total correct answer (CORR_ANS)
		LabCorrAns = (TextView) findViewById(R.id.lab_corr_ans);
		CorrAns = (TextView) findViewById(R.id.corr_ans);
		LabCorrAns.setTypeface(Utility.GetFont(this));
		CorrAns.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting total correct answer.");
		
		// Total wrong answer (WRG_ANS)
		LabWrgAns = (TextView) findViewById(R.id.lab_wrg_ans);
		WrgAns = (TextView) findViewById(R.id.wrg_ans);
		LabWrgAns.setTypeface(Utility.GetFont(this));
		WrgAns.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting total wrong answer.");
		
		// Most beer generated (MOST_BEER)
		LabMostBeer = (TextView) findViewById(R.id.lab_most_beer);
		MostBeer = (TextView) findViewById(R.id.most_beer);
		LabMostBeer.setTypeface(Utility.GetFont(this));
		MostBeer.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting most beer generated.");
		
		// Least beer generated (LEAST_BEER)
		LabLeastBeer = (TextView) findViewById(R.id.lab_least_beer);
		LeastBeer = (TextView) findViewById(R.id.least_beer);
		LabLeastBeer.setTypeface(Utility.GetFont(this));
		LeastBeer.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Seeting least beer generated.");
				
		// Most language chosen (MOST_LANG)
		LabMostLang = (TextView) findViewById(R.id.lab_most_lang);
		MostLang = (TextView) findViewById(R.id.most_lang);
		LabMostLang.setTypeface(Utility.GetFont(this));
		MostLang.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting most language chosen.");
		
		// Least language chosen (LEAST_LANG)
		LabLeastLang = (TextView) findViewById(R.id.lab_least_lang);
		LeastLang = (TextView) findViewById(R.id.least_lang);
		LabLeastLang.setTypeface(Utility.GetFont(this));
		LeastLang.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting least language chosen.");
		
		// Most theme chosen (MOST_THEME)
		LabMostTheme = (TextView) findViewById(R.id.lab_most_theme);
		MostTheme = (TextView) findViewById(R.id.most_theme);
		LabMostTheme.setTypeface(Utility.GetFont(this));
		MostTheme.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting most theme chosen.");
		
		// Least theme chosen (LEAST_THEME)
		LabLeastTheme = (TextView) findViewById(R.id.lab_least_theme);
		LeastTheme = (TextView) findViewById(R.id.least_theme);
		LabLeastTheme.setTypeface(Utility.GetFont(this));
		LeastTheme.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting least theme chosen.");
		
		// Most range chosen (MOST_RANGE)
		LabMostRange = (TextView) findViewById(R.id.lab_most_range);
		MostRange = (TextView) findViewById(R.id.most_range);
		LabMostRange.setTypeface(Utility.GetFont(this));
		MostRange.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting most range chosen.");
		
		// Least range chosen (LEAST_RANGE)
		LabLeastRange = (TextView) findViewById(R.id.lab_least_range);
		LeastRange = (TextView) findViewById(R.id.least_range);
		LabLeastRange.setTypeface(Utility.GetFont(this));
		LeastRange.setTypeface(Utility.GetFont(this));
		Log.i(TAG, "Setting least range chosen.");
		
		Back = (Button) findViewById(R.id.back);
		Back.setTypeface(Utility.GetFont(this));
		
		// Handling on Click
		Back.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Log.i(TAG, "End STATS activity.");
				finish();
			}
		});
		Log.i(TAG, "Setting BACK button.");
		
		Title.SetTitle(ComponentName.Stats, actionBar, this.getBaseContext());
		Log.i(TAG, "Setting Title.");
		Language.SetLanguage(ComponentName.Stats, this);
		Log.i(TAG, "Setting Language.");
		Theme.SetTheme(ComponentName.Stats, this.getBaseContext());
		Log.i(TAG, "Setting Theme.");
	}
	
	@Override
	public void onResume(){
		super.onResume();
		Log.i(TAG, "Retriving Data.");
        RetrieveData.SetRetrieveData(ComponentName.Stats, this);
        Log.i(TAG, "Setting Audio.");
        Utility.InitializeAudio(this);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.Stats, this);	
	}
	
	@Override
	protected void onPause(){
		super.onPause();	
		Log.i(TAG, "Starting editing preferences");
        CommitData.SetCommitData(ComponentName.Stats, this);
        Log.e(TAG, "Preferences edited.");
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
