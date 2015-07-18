package com.GuessBeerCountry.Repository;

import com.GuessBeerCountry.R;

import android.content.Context;

/**
 * Created by Alberto Tosi Brandi on 05/03/2015.
 */
public class Title {
    public static void SetTitle(ComponentName name, com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        switch (name) {
            case Main:
                SetMainTitle(actionBar, context);
                break;
            case Start:
                SetStartTitle(actionBar, context);
                break;
            case BestScore:
                SetBestScoreTitle(actionBar, context);
                break;
            case Setting:
                SetSettingTitle(actionBar, context);
                break;
            case Score:
                SetScoreTitle(actionBar, context);
                break;
            case MainList:
                SetMainListTitle(actionBar, context);
                break;
            case BeerList:
                SetBeerListTitle(actionBar, context);
                break;
            case ReviewList:
                SetReviewListTitle(actionBar, context);
                break;
            case Stats:
                SetStatsTitle(actionBar, context);
                break;
            case StatsList:
                SetStatsListTitle(actionBar, context);
                break;
            case Game:
                SetGameLayoutTitle(actionBar, context);
            case About:
                SetAboutTitle(actionBar, context);
            default:
                break;

        }
    }

    // Setting the theme colour and the localised test for the title bar in MainActivity
    private static void SetMainTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {

        Object[] prefs = Utility.GetSharedPreference(context);
        if (prefs.length == AppConfig.PREFERENCE) {
            String theme = prefs[AppConfig.PREF_THEME_INDEX].toString();
            if (theme.equals(AppConfig.THEME_FIRST)) {
                actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_lager));
            } else if (theme.equals(AppConfig.THEME_SECOND)) {
                actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_ale));
            } else if (theme.equals(AppConfig.THEME_THIRD)) {
                actionBar.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.title_background_weiss));
            }
        }
    }

    // Setting the theme colour and the localised test for the title bar in StartActivity
    private static void SetStartTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in BestScoreActivity
    private static void SetBestScoreTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in SettingActivity
    private static void SetSettingTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in ScoreActivity
    private static void SetScoreTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in MainListActivity
    private static void SetMainListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in ListPlateActivity
    private static void SetBeerListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in ReviewActivity
    private static void SetReviewListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in StatisticsActivity
    private static void SetStatsTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in MainStatisticsActivity
    private static void SetStatsListTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    // Setting the theme colour and the localised test for the title bar in GameLayout
    private static void SetGameLayoutTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }

    private static void SetAboutTitle(com.actionbarsherlock.app.ActionBar actionBar, Context context) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, context);
    }
}
