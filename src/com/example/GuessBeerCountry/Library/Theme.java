package com.example.GuessBeerCountry.Library;

import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Activity.*;

/**
 * Created by elyvitvit on 05/03/2015.
 */
public class Theme {

    public static void SetTheme(ComponentName name, SherlockActivity activity) {
        switch (name) {
            case Main:
                SetMainTheme(activity);
                break;
            case Start:
                SetStartTheme(activity);
                break;
            case BestScore:
                SetBestScoreTheme(activity);
                break;
            case Setting:
                SetSettingTheme(activity);
                break;
            case Score:
                SetScoreTheme(activity);
                break;
            case Stats:
                SetStatsTheme(activity);
                break;
            case Game:
                SetGameLayoutTheme(activity);
                break;
            case About:
                SetAboutTheme(activity);
                break;
            default:
                break;

        }
    }

    private static int[] SetTheme(SherlockActivity activity) {
        int[] appThemeColor = new int[]{0, 0};

        Object[] prefs = Utility.GetSharedPreference(activity);
        if (prefs.length == AppConfig.PREFERENCE) {
            String theme = prefs[AppConfig.PREF_THEME_INDEX].toString();

            if (theme.equals(AppConfig.THEME_FIRST)) {
                appThemeColor[0] = R.drawable.background_001;
                appThemeColor[1] = R.drawable.button_blue;
            } else if (theme.equals(AppConfig.THEME_FIRST)) {
                appThemeColor[0] = R.drawable.background_002;
                appThemeColor[1] = R.drawable.button_black;
            } else if (theme.equals(AppConfig.THEME_FIRST)) {
                appThemeColor[0] = R.drawable.background_003;
                appThemeColor[1] = R.drawable.button_grey;
            } else if (theme.equals(AppConfig.THEME_FIRST)) {
                appThemeColor[0] = R.drawable.background_004;
                appThemeColor[1] = R.drawable.button_orange;
            } else if (theme.equals(AppConfig.THEME_FIRST)) {
                appThemeColor[0] = R.drawable.background_005;
                appThemeColor[1] = R.drawable.button_purple;
            }
        }

        return appThemeColor;
    }

    // Setting the theme colour for each button and background in MainActivity
    private static void SetMainTheme(SherlockActivity activity) {
        int[] appThemeColor = SetTheme(activity);
        if (appThemeColor.length == AppConfig.THEME_SIZE) {
            Main.ScrollView.setBackgroundResource(appThemeColor[AppConfig.THEME_BACKGROUND]);
            Main.Start.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Main.BestScore.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Main.List.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Main.Setting.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
        }
    }

    // Setting the theme colour for each button and background in StartActivity
    private static void SetStartTheme(SherlockActivity activity) {
        int[] appThemeColor = SetTheme(activity);
        if (appThemeColor.length == AppConfig.THEME_SIZE) {
            Start.ScrollView.setBackgroundResource(appThemeColor[AppConfig.THEME_BACKGROUND]);
            Start.Easy.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Start.Medium.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Start.Hard.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Start.AllPlates.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Start.NoFault.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
        }
    }

    // Setting the theme colour for each button and background in BestScoreActivity
    private static void SetBestScoreTheme(SherlockActivity activity) {
        int[] appThemeColor = SetTheme(activity);
        if (appThemeColor.length == AppConfig.THEME_SIZE) {
            BestScore.ScrollView.setBackgroundResource(appThemeColor[AppConfig.THEME_BACKGROUND]);
            BestScore.Stats.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
        }
    }

    // Setting the theme colour for each button and background in SettingActivity
    private static void SetSettingTheme(SherlockActivity activity) {
    }

    // Setting the theme colour for each button and background in ScoreActivity
    private static void SetScoreTheme(SherlockActivity activity) {
        int[] appThemeColor = SetTheme(activity);
        if (appThemeColor.length == AppConfig.THEME_SIZE) {
            Score.ScrollView.setBackgroundResource(appThemeColor[AppConfig.THEME_BACKGROUND]);
            Score.Back.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
            Score.Review.setBackgroundResource(appThemeColor[AppConfig.THEME_BUTTON]);
        }
    }

    // Setting the theme colour for each button and background in BestScoreActivity
    private static void SetStatsTheme(SherlockActivity activity) {
        int[] appThemeColor = SetTheme(activity);
        if (appThemeColor.length == AppConfig.THEME_SIZE) {
            Statistics.Back.setBackgroundResource(appThemeColor[1]);
        }
    }

    // Setting the theme colour for each button and background in GameLayout
    private static void SetGameLayoutTheme(SherlockActivity activity) {
        int[] appThemeColor = SetTheme(activity);
        if (appThemeColor.length == AppConfig.THEME_SIZE) {
            Game.ScrollView.setBackgroundResource(appThemeColor[AppConfig.THEME_BACKGROUND]);
            Game.Button1.setBackgroundResource(appThemeColor[1]);
            Game.Button2.setBackgroundResource(appThemeColor[1]);
            Game.Button3.setBackgroundResource(appThemeColor[1]);
            Game.Button4.setBackgroundResource(appThemeColor[1]);
        }
    }

    private static void SetAboutTheme(SherlockActivity activity) {
        int[] appThemeColor = SetTheme(activity);
        if (appThemeColor.length == AppConfig.THEME_SIZE) {
            About.Back.setBackgroundResource(appThemeColor[1]);
        }
    }
}
