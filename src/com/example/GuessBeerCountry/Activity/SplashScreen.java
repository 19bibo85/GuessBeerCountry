package com.example.GuessBeerCountry.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Library.AppConfig;
import com.example.GuessBeerCountry.Library.ComponentName;
import com.example.GuessBeerCountry.Library.Language;
import com.example.GuessBeerCountry.Library.Utility;
import com.example.GuessBeerCountry.R;

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
            DatabaseHelper = new NewDatabaseHelper(this.getBaseContext());
            new LoadingTaskConn(this.getApplicationContext(), this).execute(DatabaseHelper);

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
}