package com.GuessBeerCountry.Library;

import java.util.Locale;

/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class AppConfig {
    // TABLET
    public static final int TABLET_SCREEN_WIDTH = 600;
    public static final float TABLET_SCALE = 1.3f;

    // PREFERENCE
    public static int PREFERENCE = 5;
    // Preference index
    public static int PREF_LANGUAGE_INDEX = 0;
    public static String PREF_LANGUAGE_DEF = Locale.getDefault().getLanguage();
    public static int PREF_THEME_INDEX = 1;
    public static String PREF_THEME_DEF = "Theme 1";
    public static int PREF_RANGE_INDEX = 2;
    public static String PREF_RANGE_DEF = "Europe";
    public static int PREF_UPDATE_INDEX = 3;
    public static boolean PREF_UPDATE_DEF = true;
    public static int PREF_SOUND_INDEX = 4;
    public static boolean PREF_SOUND_DEF = true;

    // THEME
    public static String THEME_FIRST = "Theme 1";
    public static String THEME_SECOND = "Theme 2";
    public static String THEME_THIRD = "Theme 3";
    public static int THEME_SIZE = 2;
    public static int THEME_BACKGROUND = 0;
    public static int THEME_BUTTON = 1;

    // SPLASH SCREEN ALERT
    public static int SPLASH_ALERT_MESSAGE = 3;
    // Title index and name
    public static int SPLASH_ALERT_TITLE_INDEX = 0;
    public static String SPLASH_ALERT_DEF_TITLE = "Title";
    // Message index and name
    public static int SPLASH_ALERT_MESSAGE_INDEX = 1;
    public static String SPLASH_ALERT_DEF_MESSAGE = "Message";
    // Confirm index and name
    public static int SPLASH_ALERT_CONFIRM_INDEX = 2;
    public static String SPLASH_ALERT_DEF_CONFIRM = "ok";

    // SPLASH SCREEN
    public static int SPLASH_LANGUAGE_SIZE = 1;
    // Loading index and name
    public static int SPLASH_LOADING_INDEX = 0;
    public static String SPLASH_LOADING_DEF = "Loading...";

    // SERVER ERROR
    public static int SERVER_ERROR_LANGUAGE_SIZE = 8;

    // MAIN
    public static int MAIN_LANGUAGE_SIZE = 4;
    // Start index and name
    public static int MAIN_START_INDEX = 0;
    public static String MAIN_START_DEF = "Start";
    // Best scores index and name
    public static int MAIN_BEST_SCORE_INDEX = 1;
    public static String MAIN_BEST_SCORE_DEF = "Best Scores";
    // List index and name
    public static int MAIN_LIST_INDEX = 2;
    public static String MAIN_LIST_DEF = "List";
    // Best scores index and name
    public static int MAIN_SETTING_INDEX = 3;
    public static String MAIN_SETTING_DEF = "Setting";

    // START
    public static int START_LANGUAGE_SIZE = 7;
    // Easy index and name
    public static int START_EASY_INDEX = 0;
    public static String START_EASY_DEF = "Easy";
    // Medium index and name
    public static int START_MEDIUM_INDEX = 1;
    public static String START_MEDIUM_DEF = "Medium";
    // Hard index and name
    public static int START_HARD_INDEX = 2;
    public static String START_HARD_DEF = "Hard";
    // All Plates scores index and name
    public static int START_ALL_PLATES_INDEX = 3;
    public static String START_ALL_PLATES_DEF = "All Plates";
    // No Faults scores index and name
    public static int START_NO_FAULTS_INDEX = 4;
    public static String START_NO_FAULTS_DEF = "No Faults";
    // Start Time Limits index and name
    public static int START_TIME_LIMITS_INDEX = 5;
    public static String START_TIME_LIMITS_DEF = "Start Time Limits";
    // Start No Time Limits index and name
    public static int START_NO_TIME_LIMITS_INDEX = 6;
    public static String START_NO_TIME_LIMITS_DEF = "Start No Time Limits";

    // BEST SCORES
    public static int BEST_SCORE_LANGUAGE_SIZE = 7;
    // Easy index and name
    public static int BEST_SCORE_EASY_INDEX = 0;
    public static String BEST_SCORE_EASY_DEF = "Easy";
    // Medium index and name
    public static int BEST_SCORE_MEDIUM_INDEX = 1;
    public static String BEST_SCORE_MEDIUM_DEF = "Medium";
    // Hard index and name
    public static int BEST_SCORE_HARD_INDEX = 2;
    public static String BEST_SCORE_HARD_DEF = "Hard";
    // All Plates scores index and name
    public static int BEST_SCORE_ALL_PLATES_INDEX = 3;
    public static String BEST_SCORE_ALL_PLATES_DEF = "All Plates";
    // No Faults scores index and name
    public static int BEST_SCORE_NO_FAULT_INDEX = 4;
    public static String BEST_SCORE_NO_FAULT_DEF = "No Faults";
    // Start Time Limits index and name
    public static int BEST_SCORE_BEST_SCORE_INDEX = 5;
    public static String BEST_SCORE_BEST_SCORE_DEF = "Best Scores";
    // Best Scores index and name
    public static int BEST_SCORE_STATS_INDEX = 6;
    public static String BEST_SCORE_STATS_DEF = "Stats";
    // Default score and rate value
    public static String BEST_SCORE_SCORE_DEFAULT = "0";
    public static String BEST_SCORE_RATE_DEFAULT = "0";
    // Prefix score and rate
    public static String BEST_SCORE_PREFIX_SCORE = "Score";
    public static String BEST_SCORE_PREFIX_RATE = "Rate";
    // Retrieve
    public static int BEST_SCORE_RETRIEVE_SIZE = 10;
    // Easy Score index
    public static int BEST_SCORE_RETRIEVE_EASY_SCORE_INDEX = 0;
    // Easy Rate index
    public static int BEST_SCORE_RETRIEVE_EASY_RATE_INDEX = 1;
    // Medium score index
    public static int BEST_SCORE_RETRIEVE_MEDIUM_SCORE_INDEX = 2;
    // Medium rate index
    public static int BEST_SCORE_RETRIEVE_MEDIUM_RATE_INDEX = 3;
    // Hard score index
    public static int BEST_SCORE_RETRIEVE_HARD_SCORE_INDEX = 4;
    // Hard rate index
    public static int BEST_SCORE_RETRIEVE_HARD_RATE_INDEX = 5;
    // All plates score index
    public static int BEST_SCORE_RETRIEVE_ALL_PLATES_SCORE_INDEX = 6;
    // All plates rate index
    public static int BEST_SCORE_RETRIEVE_ALL_PLATES_RATE_INDEX = 7;
    // No fault score index
    public static int BEST_SCORE_RETRIEVE_NO_FAULT_SCORE_INDEX = 8;
    // No fault rate index
    public static int BEST_SCORE_RETRIEVE_NO_FAULT_RATE_INDEX = 9;

    // SCORES
    public static int SCORE_LANGUAGE_SIZE = 7;
    // Game Over index and name
    public static int SCORE_GAME_OVER_INDEX = 0;
    public static String SCORE_GAME_OVER_DEF = "Game Over";
    // Correct Answer index and name
    public static int SCORE_CORRECT_ANSWER_INDEX = 1;
    public static String SCORE_CORRECT_ANSWER_DEF = "Correct Answer";
    // Wrong Answer index and name
    public static int SCORE_WRONG_ANSWER_INDEX = 2;
    public static String SCORE_WRONG_ANSWER_DEF = "Wrong Answer";
    // Point scores index and name
    public static int SCORE_POINT_INDEX = 3;
    public static String SCORE_POINT_DEF = "Point";
    // No Faults scores index and name
    public static int SCORE_RATE_INDEX = 4;
    public static String SCORE_RATE_DEF = "Rate";
    // Start Time Limits index and name
    public static int SCORE_BACK_INDEX = 5;
    public static String SCORE_BACK_DEF = "Back";
    // Best Scores index and name
    public static int SCORE_REVIEW_INDEX = 6;
    public static String SCORE_REVIEW_DEF = "Review";
    // Default score value
    public static String SCORE_DEFAULT_VALUE = "0";
    // Retrieve
    public static int SCORE_RETRIEVE_SIZE = 5;
    // Correct answer index
    public static int SCORE_RETRIEVE_CORRECT_INDEX = 0;
    // Wrong answer index
    public static int SCORE_RETRIEVE_WRONG_INDEX = 1;
    // Point index
    public static int SCORE_RETRIEVE_POINT_INDEX = 2;
    // Rate index
    public static int SCORE_RETRIEVE_RATE_INDEX = 3;
    // New intex
    public static int SCORE_RETRIEVE_NEW_INDEX = 4;

    // STATS LIST
    public static int STATS_LIST_LANGUAGE_SIZE = 3;
    // General index and name
    public static int STATS_LIST_GENERAL_INDEX = 0;
    public static String STATS_LIST_GENERAL_DEF = "General";
    // Time index and name
    public static int STATS_LIST_TIME_INDEX = 1;
    public static String STATS_LIST_TIME_DEF = "Time";
    // No Time index and name
    public static int STATS_LIST_NO_TIME_INDEX = 2;
    public static String STATS_LIST_NO_TIME_DEF = "No Time";

    // ABOUT
    public static int ABOUT_LANGUAGE_SIZE = 4;
    // Version index and name
    public static int ABOUT_VERSION_INDEX = 0;
    public static String ABOUT_VERSION_DEF = "Version";
    // Developer index and name
    public static int ABOUT_DEVELOPER_INDEX = 1;
    public static String ABOUT_DEVELOPER_DEF = "Developer";
    // Acknowledge index and name
    public static int ABOUT_ACKNOWLEDGE_INDEX = 2;
    public static String ABOUT_ACKNOWLEDGE_DEF = "Acknowledge";
    // Back index and name
    public static int ABOUT_BACK_INDEX = 3;
    public static String ABOUT_BACK_DEF = "Back";
    // Retrieve
    public static int ABOUT_RETRIEVE_SIZE = 3;
    // Version default value
    public static int ABOUT_RETRIEVE_VERSION_INDEX = 0;
    public static String ABOUT_RETRIEVE_VERSION_DEF = "0";
    // Build default value
    public static int ABOUT_RETRIEVE_BUILD_INDEX = 1;
    public static String ABOUT_RETRIEVE_BUILD_DEF = "0";
    // Developer default value
    public static int ABOUT_RETRIEVE_DEVELOPER_INDEX = 2;
    public static String ABOUT_RETRIEVE_DEVELOPER_DEF = "Alberto Tosi Brandi";

    // ACKNOWLEDGE
    public static int ACKNOWLEDGE_LANGUAGE_SIZE = 1;
    // Acknowledge index and name
    public static int ACKNOWLEDGE_VERSION_INDEX = 0;
    public static String ACKNOWLEDGE_VERSION_DEF = " The realization of this game has been made \n" +
            " with non-profit purpose and the sole purpose of entertainment. \n" +
            " Any reference to people or things is purely coincidental. \n" +
            " We thank also the following sites for the material \n" +
            " provided from which was inspired by the graphic design. \n \n";

    // FONT
    public static String FONT_PATH = "font/handwritten.ttf";

    // SETTING
    public static int SETTING_LANGUAGE_TITLE_SIZE = 6;
    public static int SETTING_LANGUAGE_SUMMARY_SIZE = 6;
    public static int SETTING_CLEAR_LANGUAGE_SIZE = 3;

}
