package com.GuessBeerCountry.Repository;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.GuessBeerCountry.Activity.About;
import com.GuessBeerCountry.Activity.BestScore;
import com.GuessBeerCountry.Activity.Score;
import com.GuessBeerCountry.Activity.Stats;
import com.actionbarsherlock.app.SherlockActivity;

import java.util.ArrayList;

/**
 * Created by Alberto Tosi Brandi on 15/10/2014.
 */
public class RetrieveData {

    private static SharedPreferences sharedPref = null;

    public static boolean SetRetrieveData(ComponentName name, SherlockActivity activity) {
        boolean result = false;
        switch (name) {
            case Splashscreen:
                result = SetSplashscreen(activity);
                break;
            case Main:
                result = SetMain(activity);
                break;
            case Start:
                result = SetStart(activity);
                break;
            case BestScore:
                result = SetBestScore(activity);
                break;
            case Score:
                result = SetScore(activity);
                break;
            case Stats:
                result = SetStats(activity);
                break;
            case StatsList:
                result = SetStatsList(activity);
                break;
            case About:
                result = SetAbout(activity);
                break;
            default:
                break;
        }
        return result;
    }

    private static boolean SetSplashscreen(SherlockActivity activity) {
        return true;
    }

    private static boolean SetMain(SherlockActivity activity) {
        return true;
    }

    private static boolean SetStart(SherlockActivity activity) {
        return true;
    }

