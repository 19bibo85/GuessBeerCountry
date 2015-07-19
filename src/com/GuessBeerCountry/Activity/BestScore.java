package com.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Repository.*;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class BestScore extends SherlockActivity {
    private final static String TAG = "BestScore";
    public static ScrollView ScrollView;
    public static TextView BestScore;
    public static TextView Easy;
    public static TextView ScoreEasy;
    public static TextView RateEasy;
    public static TextView Medium;
    public static TextView ScoreMedium;
    public static TextView RateMedium;
    public static TextView Hard;
    public static TextView ScoreHard;
    public static TextView RateHard;
    public static TextView AllPlates;
    public static TextView ScoreAllPlates;
    public static TextView RateAllPlates;
    public static TextView NoFault;
    public static TextView ScoreNoFault;
    public static TextView RateNoFault;
    public static Button Stats;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.best_score);

            ActionBar actionBar = getSupportActionBar();
            Utility.SetActionBar(actionBar, this);
            Log.i(TAG, "Setting ACTIONBAR.");

            ScrollView = (ScrollView) findViewById(R.id.scroll_view);

            // Best Scores
            BestScore = (TextView) findViewById(R.id.best_score);
            BestScore.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting BEST SCORES view.");

            // Easy
            Easy = (TextView) findViewById(R.id.easy);
            ScoreEasy = (TextView) findViewById(R.id.score_easy);
            RateEasy = (TextView) findViewById(R.id.rate_easy);
            Log.i(TAG, "Setting EASY views.");
            ScoreEasy.setText(AppConfig.BEST_SCORE_SCORE_DEFAULT);
            RateEasy.setText(AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%"));
            Log.i(TAG, "Setting EASY default data.");
            Easy.setTypeface(Utility.GetFont(this));
            ScoreEasy.setTypeface(Utility.GetFont(this));
            RateEasy.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting EASY font.");

            // Medium
            Medium = (TextView) findViewById(R.id.medium);
            ScoreMedium = (TextView) findViewById(R.id.score_medium);
            RateMedium = (TextView) findViewById(R.id.rate_medium);
            Log.i(TAG, "Setting MEDIUM views.");
            ScoreMedium.setText(AppConfig.BEST_SCORE_SCORE_DEFAULT);
            RateMedium.setText(AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%"));
            Log.i(TAG, "Setting MEDIUM default data.");
            Medium.setTypeface(Utility.GetFont(this));
            ScoreMedium.setTypeface(Utility.GetFont(this));
            RateMedium.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting MEDIUM font.");

            // Hard
            Hard = (TextView) findViewById(R.id.hard);
            ScoreHard = (TextView) findViewById(R.id.score_hard);
            RateHard = (TextView) findViewById(R.id.rate_hard);
            Log.i(TAG, "Setting HARD views.");
            ScoreHard.setText(AppConfig.BEST_SCORE_SCORE_DEFAULT);
            RateHard.setText(AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%"));
            Log.i(TAG, "Setting HARD default data.");
            Hard.setTypeface(Utility.GetFont(this));
            ScoreHard.setTypeface(Utility.GetFont(this));
            RateHard.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting HARD font.");

            // AllPlates
            AllPlates = (TextView) findViewById(R.id.all_plates);
            ScoreAllPlates = (TextView) findViewById(R.id.score_all_plates);
            RateAllPlates = (TextView) findViewById(R.id.rate_all_plates);
            Log.i(TAG, "Setting ALL PLATES views.");
            ScoreAllPlates.setText(AppConfig.BEST_SCORE_SCORE_DEFAULT);
            RateAllPlates.setText(AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%"));
            Log.i(TAG, "Setting ALL PLATES default data.");
            AllPlates.setTypeface(Utility.GetFont(this));
            ScoreAllPlates.setTypeface(Utility.GetFont(this));
            RateAllPlates.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting ALL PLATES font.");

            // NoFault
            NoFault = (TextView) findViewById(R.id.no_fault);
            ScoreNoFault = (TextView) findViewById(R.id.score_no_fault);
            RateNoFault = (TextView) findViewById(R.id.rate_no_fault);
            Log.i(TAG, "Setting NO FAULT views.");
            ScoreNoFault.setText(AppConfig.BEST_SCORE_SCORE_DEFAULT);
            RateNoFault.setText(AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%"));
            Log.i(TAG, "Setting NO FAULT default data.");
            NoFault.setTypeface(Utility.GetFont(this));
            ScoreNoFault.setTypeface(Utility.GetFont(this));
            RateNoFault.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting NO FAULT font.");

            // Stats
            Stats = (Button) findViewById(R.id.stats);
            Stats.setTypeface(Utility.GetFont(this));
            Stats.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start STATS activity.");
                    statsActivity();
                }
            });
            Log.i(TAG, "Setting STATS button.");

            Title.SetTitle(ComponentName.BestScore, actionBar, this.getBaseContext());
            Log.i(TAG, "Setting Title.");
            Language.SetLanguage(ComponentName.BestScore, this);
            Log.i(TAG, "Setting Language.");
            Theme.SetTheme(ComponentName.BestScore, this.getBaseContext());
            Log.i(TAG, "Setting Theme.");

            // Add new ad
            //IMBanner banner = (IMBanner) findViewById(R.id.adView);
            //banner.loadBanner();
        } catch (Exception ex) {
            Log.e(TAG, "Main exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i(TAG, "Retriving Data.");
        RetrieveData.SetRetrieveData(ComponentName.BestScore, this);
        Log.i(TAG, "Setting Audio.");
        Utility.InitializeAudio(this);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.BestScore, this);
    }

    @Override
    protected void onPause(){
        super.onPause();
        // Save the preference
        Log.i(TAG, "Starting editing preferences.");
        CommitData.SetCommitData(ComponentName.BestScore, this);
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

    private void statsActivity() {
        Intent intent = new Intent(this, Stats.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
        Log.i(TAG, "MAIN Statistics activity is started.");
    }
}