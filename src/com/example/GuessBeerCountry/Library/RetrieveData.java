package com.example.GuessBeerCountry.Library;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Activity.About;

import java.util.ArrayList;

/**
 * Created by elyvitvit on 15/10/2014.
 */
public class RetrieveData {

    public static void SetRetrieveData(ComponentName name, SherlockActivity activity) {
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
        SharedPreferences sharedPref = PreferenceManager
                .getDefaultSharedPreferences(activity.getBaseContext());

        if (sharedPref != null) {
            // Version
            About.Version.setText(sharedPref.getString(AppConfig.ABOUT_VERSION_DEF,
                    AppConfig.ABOUT_RETRIEVE_VERSION_DEF));

            // Developer
            About.Developer.setText(sharedPref.getString(AppConfig.ABOUT_DEVELOPER_DEF,
                    AppConfig.ABOUT_RETRIEVE_DEVELOPER_DEF));

            if (activity.getIntent() != null) {
                ArrayList<String> obj = activity.getIntent()
                        .getStringArrayListExtra(ComponentName.About.toString());
                if (obj != null &&
                        obj.size() == AppConfig.ABOUT_RETRIEVE_SIZE) {
                    About.Version.setText(obj.get(AppConfig.ABOUT_RETRIEVE_VERSION_INDEX)
                            + "." +
                            obj.get(AppConfig.ABOUT_RETRIEVE_BUILD_INDEX));
                    About.Developer.setText(obj.get(AppConfig.ABOUT_RETRIEVE_DEVELOPER_INDEX));
                }
            }
        }
    }
}
