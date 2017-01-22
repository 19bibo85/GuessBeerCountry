package com.GuessBeerCountry.Repository;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.ImageView;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Activity.SplashScreen;
import com.GuessBeerCountry.Database.DatabaseHelper;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class Utility {

    public static <T> void SetActionBar(ActionBar actionBar,  Context context) {    	
    	if(actionBar != null){
			actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_lager));
			actionBar.setDisplayShowTitleEnabled(false);
			actionBar.setDisplayUseLogoEnabled(true);
			actionBar.setLogo(context.getResources().getDrawable(R.drawable.logo));
		}
    }

    public static void InitializeAudio(Context context) {
    	if(answer == null)
			answer = MediaPlayer.create(context, R.raw.shwink);
    	//GameUtility.CreateAudio(context);
    }

    private static MediaPlayer answer = null;
    public static void SetAudio(Context context, boolean isActive, int audioEvent) {
    	if (answer != null && isActive) {
			int audioID = -1;
			switch (audioEvent) {
			case 0:
				audioID = R.raw.shwink;
				break;
			case 1:
				audioID = R.raw.applause;
				break;
			}

			if (audioID != -1) {
				try {
					answer.reset();
					AssetFileDescriptor afd = context.getResources().openRawResourceFd(audioID);
					if (afd == null) return;
					answer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
					afd.close();
					answer.prepare();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (answer.isPlaying())
					answer.seekTo(0);
				else
					answer.start();
			}
		}
    }
    
    public static void SetTransition(ComponentName componentName, Activity source) {
    	if(source == null) return;
    	Context context = source.getBaseContext();
    	
    	// Get Shared Preferences
    	Object[] sharedPreference = GetSharedPreference(context);
    	if(sharedPreference == null || (sharedPreference.length != AppConfig.PREFERENCE)) return;
    	    	
    	// Set Audio
    	SetAudio(context, (boolean) sharedPreference[AppConfig.PREF_SOUND_INDEX], 0);    	
		Intent intent = source.getIntent();
		if(intent == null) return;
		
		// Get Flag
		Bundle extras = intent.getExtras();
		if(extras == null) return;
				
		// In case no transition flag is triggered do not perform any animation
		Object isUpdating = intent.getExtras().get("NoTransition");
		if(isUpdating != null && (Boolean)isUpdating){
			CleanIntent(intent, "NoTransition", isUpdating);
			return;					
		}
		
		// Get the flag to check if user is entering in a new activity or is leaving an activity
		Object isEntering = intent.getExtras().get(componentName.toString());
		if(isEntering == null) isEntering = intent.getStringArrayListExtra(componentName.toString());
		if(isEntering == null) return;
		
		// Set the animation to enter or to leave
		int enterAnim = (Boolean) isEntering || isEntering != null ? R.anim.animation_enter_foward : R.anim.animation_enter_back;
		int exitAnim = (Boolean) isEntering || isEntering != null ? R.anim.animation_leave_foward : R.anim.animation_leave_back;
		
		// In case the component name is main change the animation
		if(componentName == ComponentName.Main){
			enterAnim = (Boolean) isEntering || isEntering != null ? R.layout.fadein : R.anim.animation_enter_back;
			exitAnim = (Boolean) isEntering || isEntering != null ? R.layout.fadeout : R.anim.animation_leave_back;
		}	
		
		CleanIntent(intent, componentName.toString(), isEntering);
		source.overridePendingTransition(enterAnim, exitAnim);
    }
    
    private static void CleanIntent(Intent intent, String componentName, Object transactionType){
    	if((Boolean) transactionType != null)
    		intent.putExtra(componentName, false);
    	else
    		intent.putStringArrayListExtra(componentName, null);
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
