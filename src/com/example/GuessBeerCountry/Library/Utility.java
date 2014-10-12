package com.example.GuessBeerCountry.Library;

import android.annotation.TargetApi;
import java.lang.reflect.Field;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.content.Context;
import android.content.res.Configuration;
import android.preference.PreferenceManager;
import android.widget.ImageView;

/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class Utility {

    public static Typeface GetFont(SherlockActivity activity){
        final String FONT_PATH = "font/handwritten.ttf";
        final AssetManager assets = activity.getResources().getAssets();
        return Typeface.createFromAsset(assets, FONT_PATH);
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

    public static Object[] GetSharedPreference(Context context){
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

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    public static void ScaleSizeForTablet(Context ctx, ImageView image){
        Configuration config = ctx.getResources().getConfiguration();
        if (config.smallestScreenWidthDp >= AppConfig.TABLET_SCREEN_WIDTH){
            image.setScaleX(AppConfig.TABLET_SCALE);
            image.setScaleY(AppConfig.TABLET_SCALE);
        }
    }
}
