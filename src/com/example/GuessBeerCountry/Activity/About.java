package com.example.GuessBeerCountry.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Library.*;
import com.example.GuessBeerCountry.R;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class About extends SherlockActivity {
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this);

        ScrollView = (ScrollView) findViewById(R.id.scroll_view);

        Logo = (ImageView) findViewById(R.id.logo);
        Utility.ScaleSizeForTablet(this, Logo);

        LabVersion = (TextView) findViewById(R.id.lab_version);
        LabVersion.setTypeface(Utility.GetFont(this));
        LabDeveloper = (TextView) findViewById(R.id.lab_developer);
        LabDeveloper.setTypeface(Utility.GetFont(this));
        LabAcknowledge = (TextView) findViewById(R.id.lab_acknowledge);
        LabAcknowledge.setTypeface(Utility.GetFont(this));

        Version = (TextView) findViewById(R.id.version);
        Version.setTypeface(Utility.GetFont(this));
        Developer = (TextView) findViewById(R.id.developer);
        Developer.setTypeface(Utility.GetFont(this));
        Acknowledge = (TextView) findViewById(R.id.acknowledge);
        Acknowledge.setTypeface(Utility.GetFont(this));

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
                mainActivity();
            }
        });

        Title.SetTitle(ComponentName.About, actionBar, this);
        Language.SetLanguage(ComponentName.About, this);
        Theme.SetTheme(ComponentName.About, this);
    }

    @Override
    public void onResume() {
        super.onResume();
        RetrieveData.SetRetrieveData(ComponentName.About, this);
        Utility.InitializeAudio(this);
        Utility.SetTransition(ComponentName.About, this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        CommitData.SetCommitData(ComponentName.About, this);
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