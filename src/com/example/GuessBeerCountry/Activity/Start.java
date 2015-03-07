package com.example.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.example.GuessBeerCountry.Library.*;
import com.example.GuessBeerCountry.R;

import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class Start extends SherlockActivity {
    public static ScrollView ScrollView;
    public static TextView Easy;
    public static TextView Medium;
    public static TextView Hard;
    public static TextView AllPlates;
    public static TextView NoFault;
    public static TextView TimeLimits;
    public static TextView NoTimeLimits;
    private static DatabaseHelper databaseHelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.start);

            // Action Bar
            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
            Utility.SetActionBar(actionBar, this);

            ScrollView = (ScrollView) findViewById(R.id.scroll_view);
            TimeLimits = (TextView) findViewById(R.id.time_limit);
            TimeLimits.setTypeface(Utility.GetFont(this));
            NoTimeLimits = (TextView) findViewById(R.id.no_time_limit);
            NoTimeLimits.setTypeface(Utility.GetFont(this));

            // Easy
            Easy = (Button) findViewById(R.id.easy);
            Easy.setTypeface(Utility.GetFont(this));
            Easy.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    databaseHelper = Utility.GetDataBaseHelper(this);
                    gameActivity(GameMode.Easy, databaseHelper);
                }
            });

            // Medium
            Medium = (Button) findViewById(R.id.medium);
            Medium.setTypeface(Utility.GetFont(this));
            Medium.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    databaseHelper = Utility.GetDataBaseHelper(this);
                    gameActivity(GameMode.Medium, databaseHelper);
                }
            });

            // Hard
            Hard = (Button) findViewById(R.id.hard);
            Hard.setTypeface(Utility.GetFont(this));
            Hard.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    databaseHelper = Utility.GetDataBaseHelper(this);
                    gameActivity(GameMode.Hard, databaseHelper);
                }
            });

            // All Plates
            AllPlates = (Button) findViewById(R.id.all_plates);
            AllPlates.setTypeface(Utility.GetFont(this));
            AllPlates.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    databaseHelper = Utility.GetDataBaseHelper(this);
                    gameActivity(GameMode.AllPlates, databaseHelper);
                }
            });

            // No Fault
            NoFault = (Button) findViewById(R.id.no_fault);
            NoFault.setTypeface(Utility.GetFont(this));
            NoFault.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    databaseHelper = Utility.GetDataBaseHelper(this);
                    gameActivity(GameMode.NoFault, databaseHelper);
                }
            });

            // Title, language and theme
            Title.SetTitle(ComponentName.Start, actionBar, this);
            Language.SetLanguage(ComponentName.Start, this);
            Theme.SetTheme(ComponentName.Start, this);

            // Add new ad
            IMBanner banner = (IMBanner) findViewById(R.id.adView);
            banner.loadBanner();

        } catch (Exception ex) {

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Utility.InitializeAudio(this);
        Utility.SetTransition(ComponentName.Start, this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
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
        }
    }
}