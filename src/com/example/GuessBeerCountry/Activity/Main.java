package com.example.GuessBeerCountry.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Database.DatabaseHelper;
import com.example.GuessBeerCountry.Library.*;
import com.example.GuessBeerCountry.R;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class Main extends SherlockActivity {
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

            ScrollView = (ScrollView) findViewById(R.id.scroll_view);

            // Start
            Start = (Button) findViewById(R.id.start);
            Start.setTypeface(Utility.GetFont(this));
            Start.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    startActivity();
                }
            });

            // Best Scores
            BestScore = (Button) findViewById(R.id.best_score);
            BestScore.setTypeface(Utility.GetFont(this));
            BestScore.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    executeAsyncTask(ComponentName.BestScore);
                }
            });

            // List
            List = (Button) findViewById(R.id.list);
            List.setTypeface(Utility.GetFont(this));
            List.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    listActivity();
                }
            });

            // Setting
            Setting = (Button) findViewById(R.id.setting);
            Setting.setTypeface(Utility.GetFont(this));
            Setting.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    settingActivity();
                }
            });

            Title.SetTitle(ComponentName.Main, actionBar, this);
            Language.SetLanguage(ComponentName.Main, this);
            Theme.SetTheme(ComponentName.Main, this);

            // Set the theme and the language
            Object[] sharedPreference = Utility.GetSharedPreference(this);
            if (sharedPreference.length == AppConfig.PREFERENCE) {
                LanguageSelected = (String) sharedPreference[AppConfig.PREF_LANGUAGE_INDEX];
                ThemeSelected = (String) sharedPreference[AppConfig.PREF_THEME_INDEX];
            }

            //IMBanner banner = (IMBanner) findViewById(R.id.adView);
            //banner.loadBanner();
        }catch(Exception e){

        }
    }

    @Override
    public void onRestart(){
        super.onRestart();
    }

    @Override
    public void onResume(){
        super.onResume();
        Utility.InitializeAudio(this);
        Utility.SetTransition(ComponentName.Main, this);

        // Set the theme and the language
        Object[] sharedPreference = Utility.GetSharedPreference(this);

        if(sharedPreference.length == AppConfig.PREFERENCE)
        {
            if(LanguageSelected != sharedPreference[AppConfig.PREF_LANGUAGE_INDEX])
            {
                LanguageSelected = (String) sharedPreference[AppConfig.PREF_LANGUAGE_INDEX];
                Language.SetLanguage(ComponentName.Main, this);
            }

            if(ThemeSelected != sharedPreference[AppConfig.PREF_THEME_INDEX])
            {
                ThemeSelected = (String) sharedPreference[AppConfig.PREF_THEME_INDEX];
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
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
        // Take appropriate action for each action item click
        if(item.getItemId() == R.id.action_settings){
            settingActivity();
            return true;
        }else if(item.getItemId() == R.id.action_about){
            executeAsyncTask(ComponentName.About);
            return true;
        }else{
            return super.onOptionsItemSelected(item);
        }
    }

    private void executeAsyncTask(ComponentName name){
        DatabaseHelper databaseHelper = Utility.GetDataBaseHelper(this);
        switch(name){
            case BestScore:
                new ScoreAsync(this).execute(databaseHelper);
                break;
            case About:
                new AboutAsync(this).execute(databaseHelper);
                break;
            default:
                break;
        }
    }

    private void startActivity() {
        Intent intent = new Intent(this, Start.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
    }

    private void listActivity() {
        Intent intent = new Intent(this, MainList.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
    }

    private void settingActivity() {
        Intent intent = new Intent(this, SettingFragment.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
    }
}