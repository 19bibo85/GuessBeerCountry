package com.GuessBeerCountry.Fragment;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.util.Log;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Library.*;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

/**
 * Created by Alberto Tosi Brandi on 22/05/2015.
 */
public class Setting extends SherlockPreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static String TAG = "Setting";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Setting the action bar and the template
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        Utility.SetActionBar(actionBar, this);
        Log.i(TAG, "Setting ACTIONBAR.");

        addPreferencesFromResource(R.xml.preferences);

        // Setting the language and the action bar color
        Title.SetTitle(ComponentName.Setting, actionBar, this);
        Log.i(TAG, "Setting Title.");
        Language.SetLanguage(ComponentName.Setting, this);
        Log.i(TAG, "Setting Language.");

        // Based on the language selected setting the list of themes and ranges
        String language = (String) Utility.GetSharedPreference(this.getBaseContext())[0];
        setEntries(language, PreferenceName.Theme);
        Log.i(TAG, "Setting Theme entries.");
        setEntries(language, PreferenceName.Range);
        Log.i(TAG, "Setting Range entries.");
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "Setting Audio.");
        Utility.InitializeAudio(this);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.Setting, this);
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        Log.i(TAG, "Registering shared preference.");
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onPause() {
        super.onPause();
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        Log.i(TAG, "Unregister shared preference.");
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        if (key.equals(PreferenceName.Language.toString())) {

            // In case the language is changed setting the list of themes and ranges
            String language = sharedPreferences.getString(key, "en");
            setEntries(language, PreferenceName.Theme);
            setEntries(language, PreferenceName.Range);
            Log.i(TAG, "Setting the list of themes and ranges.");

            // Setting the language of setting main activity
            Language.SetLanguage(ComponentName.Setting, this);
            Log.i(TAG, "Unregistering shared preference.");

        } else if (key.equals(PreferenceName.Theme.toString())) {
            // Setting the summary for the Theme
            setSummary(sharedPreferences, PreferenceName.Theme);
            restartSettingActivity();
            Log.i(TAG, "Setting the summary for the Theme.");

        } else if (key.equals(PreferenceName.Range.toString())) {
            // Setting the summary for the Range
            setSummary(sharedPreferences, PreferenceName.Range);
            Log.i(TAG, "Setting the summary for the Range.");

        } else if (key.equals(PreferenceName.Update.toString())) {
            // Setting the summary for Update
            setSummary(sharedPreferences, PreferenceName.Update);
            Log.i(TAG, "Setting the summary for Update.");

        } else if (key.equals(PreferenceName.Sound.toString())) {
            // Setting the summary for Sound
            setSummary(sharedPreferences, PreferenceName.Sound);
            Log.i(TAG, "Setting the summary for Sound.");

        }
    }

    private void restartSettingActivity(){
        Intent intent = this.getIntent();
        intent.putExtra("NoTransition", true);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        this.startActivity(intent);
    }

    @SuppressWarnings("deprecation")
    private void setEntries(String language, PreferenceName name){
        String arrName = null;
        String key = null;

        switch(name)
        {
            case Theme:
                arrName = "setting_theme_".concat(language);
                key = "pref_theme";
                break;
            case Range:
                arrName = "setting_range_".concat(language);
                key = "pref_range";
                break;
            default:
                break;
        }

        if(arrName != null && key != null){
            String[] results = this.getBaseContext().getResources().getStringArray(Utility.GetResId(arrName, R.array.class));
            ListPreference lpt = (ListPreference)findPreference(key);
            lpt.setEntries(results);
        }
    }

    private void setSummary(SharedPreferences sharedPreferences, PreferenceName key){
        final int SIZE = 6;
        String language = sharedPreferences.getString(PreferenceName.Language.toString(), "en");
        String[] strTitle = Language.GetStringArray(SettingName.Title, this.getBaseContext(), language, SIZE);
        String[] strSummary = Language.GetStringArray(SettingName.Summary, this.getBaseContext(), language, SIZE);
        Language.SetTitleAndSummary(this, strTitle, strSummary, key, this.getBaseContext(), language);
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
