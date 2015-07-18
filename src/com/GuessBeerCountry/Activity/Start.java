package com.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Repository.*;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;

import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class Start extends SherlockActivity {
    private final static String TAG = "Main";
    public static ScrollView ScrollView;
    public static TextView Easy;
    public static TextView Medium;
    public static TextView Hard;
    public static TextView AllPlates;
    public static TextView NoFault;
    public static TextView TimeLimits;
    public static TextView NoTimeLimits;
    private static DatabaseHelper databaseHelper;
    public static GameMode Mode;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.start);

            // Action Bar
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
            Utility.SetActionBar(actionBar, this);
            Log.i(TAG, "Setting ACTIONBAR.");

            ScrollView = (ScrollView) findViewById(R.id.scroll_view);
            TimeLimits = (TextView) findViewById(R.id.time_limit);
            TimeLimits.setTypeface(Utility.GetFont(this));
            NoTimeLimits = (TextView) findViewById(R.id.no_time_limit);
            NoTimeLimits.setTypeface(Utility.GetFont(this));

            // Get database helper
            databaseHelper = Utility.GetDataBaseHelper(this);

            // Easy
            Easy = (Button) findViewById(R.id.easy);
            Easy.setTypeface(Utility.GetFont(this));
            Easy.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start GAME activity EASY mode.");
                    Mode = GameMode.Easy;
                    gameActivity(GameMode.Easy, databaseHelper);
                }
            });
            Log.i(TAG, "Setting EASY button.");

            // Medium
            Medium = (Button) findViewById(R.id.medium);
            Medium.setTypeface(Utility.GetFont(this));
            Medium.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start GAME activity MEDIUM mode.");
                    Mode = GameMode.Medium;
                    gameActivity(GameMode.Medium, databaseHelper);
                }
            });
            Log.i(TAG, "Setting EASY button.");

            // Hard
            Hard = (Button) findViewById(R.id.hard);
            Hard.setTypeface(Utility.GetFont(this));
            Hard.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start GAME activity HARD mode.");
                    Mode = GameMode.Hard;
                    gameActivity(GameMode.Hard, databaseHelper);
                }
            });
            Log.i(TAG, "Setting HARD button.");

            // All Plates
            AllPlates = (Button) findViewById(R.id.all_plates);
            AllPlates.setTypeface(Utility.GetFont(this));
            AllPlates.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Log.i(TAG, "Start GAME activity ALL PLATES mode.");
                    Mode = GameMode.AllPlates;
                    gameActivity(GameMode.AllPlates, databaseHelper);
                }
            });
            Log.i(TAG, "Setting ALL PLATES button.");

            // No Fault
            NoFault = (Button) findViewById(R.id.no_fault);
            NoFault.setTypeface(Utility.GetFont(this));
            NoFault.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start GAME activity NO FAULTS mode.");
                    Mode = GameMode.NoFault;
                    gameActivity(GameMode.NoFault, databaseHelper);
                }
            });
            Log.i(TAG, "Setting NO FAULTS button.");

            // Title, language and theme
            Title.SetTitle(ComponentName.Start, actionBar, this);
            Log.i(TAG, "Setting Title.");
            Language.SetLanguage(ComponentName.Start, this);
            Log.i(TAG, "Setting Language.");
            Theme.SetTheme(ComponentName.Start, this);
            Log.i(TAG, "Setting Theme.");

            // Setting ad banner
            //IMBanner banner = (IMBanner) findViewById(R.id.adView);
            //banner.loadBanner();

        } catch (Exception ex) {
            Log.e(TAG, "Start exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "Setting Audio.");
        Utility.InitializeAudio(this);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.Start, this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Log.i(TAG, "Destroying Start activity.");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void gameActivity(GameMode mode, Object obj) {
        if (obj instanceof ArrayList<?>) {
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
            Log.i(TAG, "GAME activity is started.");
        }
    }
}