    private static boolean SetBestScore(SherlockActivity activity) {
        sharedPref = GetSharedInstance(activity);

        if (sharedPref != null) {

            BestScore.ScoreEasy.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_EASY_DEF,
                    AppConfig.BEST_SCORE_SCORE_DEFAULT));
            BestScore.RateEasy.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_EASY_DEF,
                    AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%")));
            BestScore.ScoreMedium.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_MEDIUM_DEF,
                    AppConfig.BEST_SCORE_SCORE_DEFAULT));
            BestScore.RateMedium.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_MEDIUM_DEF,
                    AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%")));
            BestScore.ScoreHard.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_HARD_DEF,
                    AppConfig.BEST_SCORE_SCORE_DEFAULT));
            BestScore.RateHard.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_HARD_DEF,
                    AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%")));
            BestScore.ScoreAllPlates.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_ALL_PLATES_DEF,
                    AppConfig.BEST_SCORE_SCORE_DEFAULT));
            BestScore.RateAllPlates.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_ALL_PLATES_DEF,
                    AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%")));
            BestScore.ScoreNoFault.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_SCORE + AppConfig.BEST_SCORE_NO_FAULT_DEF,
                    AppConfig.BEST_SCORE_SCORE_DEFAULT));
            BestScore.RateNoFault.setText(sharedPref.getString(
                    AppConfig.BEST_SCORE_PREFIX_RATE + AppConfig.BEST_SCORE_NO_FAULT_DEF,
                    AppConfig.BEST_SCORE_RATE_DEFAULT.concat("%")));

            if(activity.getIntent() != null){
                ArrayList<String> obj = activity.getIntent().getStringArrayListExtra(ComponentName.BestScore.toString());
                if(obj != null && obj.size() == AppConfig.BEST_SCORE_RETRIEVE_SIZE){
                    BestScore.ScoreEasy.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_EASY_SCORE_INDEX));
                    BestScore.RateEasy.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_EASY_RATE_INDEX).concat("%"));
                    BestScore.ScoreMedium.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_MEDIUM_SCORE_INDEX));
                    BestScore.RateMedium.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_MEDIUM_RATE_INDEX).concat("%"));
                    BestScore.ScoreHard.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_HARD_SCORE_INDEX));
                    BestScore.RateHard.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_HARD_RATE_INDEX).concat("%"));
                    BestScore.ScoreAllPlates.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_ALL_PLATES_SCORE_INDEX));
                    BestScore.RateAllPlates.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_ALL_PLATES_RATE_INDEX).concat("%"));
                    BestScore.ScoreNoFault.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_NO_FAULT_SCORE_INDEX));
                    BestScore.RateNoFault.setText(obj.get(AppConfig.BEST_SCORE_RETRIEVE_NO_FAULT_RATE_INDEX).concat("%"));
                }
            }
        }
        return true;
    }

    private static boolean SetScore(SherlockActivity activity) {
        boolean result = false;
        sharedPref = GetSharedInstance(activity);

        if (sharedPref != null) {
            // Correct Answer
            Score.NumberCorrectAnswer.setText(sharedPref.getString(
                    AppConfig.SCORE_CORRECT_ANSWER_DEF,
                    AppConfig.SCORE_DEFAULT_VALUE));

            // Wrong Answer
            Score.NumberWrongAnswer.setText(sharedPref.getString(
                    AppConfig.SCORE_WRONG_ANSWER_DEF,
                    AppConfig.SCORE_DEFAULT_VALUE));

            // Point
            Score.PointValue.setText(sharedPref.getString(
                    AppConfig.SCORE_POINT_DEF,
                    AppConfig.SCORE_DEFAULT_VALUE));

            // Rate
            Score.RateValue.setText(sharedPref.getString(
                    AppConfig.SCORE_RATE_DEF,
                    AppConfig.SCORE_DEFAULT_VALUE.concat("%")));

            if (activity.getIntent() != null) {
                ArrayList<String> obj = activity.getIntent()
                        .getStringArrayListExtra(ComponentName.Score.toString());

                if (obj != null && obj.size() == AppConfig.SCORE_RETRIEVE_SIZE) {
                    Score.NumberCorrectAnswer.setText(AppConfig.SCORE_RETRIEVE_CORRECT_INDEX);
                    Score.NumberWrongAnswer.setText(AppConfig.SCORE_RETRIEVE_WRONG_INDEX);
                    Score.PointValue.setText(AppConfig.SCORE_RETRIEVE_POINT_INDEX);
                    Score.RateValue.setText(AppConfig.SCORE_RETRIEVE_RATE_INDEX );
                    if (obj.get(AppConfig.SCORE_RETRIEVE_NEW_INDEX ).equals("NEW"))
                        result = true;
                }
            }
        }
        return result;
    }

    private static boolean SetStats(SherlockActivity activity) {
    	
    	sharedPref = GetSharedInstance(activity);

        if (sharedPref != null) {
        	Stats.AllBeers.setText(sharedPref.getString(AppConfig.STATS_ALL_BEERS_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
        	
    		Stats.CorrAns.setText(sharedPref.getString(AppConfig.STATS_CORRECT_ANSWERS_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.WrgAns.setText(sharedPref.getString(AppConfig.STATS_WRONG_ANSWERS_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.MostBeer.setText(sharedPref.getString(AppConfig.STATS_MOST_BEER_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.LeastBeer.setText(sharedPref.getString(AppConfig.STATS_LEAST_BEER_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.MostLang.setText(sharedPref.getString(AppConfig.STATS_MOST_LANG_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.LeastLang.setText(sharedPref.getString(AppConfig.STATS_LEAST_LANG_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.MostTheme.setText(sharedPref.getString(AppConfig.STATS_MOST_THEME_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.LeastTheme.setText(sharedPref.getString(AppConfig.STATS_LEAST_THEME_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.MostRange.setText(sharedPref.getString(AppConfig.STATS_MOST_RANGE_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		Stats.LeastRange.setText(sharedPref.getString(AppConfig.STATS_LEAST_RANGE_LABEL_DEF, 
        			AppConfig.STATS_DEFAULT_VALUE));
    		
    		if (activity.getIntent() != null) {
                ArrayList<String> obj = activity.getIntent()
                        .getStringArrayListExtra(ComponentName.Stats.toString());
                if (obj != null &&
                        obj.size() == AppConfig.STATS_RETRIEVE_SIZE) {
                	Stats.AllBeers.setText(obj.get(AppConfig.STATS_RETRIEVE_ALL_BEERS_INDEX));
                	Stats.CorrAns.setText(obj.get(AppConfig.STATS_RETRIEVE_CORRECT_ANSWERS_INDEX));
                	Stats.WrgAns.setText(obj.get(AppConfig.STATS_RETRIEVE_WRONG_ANSWERS_INDEX));
                	Stats.MostBeer.setText(obj.get(AppConfig.STATS_RETRIEVE_MOST_BEER_INDEX));
                	Stats.LeastBeer.setText(obj.get(AppConfig.STATS_RETRIEVE_LEAST_BEER_INDEX));
                	Stats.MostLang.setText(obj.get(AppConfig.STATS_RETRIEVE_MOST_LANG_INDEX));
                	Stats.LeastLang.setText(obj.get(AppConfig.STATS_RETRIEVE_LEAST_LANG_INDEX));
                	Stats.MostTheme.setText(obj.get(AppConfig.STATS_RETRIEVE_MOST_THEME_INDEX));
                	Stats.LeastTheme.setText(obj.get(AppConfig.STATS_RETRIEVE_LEAST_THEME_INDEX));
                	Stats.MostRange.setText(obj.get(AppConfig.STATS_RETRIEVE_MOST_RANGE_INDEX));
                	Stats.LeastRange.setText(obj.get(AppConfig.STATS_RETRIEVE_LEAST_RANGE_INDEX));
                }
            }
        }
    	
        return true;
    }

    private static boolean SetStatsList(SherlockActivity activity) {
        return true;
    }

    private static boolean SetAbout(SherlockActivity activity) {
        sharedPref = GetSharedInstance(activity);

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
        return true;
    }

    private static SharedPreferences GetSharedInstance(SherlockActivity activity){
        if(sharedPref == null)
            sharedPref = PreferenceManager.getDefaultSharedPreferences(activity.getBaseContext());
        return sharedPref;
    }
}