package com.example.GuessBeerCountry.Library;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Activity.About;

/**
 * Created by elyvitvit on 19/10/2014.
 */
public class CommitData {

    public static void SetCommitData(ComponentName name, SherlockActivity activity) {
        switch (name) {
            case Splashscreen:
                SetSplashscreen(activity);
                break;
            case Main:
                SetMain(activity);
                break;
            case Start:
                SetStart(activity);
                break;
            case BestScore:
                SetBestScore(activity);
                break;
            case Score:
                SetScore(activity);
                break;
            case Stats:
                SetStats(activity);
                break;
            case StatsList:
                SetStatsList(activity);
                break;
            case About:
                SetAbout(activity);
                break;
            default:
                break;
        }
    }

    private static void SetSplashscreen(SherlockActivity activity) {

    }

    private static void SetMain(SherlockActivity activity) {

    }

    private static void SetStart(SherlockActivity activity) {

    }

    private static void SetBestScore(SherlockActivity activity) {

    }

    private static void SetScore(SherlockActivity activity) {

    }

    private static void SetStats(SherlockActivity activity) {

    }

    private static void SetStatsList(SherlockActivity activity) {

    }

    private static void SetAbout(SherlockActivity activity) {
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(activity.getBaseContext());
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(AppConfig.ABOUT_VERSION_DEF,
                About.Version.getText().toString());
        edit.putString(AppConfig.ABOUT_DEVELOPER_DEF,
                About.Developer.getText().toString());
        edit.commit();
    }
}
