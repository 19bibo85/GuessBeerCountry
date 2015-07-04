package com.GuessBeerCountry.Library;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.GuessBeerCountry.Activity.About;
import com.GuessBeerCountry.Activity.BestScore;
import com.GuessBeerCountry.Activity.Score;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by Alberto Tosi Brandi on 19/10/2014.
 */
public class CommitData {

    private static SharedPreferences sharedPref = null;

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
        sharedPref = GetSharedInstance(activity);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_EASY_DEF, BestScore.ScoreEasy.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_EASY_DEF, BestScore.RateEasy.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_MEDIUM_DEF, BestScore.ScoreMedium.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_MEDIUM_DEF, BestScore.RateMedium.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_HARD_DEF, BestScore.ScoreHard.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_HARD_DEF, BestScore.RateHard.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_ALL_PLATES_DEF, BestScore.ScoreAllPlates.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_ALL_PLATES_DEF,BestScore. RateAllPlates.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_NO_FAULT_DEF, BestScore.ScoreNoFault.getText().toString());
        edit.putString(AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_NO_FAULT_DEF, BestScore.RateNoFault.getText().toString());
        edit.commit();
    }

    private static void SetScore(SherlockActivity activity) {
        sharedPref = GetSharedInstance(activity);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(AppConfig.SCORE_CORRECT_ANSWER_DEF, Score.NumberCorrectAnswer.getText().toString());
        edit.putString(AppConfig.SCORE_WRONG_ANSWER_DEF, Score.NumberWrongAnswer.getText().toString());
        edit.putString(AppConfig.SCORE_POINT_DEF, Score.PointValue.getText().toString());
        edit.putString(AppConfig.SCORE_RATE_DEF, Score.RateValue.getText().toString());
        edit.commit();
    }

    private static void SetStats(SherlockActivity activity) {

    }

    private static void SetStatsList(SherlockActivity activity) {

    }

    private static void SetAbout(SherlockActivity activity) {
        sharedPref = GetSharedInstance(activity);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(AppConfig.ABOUT_VERSION_DEF, About.Version.getText().toString());
        edit.putString(AppConfig.ABOUT_DEVELOPER_DEF, About.Developer.getText().toString());
        edit.commit();
    }

    private static SharedPreferences GetSharedInstance(SherlockActivity activity){
        if(sharedPref == null)
            sharedPref = PreferenceManager.getDefaultSharedPreferences(activity.getBaseContext());
        return sharedPref;
    }
}
