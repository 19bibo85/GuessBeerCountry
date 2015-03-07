package com.example.GuessBeerCountry.Library;

import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by elyvitvit on 05/03/2015.
 */
public class Title {
    public static void SetTitle(ComponentName name, com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        switch (name) {
            case Main:
                SetMainTitle(actionBar, activity);
                break;
            case Start:
                SetStartTitle(actionBar, activity);
                break;
            case BestScore:
                SetBestScoreTitle(actionBar, activity);
                break;
            case Setting:
                SetSettingTitle(actionBar, activity);
                break;
            case Score:
                SetScoreTitle(actionBar, activity);
                break;
            case MainList:
                SetMainListTitle(actionBar, activity);
                break;
            case BeerList:
                SetBeerListTitle(actionBar, activity);
                break;
            case ReviewList:
                SetReviewListTitle(actionBar, activity);
                break;
            case Stats:
                SetStatsTitle(actionBar, activity);
                break;
            case StatsList:
                SetStatsListTitle(actionBar, activity);
                break;
            case Game:
                SetGameLayoutTitle(actionBar, activity);
            case About:
                SetAboutTitle(actionBar, activity);
            default:
                break;

        }
    }

    // Setting the theme colour and the localised test for the title bar in MainActivity
    private static void SetMainTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {

        Object[] prefs = Utility.GetSharedPreference(activity);
        if (prefs.length == AppConfig.PREFERENCE) {
            String theme = prefs[AppConfig.PREF_THEME_INDEX].toString();
            if (theme.equals(AppConfig.THEME_FIRST)) {
                actionBar.setBackgroundDrawable(activity.getResources().getDrawable(R.drawable.title_background_blue));
            } else if (theme.equals(AppConfig.THEME_SECOND)) {
                actionBar.setBackgroundDrawable(activity.getResources().getDrawable(R.drawable.title_background_black));
            } else if (theme.equals(AppConfig.THEME_THIRD)) {
                actionBar.setBackgroundDrawable(activity.getResources().getDrawable(R.drawable.title_background_grey));
            } else if (theme.equals(AppConfig.THEME_FOURTH)) {
                actionBar.setBackgroundDrawable(activity.getResources().getDrawable(R.drawable.title_background_orange));
            } else if (theme.equals(AppConfig.THEME_FIFTH)) {
                actionBar.setBackgroundDrawable(activity.getResources().getDrawable(R.drawable.title_background_purple));
            }
        }
    }

    // Setting the theme colour and the localised test for the title bar in StartActivity
    private static void SetStartTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in BestScoreActivity
    private static void SetBestScoreTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in SettingActivity
    private static void SetSettingTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in ScoreActivity
    private static void SetScoreTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in MainListActivity
    private static void SetMainListTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in ListPlateActivity
    private static void SetBeerListTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in ReviewActivity
    private static void SetReviewListTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in StatisticsActivity
    private static void SetStatsTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in MainStatisticsActivity
    private static void SetStatsListTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    // Setting the theme colour and the localised test for the title bar in GameLayout
    private static void SetGameLayoutTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }

    private static void SetAboutTitle(com.actionbarsherlock.app.ActionBar actionBar, SherlockActivity activity) {
        // Calling the the setting of the main title
        // since the text doesn't change and the colour is the same
        SetMainTitle(actionBar, activity);
    }
}
