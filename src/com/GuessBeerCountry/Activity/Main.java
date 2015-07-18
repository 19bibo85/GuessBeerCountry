package com.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Repository.*;
import com.GuessBeerCountry.Task.AboutAsync;
import com.GuessBeerCountry.Task.ScoreAsync;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class Main extends SherlockActivity {
    private final static String TAG = "Main";
    public static ScrollView ScrollView;
    public static Button Start;
    public static Button BestScore;
    public static Button List;
    public static Button Setting;
    private static String ThemeSelected;
    private static String LanguageSelected;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            ActionBar actionBar = getSupportActionBar();
            Utility.SetActionBar(actionBar, this);
            Log.i(TAG, "Setting ACTIONBAR.");

            ScrollView = (ScrollView) findViewById(R.id.scroll_view);

            // Start
            Start = (Button) findViewById(R.id.start);
            Start.setTypeface(Utility.GetFont(this));
            Start.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start START activity.");
                    startActivity();
                }
            });
            Log.i(TAG, "Setting START button.");

            // Best Scores
            BestScore = (Button) findViewById(R.id.best_score);
            BestScore.setTypeface(Utility.GetFont(this));
            BestScore.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Executing Best Score Task.");
                    executeAsyncTask(ComponentName.BestScore);
                }
            });
            Log.i(TAG, "Setting BEST SCORES button.");

            // List
            List = (Button) findViewById(R.id.list);
            List.setTypeface(Utility.GetFont(this));
            List.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Starting LIST activity.");
                    listActivity();
                }
            });
            Log.i(TAG, "Setting LIST button.");

            // Setting
            Setting = (Button) findViewById(R.id.setting);
            Setting.setTypeface(Utility.GetFont(this));
            Setting.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Starting SETTING activity.");
                    settingActivity();
                }
            });
            Log.i(TAG, "Setting SETTING button.");

            Title.SetTitle(ComponentName.Main, actionBar, this.getBaseContext());
            Log.i(TAG, "Setting Title.");
            Language.SetLanguage(ComponentName.Main, this);
            Log.i(TAG, "Setting Language.");
            Theme.SetTheme(ComponentName.Main, this.getBaseContext());
            Log.i(TAG, "Setting Theme.");

            // Set the theme and the language
            Object[] sharedPreference = Utility.GetSharedPreference(this);
            if (sharedPreference.length == AppConfig.PREFERENCE) {
                LanguageSelected = (String) sharedPreference[AppConfig.PREF_LANGUAGE_INDEX];
                ThemeSelected = (String) sharedPreference[AppConfig.PREF_THEME_INDEX];
                Log.i(TAG, "Language set on:" + LanguageSelected + ".");
                Log.i(TAG, "Theme set on:" + ThemeSelected + ".");
            }

            // Setting ad banner
            //IMBanner banner = (IMBanner) findViewById(R.id.adView);
            //banner.loadBanner();
        } catch (Exception ex) {
            Log.e(TAG, "Main exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
    }

    @Override
    public void onRestart() {
        super.onRestart();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "Setting Audio.");
        Utility.InitializeAudio(this);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.Main, this);

        // Set the theme and the language
        Object[] sharedPreference = Utility.GetSharedPreference(this);

        if (sharedPreference.length == AppConfig.PREFERENCE) {
            if (LanguageSelected != sharedPreference[AppConfig.PREF_LANGUAGE_INDEX]) {
                LanguageSelected = (String) sharedPreference[AppConfig.PREF_LANGUAGE_INDEX];
                Language.SetLanguage(ComponentName.Main, this);
                Log.i(TAG, "Language has been now set on: " + LanguageSelected + ".");
            }

            if (ThemeSelected != sharedPreference[AppConfig.PREF_THEME_INDEX]) {
                ThemeSelected = (String) sharedPreference[AppConfig.PREF_THEME_INDEX];
                Log.i(TAG, "Theme has been now set on: " + ThemeSelected  + ".");

                Intent intent = this.getIntent();
                intent.putExtra("NoTransition", true);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                this.startActivity(intent);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
        com.actionbarsherlock.view.MenuInflater inflater = getSupportMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
        Log.i(TAG, "Create option menu.");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
        // Take appropriate action for each action item click
        if (item.getItemId() == R.id.action_settings) {
            Log.i(TAG, "Start setting activity.");
            settingActivity();
            return true;
        } else if (item.getItemId() == R.id.action_about) {
            Log.i(TAG, "Executing About Task.");
            executeAsyncTask(ComponentName.About);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    private void executeAsyncTask(ComponentName name) {
        DatabaseHelper databaseHelper = Utility.GetDataBaseHelper(this);
        switch (name) {
            case BestScore:
                new ScoreAsync(this).execute(databaseHelper);
                Log.i(TAG, "Instancing Best Score Task.");
                break;
            case About:
                new AboutAsync(this).execute(databaseHelper);
                Log.i(TAG, "Instancing About Task.");
                break;
            default:
                break;
        }
    }

    private void startActivity() {
        Intent intent = new Intent(this, Start.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
        Log.i(TAG, "START activity is started.");
    }

    public void bestScoreActivity(Object obj) {
        if (obj instanceof ArrayList<?>){
            Intent intent = new Intent(this, BestScore.class);
            intent.putStringArrayListExtra("BestScore", (ArrayList<String>) obj);
            startActivity(intent);
            Log.i(TAG, "BEST SCORE activity is started.");
        }
    }

    private void listActivity() {
        Intent intent = new Intent(this, MainList.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
        Log.i(TAG, "LIST activity is started.");
    }

    private void settingActivity() {
        Intent intent = new Intent(this, Setting.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
        Log.i(TAG, "SETTING activity is started.");
    }

    public void aboutActivity(Object obj) {
        if (obj instanceof ArrayList<?>) {
            Intent intent = new Intent(this, About.class);
            intent.putStringArrayListExtra("About", (ArrayList<String>) obj);
            startActivity(intent);
            Log.i(TAG, "ABOUT activity is started.");
        }
    }
}