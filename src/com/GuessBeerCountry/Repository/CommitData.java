package com.GuessBeerCountry.Repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.preference.PreferenceManager;

import com.GuessBeerCountry.Activity.About;
import com.GuessBeerCountry.Activity.BestScore;
import com.GuessBeerCountry.Activity.Score;
import com.GuessBeerCountry.Activity.Stats;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by Alberto Tosi Brandi on 19/10/2014.
 */
public class CommitData {

    private static SharedPreferences sharedPref = null;

    public static <T> void SetCommitData(ComponentName name, T activity) {
        switch (name) {
            case Splashscreen:
            	if(activity instanceof SherlockActivity)
            		SetSplashscreen((SherlockActivity) activity);            	
                break;
            case Main:
            	if(activity instanceof SherlockActivity)
            		SetMain((SherlockActivity) activity);
                break;
            case Start:
            	if(activity instanceof SherlockActivity)
            		SetStart((SherlockActivity)activity);
                break;
            case BestScore:
            	if(activity instanceof SherlockActivity)
            		SetBestScore((SherlockActivity)activity);
                break;
            case Score:
            	if(activity instanceof SherlockActivity)
            		SetScore((SherlockActivity)activity);
                break;
            case Stats:
            	if(activity instanceof SherlockActivity)
            		SetStats((SherlockActivity)activity);
                break;
            case StatsList:
            	if(activity instanceof SherlockActivity)
            		SetStatsList((SherlockActivity)activity);
                break;
            case About:
            	if(activity instanceof SherlockActivity)
            		SetAbout((SherlockActivity)activity);
                break;
            case Setting:
            	if(activity instanceof DialogPreference)
            		SetSetting((DialogPreference)activity);
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
    	sharedPref = GetSharedInstance(activity);
        SharedPreferences.Editor edit = sharedPref.edit();
		edit.putString(AppConfig.STATS_ALL_BEERS_LABEL_DEF, Stats.AllBeers.getText().toString());
		edit.putString(AppConfig.STATS_CORRECT_ANSWERS_LABEL_DEF, Stats.CorrAns.getText().toString());
		edit.putString(AppConfig.STATS_WRONG_ANSWERS_LABEL_DEF, Stats.WrgAns.getText().toString());
		edit.putString(AppConfig.STATS_MOST_BEER_LABEL_DEF, Stats.MostBeer.getText().toString());
		edit.putString(AppConfig.STATS_LEAST_BEER_LABEL_DEF, Stats.LeastBeer.getText().toString());
		edit.putString(AppConfig.STATS_MOST_LANG_LABEL_DEF, Stats.MostLang.getText().toString());
		edit.putString(AppConfig.STATS_LEAST_LANG_LABEL_DEF, Stats.LeastLang.getText().toString());
		edit.putString(AppConfig.STATS_MOST_THEME_LABEL_DEF, Stats.MostTheme.getText().toString());
		edit.putString(AppConfig.STATS_LEAST_THEME_LABEL_DEF, Stats.LeastTheme.getText().toString());
		edit.putString(AppConfig.STATS_MOST_RANGE_LABEL_DEF, Stats.MostRange.getText().toString());
		edit.putString(AppConfig.STATS_LEAST_RANGE_LABEL_DEF, Stats.LeastRange.getText().toString());
		edit.commit();
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
    
    private static void SetSetting(DialogPreference activity) {
        sharedPref = GetSharedInstance(activity.getContext());
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(PreferenceName.Language.toString(), AppConfig.PREF_LANGUAGE_DEF);
        edit.putString(PreferenceName.Theme.toString(), AppConfig.PREF_THEME_DEF);
        edit.putString(PreferenceName.Range.toString(), AppConfig.PREF_RANGE_DEF);
        edit.putBoolean(PreferenceName.Update.toString(), AppConfig.PREF_UPDATE_DEF);
        edit.putBoolean(PreferenceName.Sound.toString(), AppConfig.PREF_SOUND_DEF);
        edit.commit();
    }

    private static SharedPreferences GetSharedInstance(Context context){
        if(sharedPref == null)
            sharedPref = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPref;
    }
}
