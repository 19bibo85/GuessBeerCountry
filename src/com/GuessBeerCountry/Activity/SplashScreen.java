package com.GuessBeerCountry.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.GuessBeerCountry.Library.AppConfig;
import com.GuessBeerCountry.Library.ComponentName;
import com.GuessBeerCountry.Library.Language;
import com.GuessBeerCountry.Library.Utility;
import com.GuessBeerCountry.Task.SplashAsync;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class SplashScreen extends SherlockActivity {
    public static TextView Loading;
    public static DatabaseHelper DatabaseHelper;
    private static ImageView logo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splashscreen);

            // Logo
            logo = (ImageView) findViewById(R.id.logo);
            Utility.ScaleSizeForTablet(this, logo);

            // Loading
            Loading = (TextView) findViewById(R.id.loading);
            Language.SetLanguage(ComponentName.Splashscreen, this);

            // Setting a new instance of Database
            DatabaseHelper = new DatabaseHelper(this);
            new SplashAsync(this).execute(DatabaseHelper);

        } catch (Exception ex) {
            showAlertMessage();
        }
    }

    private void showAlertMessage() {
        String[] message = Language.GetAlertStrings(this,
                ComponentName.Splashscreen,
                AppConfig.SPLASH_ALERT_MESSAGE);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(message[AppConfig.SPLASH_ALERT_TITLE_INDEX])
                .setMessage(message[AppConfig.SPLASH_ALERT_MESSAGE_INDEX])
                .setPositiveButton(message[AppConfig.SPLASH_ALERT_CONFIRM_INDEX], new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    // This is the callback for when your async task has finished
    public void onTaskFinished() {
        Utility.InitializeAudio(this);
        Intent intent = new Intent(SplashScreen.this, Main.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
        finish();
    }
}