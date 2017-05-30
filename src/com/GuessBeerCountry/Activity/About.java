package com.GuessBeerCountry.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Repository.*;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014
 */
public class About extends SherlockActivity {
    private static String TAG = "About2";
    public static ScrollView ScrollView;
    public static ImageView Logo;
    public static TextView LabVersion;
    public static TextView LabDeveloper;
    public static TextView LabAcknowledge;
    public static TextView Version;
    public static TextView Developer;
    public static TextView Acknowledge;
    public static TextView Back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.about);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
            Utility.SetActionBar(actionBar, this);
            Log.i(TAG, "Setting ACTIONBAR.");

            ScrollView = (ScrollView) findViewById(R.id.scroll_view);

            Logo = (ImageView) findViewById(R.id.logo);
            Utility.ScaleSizeForTablet(this, Logo);
            Log.i(TAG, "Scaling LOGO.");

            LabVersion = (TextView) findViewById(R.id.lab_version);
            LabVersion.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting LAB VERSION font.");
            LabDeveloper = (TextView) findViewById(R.id.lab_developer);
            LabDeveloper.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting LAB DEVELOPER font.");
            LabAcknowledge = (TextView) findViewById(R.id.lab_acknowledge);
            LabAcknowledge.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting LAB ACKNOWLEDGE font.");

            Version = (TextView) findViewById(R.id.version);
            Version.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting VERSION font.");
            Developer = (TextView) findViewById(R.id.developer);
            Developer.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting DEVELOPER font.");
            Acknowledge = (TextView) findViewById(R.id.acknowledge);
            Acknowledge.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting ACKNOWLEDGE font.");

            // Get the acknowledge
            Acknowledge.setText(Language
                    .GetAcknowledgeStrings(this,
                            ComponentName.Acknowledge,
                            AppConfig.ACKNOWLEDGE_LANGUAGE_SIZE)
                    [AppConfig.ACKNOWLEDGE_VERSION_INDEX]);

            Back = (Button) findViewById(R.id.back);
            Back.setTypeface(Utility.GetFont(this));
            Back.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start MAIN activity.");
                    mainActivity();
                }
            });
            Log.i(TAG, "Setting BACK button.");

            Title.SetTitle(ComponentName.About, actionBar, this);
            Log.i(TAG, "Setting Title.");
            Language.SetLanguage(ComponentName.About, this);
            Log.i(TAG, "Setting Language.");
            Theme.SetTheme(ComponentName.About, this);
            Log.i(TAG, "Setting Theme.");
        }catch(Exception ext){

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "Retriving Data.");
        RetrieveData.SetRetrieveData(ComponentName.About, this);
        Log.i(TAG, "Setting Audio.");
        Utility.InitializeAudio(this);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.About, this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Starting editing preferences");
        CommitData.SetCommitData(ComponentName.About, this);
        Log.e(TAG, "Preferences edited.");
    }

    private void mainActivity() {
        finish();
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