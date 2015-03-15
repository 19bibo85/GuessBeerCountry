package com.example.GuessBeerCountry.Library;

import android.annotation.TargetApi;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Activity.SplashScreen;
import com.example.GuessBeerCountry.Database.DatabaseHelper;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class Utility {

    public static void SetActionBar(ActionBar actionBar, SherlockActivity activity) {

    }

    public static void InitializeAudio(SherlockActivity activity) {

    }

    public static void SetTransition(ComponentName name, SherlockActivity activity) {

    }

    public static Typeface GetFont(SherlockActivity activity) {
        final AssetManager assets = activity.getResources().getAssets();
        return Typeface.createFromAsset(assets, AppConfig.FONT_PATH);
    }

    public static int GetResId(String variableName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(variableName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static Object[] GetSharedPreference(SherlockActivity activity) {
        return new Object[]{
                PreferenceManager
                        .getDefaultSharedPreferences(activity.getBaseContext())
                        .getString(PreferenceName.Language.toString(),
                                AppConfig.PREF_LANGUAGE_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(activity.getBaseContext())
                        .getString(PreferenceName.Theme.toString(),
                                AppConfig.PREF_THEME_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(activity.getBaseContext())
                        .getString(PreferenceName.Range.toString(),
                                AppConfig.PREF_RANGE_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(activity.getBaseContext())
                        .getBoolean(PreferenceName.Sound.toString(),
                                AppConfig.PREF_SOUND_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(activity.getBaseContext())
                        .getBoolean(PreferenceName.Update.toString(),
                                AppConfig.PREF_UPDATE_DEF)
        };
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    public static void ScaleSizeForTablet(SherlockActivity activity, ImageView image) {
        Configuration config = activity.getBaseContext().getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= AppConfig.TABLET_SCREEN_WIDTH) {
            image.setScaleX(AppConfig.TABLET_SCALE);
            image.setScaleY(AppConfig.TABLET_SCALE);
        }
    }

    // Return the database helper
    public static DatabaseHelper GetDataBaseHelper(SherlockActivity activity) {
        DatabaseHelper databaseHelper = SplashScreen.DatabaseHelper;
        if (databaseHelper == null)
            databaseHelper = new DatabaseHelper(activity);
        return databaseHelper;
    }

    // Copy array values to list
    public static ArrayList<String> CopyArrayToList(String[] info) {
        ArrayList<String> obj = new ArrayList<String>();
        if (info != null && info.length > 0) {
            for (int i = 0; i < info.length; i++) {
                obj.add(info[i]);
            }
        }
        return obj;
    }
}
