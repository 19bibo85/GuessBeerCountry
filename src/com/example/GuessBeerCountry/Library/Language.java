package com.example.GuessBeerCountry.Library;

import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockActivity;
import com.example.GuessBeerCountry.Activity.*;

import static com.example.GuessBeerCountry.R.array;


/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class Language {

    public static void SetLanguage(ComponentName name, SherlockActivity activity) {
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
        Object[] prefs = Utility.GetSharedPreference(activity);

        TextView loading = ((SplashScreen) activity).Loading;
        loading.setText(AppConfig.SPLASH_LOADING_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Splashscreen,
                    activity.getBaseContext(),
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.SPLASH_LANGUAGE_SIZE);

            if (strings != null)
                loading.setText(strings[AppConfig.SPLASH_LOADING_INDEX] + "...");
        }
    }

    private static void SetMain(SherlockActivity activity) {
        Object[] prefs = Utility.GetSharedPreference(activity);

        Button start = ((Main) activity).Start;
        start.setText(AppConfig.MAIN_START_DEF);

        Button bestScore = ((Main) activity).BestScore;
        bestScore.setText(AppConfig.MAIN_BEST_SCORE_DEF);

        Button list = ((Main) activity).List;
        list.setText(AppConfig.MAIN_LIST_DEF);

        Button setting = ((Main) activity).Setting;
        setting.setText(AppConfig.MAIN_SETTING_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Main,
                    activity.getBaseContext(),
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.MAIN_LANGUAGE_SIZE);
            if (strings != null) {
                start.setText(strings[AppConfig.MAIN_START_INDEX]);
                bestScore.setText(AppConfig.MAIN_BEST_SCORE_INDEX);
                list.setText(AppConfig.MAIN_LIST_INDEX);
                setting.setText(AppConfig.MAIN_SETTING_INDEX);
            }
        }
    }

    private static void SetStart(SherlockActivity activity) {
        Object[] prefs = Utility.GetSharedPreference(activity);

        TextView easy = ((Start) activity).Easy;
        easy.setText(AppConfig.START_EASY_DEF);

        TextView medium = ((Start) activity).Medium;
        medium.setText(AppConfig.START_MEDIUM_DEF);

        TextView hard = ((Start) activity).Hard;
        hard.setText(AppConfig.START_HARD_DEF);

        TextView allPlates = ((Start) activity).AllPlates;
        allPlates.setText(AppConfig.START_ALL_PLATES_DEF);

        TextView noFaults = ((Start) activity).NoFaults;
        noFaults.setText(AppConfig.START_NO_FAULTS_DEF);

        TextView timeLimits = ((Start) activity).TimeLimits;
        timeLimits.setText(AppConfig.START_TIME_LIMITS_DEF);

        TextView noTimeLimits = ((Start) activity).NoTimeLimits;
        noTimeLimits.setText(AppConfig.START_NO_TIME_LIMITS_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Start,
                    activity.getBaseContext(),
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.START_LANGUAGE_SIZE);
            if (strings != null) {
                easy.setText(strings[AppConfig.START_EASY_INDEX]);
                medium.setText(AppConfig.START_MEDIUM_INDEX);
                hard.setText(AppConfig.START_HARD_INDEX);
                allPlates.setText(AppConfig.START_ALL_PLATES_INDEX);
                noFaults.setText(AppConfig.START_NO_FAULTS_INDEX);
                timeLimits.setText(AppConfig.START_TIME_LIMITS_INDEX);
                noTimeLimits.setText(AppConfig.START_NO_TIME_LIMITS_INDEX);
            }
        }
    }

    private static void SetBestScore(SherlockActivity activity) {
        Object[] prefs = Utility.GetSharedPreference(activity);

        TextView easy = ((BestScore) activity).Easy;
        easy.setText(AppConfig.BEST_SCORE_EASY_DEF);

        TextView medium = ((BestScore) activity).Medium;
        medium.setText(AppConfig.BEST_SCORE_MEDIUM_DEF);

        TextView hard = ((BestScore) activity).Hard;
        hard.setText(AppConfig.BEST_SCORE_HARD_DEF);

        TextView allPlates = ((BestScore) activity).AllPlates;
        allPlates.setText(AppConfig.BEST_SCORE_ALL_PLATES_DEF);

        TextView noFaults = ((BestScore) activity).NoFaults;
        noFaults.setText(AppConfig.BEST_SCORE_NO_FAULTS_DEF);

        TextView bestScore = ((BestScore) activity).BestScore;
        bestScore.setText(AppConfig.BEST_SCORE_BEST_SCORE_DEF);

        TextView stats = ((BestScore) activity).Stats;
        stats.setText(AppConfig.BEST_SCORE_STATS_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Start,
                    activity.getBaseContext(),
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.BEST_SCORE_LANGUAGE_SIZE);
            if (strings != null) {
                easy.setText(AppConfig.BEST_SCORE_EASY_INDEX);
                medium.setText(AppConfig.BEST_SCORE_MEDIUM_INDEX);
                hard.setText(AppConfig.BEST_SCORE_HARD_INDEX);
                allPlates.setText(AppConfig.BEST_SCORE_ALL_PLATES_INDEX);
                noFaults.setText(AppConfig.BEST_SCORE_NO_FAULTS_INDEX);
                bestScore.setText(strings[AppConfig.BEST_SCORE_BEST_SCORE_INDEX]);
                stats.setText(AppConfig.BEST_SCORE_STATS_INDEX);
            }
        }
    }

    private static void SetScore(SherlockActivity activity) {
        Object[] prefs = Utility.GetSharedPreference(activity);

        TextView gameOver = ((Score) activity).GameOver;
        gameOver.setText(AppConfig.SCORE_GAME_OVER_DEF);

        TextView correctAnswer = ((Score) activity).CorrectAnswer;
        correctAnswer.setText(AppConfig.SCORE_CORRECT_ANSWER_DEF);

        TextView wrongAnswer = ((Score) activity).WrongAnswer;
        wrongAnswer.setText(AppConfig.SCORE_WRONG_ANSWER_DEF);

        TextView point = ((Score) activity).Point;
        point.setText(AppConfig.SCORE_POINT_DEF);

        TextView rate = ((Score) activity).Rate;
        rate.setText(AppConfig.SCORE_RATE_DEF);

        TextView back = ((Score) activity).Back;
        back.setText(AppConfig.SCORE_BACK_DEF);

        TextView review = ((Score) activity).Review;
        review.setText(AppConfig.SCORE_REVIEW_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Score,
                    activity.getBaseContext(),
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.SCORE_LANGUAGE_SIZE);
            if (strings != null) {
                gameOver.setText(AppConfig.SCORE_GAME_OVER_INDEX);
                correctAnswer.setText(AppConfig.SCORE_CORRECT_ANSWER_INDEX);
                wrongAnswer.setText(AppConfig.SCORE_WRONG_ANSWER_INDEX);
                point.setText(AppConfig.SCORE_POINT_INDEX);
                rate.setText(AppConfig.SCORE_RATE_INDEX);
                back.setText(strings[AppConfig.SCORE_BACK_INDEX]);
                review.setText(AppConfig.SCORE_REVIEW_INDEX);
            }
        }
    }

    private static void SetStats(Activity activity) {
    }

    private static void SetStatsList(SherlockActivity activity) {
        Object[] prefs = Utility.GetSharedPreference(activity);

        TextView general = ((StatsList) activity).General;
        general.setText(AppConfig.STATS_LIST_GENERAL_DEF);

        TextView time = ((StatsList) activity).Time;
        time.setText(AppConfig.STATS_LIST_TIME_DEF);

        TextView noTime = ((StatsList) activity).NoTime;
        noTime.setText(AppConfig.STATS_LIST_NO_TIME_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.StatsList,
                    activity.getBaseContext(),
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.STATS_LIST_LANGUAGE_SIZE);
            if (strings != null) {
                general.setText(AppConfig.STATS_LIST_GENERAL_INDEX);
                time.setText(AppConfig.STATS_LIST_TIME_INDEX);
                noTime.setText(AppConfig.STATS_LIST_NO_TIME_INDEX);
            }
        }
    }

    private static void SetAbout(SherlockActivity activity) {
        Object[] prefs = Utility.GetSharedPreference(activity);

        TextView version = ((About) activity).Version;
        version.setText(AppConfig.ABOUT_VERSION_DEF);

        TextView developer = ((About) activity).Developer;
        developer.setText(AppConfig.ABOUT_DEVELOPER_DEF);

        TextView acknowledge = ((About) activity).Acknowledge;
        acknowledge.setText(AppConfig.ABOUT_ACKNOWLEDGE_DEF);

        TextView back = ((About) activity).Back;
        back.setText(AppConfig.ABOUT_BACK_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.About,
                    activity.getBaseContext(),
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.ABOUT_LANGUAGE_SIZE);
            if (strings != null) {
                version.setText(AppConfig.ABOUT_VERSION_INDEX);
                developer.setText(AppConfig.ABOUT_DEVELOPER_INDEX);
                acknowledge.setText(AppConfig.ABOUT_ACKNOWLEDGE_INDEX);
                back.setText(AppConfig.ABOUT_BACK_INDEX);
            }
        }
    }

    public static String[] GetAlertStrings(SherlockActivity activity,
                                           ComponentName activityName,
                                           int activityStringNum) {

        Object[] prefs = Utility.GetSharedPreference(activity);

        if (prefs.length != AppConfig.PREFERENCE)
            return new String[]{AppConfig.SPLASH_ALERT_DEF_TITLE,
                    AppConfig.SPLASH_ALERT_DEF_MESSAGE,
                    AppConfig.SPLASH_ALERT_DEF_CONFIRM};

        return GetStringArray(activityName,
                activity.getBaseContext(),
                prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                activityStringNum);
    }

    public static String[] GetStringArray(ComponentName name,
                                          Context context,
                                          String language,
                                          int size) {
        String arrName = null;

        switch (name) {
            case Splashscreen:
                arrName = "splash_".concat(language);
                break;
            case SplashError:
                arrName = "server_error_".concat(language);
                break;
            case SplashAlert:
                arrName = "splash_alert_message_".concat(language);
                break;
            case Main:
                arrName = "main_".concat(language);
                break;
            case Start:
                arrName = "start_".concat(language);
                break;
            case BestScore:
                arrName = "best_score_".concat(language);
                break;
            case MainList:
                arrName = "main_list_".concat(language);
                break;
            case Setting:
                arrName = "setting_title_".concat(language);
                break;
            case SettingSummary:
                arrName = "setting_summary_".concat(language);
                break;
            case SettingClear:
                arrName = "clear_message_".concat(language);
                break;
            case Score:
                arrName = "score_".concat(language);
                break;
            case MainStats:
                arrName = "main_statistics_".concat(language);
                break;
            case Stats:
                arrName = "statistics_".concat(language);
                break;
            case About:
                arrName = "about_".concat(language);
            default:
                break;
        }

        String[] strArray = null;
        if (size != 0 && arrName != null) {
            strArray = context.getResources().getStringArray(Utility.GetResId(arrName, array.class));
            strArray = strArray.length != size ? null : strArray;
        }

        return strArray;
    }
}
