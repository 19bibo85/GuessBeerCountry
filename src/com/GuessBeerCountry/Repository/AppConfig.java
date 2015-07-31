package com.GuessBeerCountry.Repository;

import java.util.Locale;

/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class AppConfig {
    // TABLET
    public static final int TABLET_SCREEN_WIDTH = 600;
    public static final float TABLET_SCALE = 1.3f;

    // PREFERENCE
    public static final int PREFERENCE = 5;
    // Preference index
    public static final int PREF_LANGUAGE_INDEX = 0;
    public static final String PREF_LANGUAGE_DEF = Locale.getDefault().getLanguage();
    public static final int PREF_THEME_INDEX = 1;
    public static final String PREF_THEME_DEF = "Theme 1";
    public static final int PREF_RANGE_INDEX = 2;
    public static final String PREF_RANGE_DEF = "Europe";
    public static final int PREF_UPDATE_INDEX = 3;
    public static final boolean PREF_UPDATE_DEF = true;
    public static final int PREF_SOUND_INDEX = 4;
    public static final boolean PREF_SOUND_DEF = true;

    // THEME
    public static final String THEME_FIRST = "Theme 1";
    public static final String THEME_SECOND = "Theme 2";
    public static final String THEME_THIRD = "Theme 3";
    public static final int THEME_SIZE = 2;
    public static final int THEME_BACKGROUND = 0;
    public static final int THEME_BUTTON = 1;

    // SPLASH SCREEN ALERT
    public static final int SPLASH_ALERT_MESSAGE = 3;
    // Title index and name
    public static final int SPLASH_ALERT_TITLE_INDEX = 0;
    public static final String SPLASH_ALERT_DEF_TITLE = "Title";
    // Message index and name
    public static final int SPLASH_ALERT_MESSAGE_INDEX = 1;
    public static final String SPLASH_ALERT_DEF_MESSAGE = "Message";
    // Confirm index and name
    public static final int SPLASH_ALERT_CONFIRM_INDEX = 2;
    public static final String SPLASH_ALERT_DEF_CONFIRM = "ok";

    // SPLASH SCREEN
    public static final int SPLASH_LANGUAGE_SIZE = 1;
    // Loading index and name
    public static final int SPLASH_LOADING_INDEX = 0;
    public static final String SPLASH_LOADING_DEF = "Loading...";

    // SERVER ERROR
    public static final int SERVER_ERROR_LANGUAGE_SIZE = 8;

    // MAIN
    public static final int MAIN_LANGUAGE_SIZE = 4;
    // Start index and name
    public static final int MAIN_START_INDEX = 0;
    public static final String MAIN_START_DEF = "Start";
    // Best scores index and name
    public static final int MAIN_BEST_SCORE_INDEX = 1;
    public static final String MAIN_BEST_SCORE_DEF = "Best Scores";
    // List index and name
    public static final int MAIN_LIST_INDEX = 2;
    public static final String MAIN_LIST_DEF = "List";
    // Best scores index and name
    public static final int MAIN_SETTING_INDEX = 3;
    public static final String MAIN_SETTING_DEF = "Setting";

    // START
    public static final int START_LANGUAGE_SIZE = 7;
    // Easy index and name
    public static final int START_EASY_INDEX = 0;
    public static final String START_EASY_DEF = "Easy";
    // Medium index and name
    public static final int START_MEDIUM_INDEX = 1;
    public static final String START_MEDIUM_DEF = "Medium";
    // Hard index and name
    public static final int START_HARD_INDEX = 2;
    public static final String START_HARD_DEF = "Hard";
    // All Plates scores index and name
    public static final int START_ALL_PLATES_INDEX = 3;
    public static final String START_ALL_PLATES_DEF = "All Plates";
    // No Faults scores index and name
    public static final int START_NO_FAULTS_INDEX = 4;
    public static final String START_NO_FAULTS_DEF = "No Faults";
    // Start Time Limits index and name
    public static final int START_TIME_LIMITS_INDEX = 5;
    public static final String START_TIME_LIMITS_DEF = "Start Time Limits";
    // Start No Time Limits index and name
    public static final int START_NO_TIME_LIMITS_INDEX = 6;
    public static final String START_NO_TIME_LIMITS_DEF = "Start No Time Limits";

    // BEST SCORES
    public static final int BEST_SCORE_LANGUAGE_SIZE = 7;
    // Easy index and name
    public static final int BEST_SCORE_EASY_INDEX = 0;
    public static final String BEST_SCORE_EASY_DEF = "Easy";
    // Medium index and name
    public static final int BEST_SCORE_MEDIUM_INDEX = 1;
    public static final String BEST_SCORE_MEDIUM_DEF = "Medium";
    // Hard index and name
    public static final int BEST_SCORE_HARD_INDEX = 2;
    public static final String BEST_SCORE_HARD_DEF = "Hard";
    // All Plates scores index and name
    public static final int BEST_SCORE_ALL_PLATES_INDEX = 3;
    public static final String BEST_SCORE_ALL_PLATES_DEF = "All Plates";
    // No Faults scores index and name
    public static final int BEST_SCORE_NO_FAULT_INDEX = 4;
    public static final String BEST_SCORE_NO_FAULT_DEF = "No Faults";
    // Start Time Limits index and name
    public static final int BEST_SCORE_BEST_SCORE_INDEX = 5;
    public static final String BEST_SCORE_BEST_SCORE_DEF = "Best Scores";
    // Best Scores index and name
    public static final int BEST_SCORE_STATS_INDEX = 6;
    public static final String BEST_SCORE_STATS_DEF = "Stats";
    // Default score and rate value
    public static final String BEST_SCORE_SCORE_DEFAULT = "0";
    public static final String BEST_SCORE_RATE_DEFAULT = "0";
    // Prefix score and rate
    public static final String BEST_SCORE_PREFIX_SCORE = "Score";
    public static final String BEST_SCORE_PREFIX_RATE = "Rate";
    // Retrieve
    public static final int BEST_SCORE_RETRIEVE_SIZE = 10;
    // Easy Score index
    public static final int BEST_SCORE_RETRIEVE_EASY_SCORE_INDEX = 0;
    // Easy Rate index
    public static final int BEST_SCORE_RETRIEVE_EASY_RATE_INDEX = 1;
    // Medium score index
    public static final int BEST_SCORE_RETRIEVE_MEDIUM_SCORE_INDEX = 2;
    // Medium rate index
    public static final int BEST_SCORE_RETRIEVE_MEDIUM_RATE_INDEX = 3;
    // Hard score index
    public static final int BEST_SCORE_RETRIEVE_HARD_SCORE_INDEX = 4;
    // Hard rate index
    public static final int BEST_SCORE_RETRIEVE_HARD_RATE_INDEX = 5;
    // All plates score index
    public static final int BEST_SCORE_RETRIEVE_ALL_PLATES_SCORE_INDEX = 6;
    // All plates rate index
    public static final int BEST_SCORE_RETRIEVE_ALL_PLATES_RATE_INDEX = 7;
    // No fault score index
    public static final int BEST_SCORE_RETRIEVE_NO_FAULT_SCORE_INDEX = 8;
    // No fault rate index
    public static final int BEST_SCORE_RETRIEVE_NO_FAULT_RATE_INDEX = 9;
    // Default game mode
    public static final int BEST_SCORE_GAME_MODE_DEFAULT = -1;

    // SCORES
    public static final int SCORE_LANGUAGE_SIZE = 7;
    // Game Over index and name
    public static final int SCORE_GAME_OVER_INDEX = 0;
    public static final String SCORE_GAME_OVER_DEF = "Game Over";
    // Correct Answer index and name
    public static final int SCORE_CORRECT_ANSWER_INDEX = 1;
    public static final String SCORE_CORRECT_ANSWER_DEF = "Correct Answer";
    // Wrong Answer index and name
    public static final int SCORE_WRONG_ANSWER_INDEX = 2;
    public static final String SCORE_WRONG_ANSWER_DEF = "Wrong Answer";
    // Point scores index and name
    public static final int SCORE_POINT_INDEX = 3;
    public static final String SCORE_POINT_DEF = "Point";
    // No Faults scores index and name
    public static final int SCORE_RATE_INDEX = 4;
    public static final String SCORE_RATE_DEF = "Rate";
    // Start Time Limits index and name
    public static final int SCORE_BACK_INDEX = 5;
    public static final String SCORE_BACK_DEF = "Back";
    // Best Scores index and name
    public static final int SCORE_REVIEW_INDEX = 6;
    public static final String SCORE_REVIEW_DEF = "Review";
    // Default score value
    public static final String SCORE_DEFAULT_VALUE = "0";
    // Retrieve
    public static final int SCORE_RETRIEVE_SIZE = 5;
    // Correct answer index
    public static final int SCORE_RETRIEVE_CORRECT_INDEX = 0;
    // Wrong answer index
    public static final int SCORE_RETRIEVE_WRONG_INDEX = 1;
    // Point index
    public static final int SCORE_RETRIEVE_POINT_INDEX = 2;
    // Rate index
    public static final int SCORE_RETRIEVE_RATE_INDEX = 3;
    // New intex
    public static final int SCORE_RETRIEVE_NEW_INDEX = 4;
    // Value for Score    
    public static final int SCORE_COR_ANS_FACTOR = 3;
    public static final int SCORE_WRG_ANS_FACTOR = 2;

    // STATS LIST
    public static final int STATS_LIST_LANGUAGE_SIZE = 3;
    // General index and name
    public static final int STATS_LIST_GENERAL_INDEX = 0;
    public static final String STATS_LIST_GENERAL_DEF = "General";
    public static final String STATS_LIST_GENERAL_IMG = "sta_001";
    // Time index and name
    public static final int STATS_LIST_TIME_INDEX = 1;
    public static final String STATS_LIST_TIME_DEF = "Time";
    public static final String STATS_LIST_TIME_IMG = "sta_001";
    // No Time index and name
    public static final int STATS_LIST_NO_TIME_INDEX = 2;
    public static final String STATS_LIST_NO_TIME_DEF = "No Time";
    public static final String STATS_LIST_NO_TIME_IMG = "sta_001";

    // ABOUT
    public static final int ABOUT_LANGUAGE_SIZE = 4;
    // Version index and name
    public static final int ABOUT_VERSION_INDEX = 0;
    public static final String ABOUT_VERSION_DEF = "Version";
    // Developer index and name
    public static final int ABOUT_DEVELOPER_INDEX = 1;
    public static final String ABOUT_DEVELOPER_DEF = "Developer";
    // Acknowledge index and name
    public static final int ABOUT_ACKNOWLEDGE_INDEX = 2;
    public static final String ABOUT_ACKNOWLEDGE_DEF = "Acknowledge";
    // Back index and name
    public static final int ABOUT_BACK_INDEX = 3;
    public static final String ABOUT_BACK_DEF = "Back";
    // Retrieve
    public static final int ABOUT_RETRIEVE_SIZE = 3;
    // Version default value
    public static final int ABOUT_RETRIEVE_VERSION_INDEX = 0;
    public static final String ABOUT_RETRIEVE_VERSION_DEF = "0";
    // Build default value
    public static final int ABOUT_RETRIEVE_BUILD_INDEX = 1;
    public static final String ABOUT_RETRIEVE_BUILD_DEF = "0";
    // Developer default value
    public static final int ABOUT_RETRIEVE_DEVELOPER_INDEX = 2;
    public static final String ABOUT_RETRIEVE_DEVELOPER_DEF = "Alberto Tosi Brandi";

    // ACKNOWLEDGE
    public static final int ACKNOWLEDGE_LANGUAGE_SIZE = 1;
    // Acknowledge index and name
    public static final int ACKNOWLEDGE_VERSION_INDEX = 0;
    public static final String ACKNOWLEDGE_VERSION_DEF = " The realization of this game has been made \n" +
            " with non-profit purpose and the sole purpose of entertainment. \n" +
            " Any reference to people or things is purely coincidental. \n" +
            " We thank also the following sites for the material \n" +
            " provided from which was inspired by the graphic design. \n \n";

    // FONT
    public static final String FONT_PATH = "font/handwritten.ttf";

    // SETTING
    public static final int SETTING_LANGUAGE_TITLE_SIZE = 6;
    public static final int SETTING_LANGUAGE_SUMMARY_SIZE = 6;
    public static final int SETTING_CLEAR_LANGUAGE_SIZE = 3;
    
    // MAIN LIST
    public static final int MAIN_LIST_LANGUAGE_SIZE = 6;
    public static final int MAIN_LIST_EUROPE_INDEX = 0;
    public static final String MAIN_LIST_EUROPE_DEF = "Europe";
    public static final int MAIN_LIST_NORTH_AMERICA_INDEX = 1;
    public static final String MAIN_LIST_NORTH_AMERICA_DEF = "North America";
    public static final int MAIN_LIST_SOUTH_AMERICA_INDEX = 2;
    public static final String MAIN_LIST_SOUTH_AMERICA_DEF = "South America";
    public static final int MAIN_LIST_ASIA_INDEX = 3;
    public static final String MAIN_LIST_ASIA_DEF = "Asia";
    public static final int MAIN_LIST_AFRICA_INDEX = 4;
    public static final String MAIN_LIST_AFRICA_DEF = "Africa";
    public static final int MAIN_LIST_OCEANIA_INDEX = 5;
    public static final String MAIN_LIST_OCEANIA_DEF = "Oceania";
    
    // STATS
    public static final int STATS_LANGUAGE_SIZE = 11;
    public static final String STATS_ALL_BEERS_LABEL_DEF = "All Beers";
    public static final String STATS_ALL_BEERS_DEF = "0";
    public static final int STATS_ALL_BEERS_LABEL_INDEX = 0;
    public static final String STATS_CORRECT_ANSWERS_LABEL_DEF = "Correct Answers";
    public static final String STATS_CORRECT_ANSWERS_DEF = "0";
    public static final int STATS_CORRECT_ANSWERS_LABEL_INDEX = 1;
    public static final String STATS_WRONG_ANSWERS_LABEL_DEF = "Wrong Answers";
    public static final String STATS_WRONG_ANSWERS_DEF = "0";
    public static final int STATS_WRONG_ANSWER_LABEL_INDEX = 2;
    public static final String STATS_MOST_BEER_LABEL_DEF = "Most Beer";
    public static final String STATS_MOST_BEER_DEF = "1396";
    public static final int STATS_MOST_BEER_LABEL_INDEX = 3;
    public static final String STATS_LEAST_BEER_LABEL_DEF = "Least Beer";
    public static final String STATS_LEAST_BEER_DEF = "1396";
    public static final int STATS_LEAST_BEER_LABEL_INDEX = 4;
    public static final String STATS_MOST_LANG_LABEL_DEF = "Most Lang";
    public static final String STATS_MOST_LANG_DEF = "English";
    public static final int STATS_MOST_LANG_LABEL_INDEX = 5;
    public static final String STATS_LEAST_LANG_LABEL_DEF = "Least Lang";
    public static final String STATS_LEAST_LANG_DEF = "English";
    public static final int STATS_LEAST_LANG_LABEL_INDEX = 6;
    public static final String STATS_MOST_THEME_LABEL_DEF = "Most Theme";
    public static final String STATS_MOST_THEME_DEF = "Lager";
    public static final int STATS_MOST_THEME_LABEL_INDEX = 7;
    public static final String STATS_LEAST_THEME_LABEL_DEF = "Least Theme";
    public static final String STATS_LEAST_THEME_DEF = "Lager";
    public static final int STATS_LEAST_THEME_LABEL_INDEX = 8;
    public static final String STATS_MOST_RANGE_LABEL_DEF = "Most Range";
    public static final String STATS_MOST_RANGE_DEF = "Europe";
    public static final int STATS_MOST_RANGE_LABEL_INDEX = 9;
    public static final String STATS_LEAST_RANGE_LABEL_DEF = "LeastRange";
    public static final String STATS_LEAST_RANGE_DEF = "Europe";
    public static final int STATS_LEAST_RANGE_LABEL_INDEX = 10;
   
    public static final String STATS_DEFAULT_VALUE = "0";
    public static final int STATS_RETRIEVE_SIZE = 11;
    public static final int STATS_RETRIEVE_ALL_BEERS_INDEX = 0;    
    public static final int STATS_RETRIEVE_CORRECT_ANSWERS_INDEX = 1;
    public static final int STATS_RETRIEVE_WRONG_ANSWERS_INDEX = 2;
    public static final int STATS_RETRIEVE_MOST_BEER_INDEX = 3;
    public static final int STATS_RETRIEVE_LEAST_BEER_INDEX = 4;
    public static final int STATS_RETRIEVE_MOST_LANG_INDEX = 5;
    public static final int STATS_RETRIEVE_LEAST_LANG_INDEX = 6;
    public static final int STATS_RETRIEVE_MOST_THEME_INDEX = 7;
    public static final int STATS_RETRIEVE_LEAST_THEME_INDEX = 8;
    public static final int STATS_RETRIEVE_MOST_RANGE_INDEX = 9;
    public static final int STATS_RETRIEVE_LEAST_RANGE_INDEX = 10;
}
