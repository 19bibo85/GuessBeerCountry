package com.GuessBeerCountry.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Fragment.SettingF;
import com.GuessBeerCountry.Library.ComponentName;
import com.GuessBeerCountry.Library.Language;
import com.GuessBeerCountry.Library.Title;
import com.GuessBeerCountry.Library.Utility;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

/**
 * Created by Tosi Brandi on 18/03/2015.
 */
public class Setting extends SherlockActivity {
    private static String TAG = "Setting";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.actionbarsherlock.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this);
        Log.i(TAG, "Setting ACTIONBAR.");

        // Display the fragment as the main content.
        settingFragment();
        Log.i(TAG, "Displaying Fragment.");
    }

    private void settingFragment() {
        Intent intent = new Intent(this, SettingF.class);
        startActivity(intent);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.Setting, this);
        Log.i(TAG, "SETTING activity is started.");
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