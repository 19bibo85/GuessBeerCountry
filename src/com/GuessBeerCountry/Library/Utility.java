package com.GuessBeerCountry.Library;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.ImageView;

import com.GuessBeerCountry.Activity.SplashScreen;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class Utility {

    public static void SetActionBar(ActionBar actionBar, SherlockActivity activity) {

    }

    public static void SetActionBar(ActionBar actionBar, SherlockPreferenceActivity activity) {

    }

    public static void InitializeAudio(Activity activity) {

    }

    public static void SetAudio(SherlockActivity activity, SoundName audioEvent) {

    }

    public static void SetTransition(ComponentName name, Activity activity) {

    }

    // Get the font
    public static Typeface GetFont(SherlockActivity activity) {
        final AssetManager assets = activity.getResources().getAssets();
        return Typeface.createFromAsset(assets, AppConfig.FONT_PATH);
    }

    // Get the resource ID
    public static int GetResId(String variableName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(variableName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    // Getting the preference saved for language, theme, range, sound and update
    public static Object[] GetSharedPreference(Context context) {
        return new Object[]{
                PreferenceManager
                        .getDefaultSharedPreferences(context)
                        .getString(PreferenceName.Language.toString(),
                                AppConfig.PREF_LANGUAGE_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(context)
                        .getString(PreferenceName.Theme.toString(),
                                AppConfig.PREF_THEME_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(context)
                        .getString(PreferenceName.Range.toString(),
                                AppConfig.PREF_RANGE_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(context)
                        .getBoolean(PreferenceName.Sound.toString(),
                                AppConfig.PREF_SOUND_DEF),
                PreferenceManager
                        .getDefaultSharedPreferences(context)
                        .getBoolean(PreferenceName.Update.toString(),
                                AppConfig.PREF_UPDATE_DEF)
        };
    }

    // Set the scale of the image view based on the handset(smartphone or tablet)
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    public static void ScaleSizeForTablet(SherlockActivity activity, ImageView image) {
        Configuration config = activity.getBaseContext().getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= AppConfig.TABLET_SCREEN_WIDTH) {
            image.setScaleX(AppConfig.TABLET_SCALE);
            image.setScaleY(AppConfig.TABLET_SCALE);
        }
    }

    // Return the database helper
    public static <T> DatabaseHelper GetDataBaseHelper(Context context) {
        DatabaseHelper databaseHelper = SplashScreen.DatabaseHelper;
        if (databaseHelper == null)
            databaseHelper = new DatabaseHelper(context);
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

    // Fill an array with default values
    public static String[] FillDefaultVals(ComponentName name, String[] info, String defaultVal1, String defaultVal2){
        if(info != null && info.length > 0){
            switch(name)
            {
                case Stats:
                    for(int i=0; i < info.length; i++){
                        info[i] = i >= 0 && i <= 4 ? defaultVal1 : defaultVal2;
                    }
                    break;
                case BestScore:
                    for(int i=0; i < info.length; i++){
                        if(i%2 == 0)
                            info[i] = defaultVal1;
                        else
                            info[i] = defaultVal2;
                    }
                    break;
                default:
                    break;
            }

        }
        return info;
    }

    // Find the index position in array of the value selected
    public static int FindPosition(String[] array, String value){
        boolean isEqual = false;
        int result = -1;
        for(int i=0; i < array.length && !isEqual; i++){
            if(array[i].equals(value)){
                isEqual = true;
                result = i;
            }
        }
        return result;
    }    
    
    public static String SetImgId(String continent) {
        String imgID = "co_eur_001";
        final int LAST_CHAR = 3;
        if (!TextUtils.isEmpty(continent) && LAST_CHAR <= continent.length()) {
            imgID = "co_" + continent.substring(0, LAST_CHAR).toLowerCase(Locale.getDefault()) + "_001";
        }
        return imgID;
    }
}
