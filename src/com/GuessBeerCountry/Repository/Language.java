package com.GuessBeerCountry.Repository;

import android.app.Activity;
import android.content.Context;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.widget.Button;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

import static com.GuessBeerCountry.R.array;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Activity.*;
import com.GuessBeerCountry.Network.ServerError;


/**
 * Created by Alberto Tosi Brandi on 05/10/2014.
 */
public class Language {

    public static void SetLanguage(ComponentName name, Activity activity) {
        switch (name) {
            case Splashscreen:
                SetSplashscreen(activity.getBaseContext());
                break;
            case Main:
                SetMain(activity.getBaseContext());
                break;
            case Start:
                SetStart(activity.getBaseContext());
                break;
            case BestScore:
                SetBestScore(activity.getBaseContext());
                break;
            case Score:
                SetScore(activity.getBaseContext());
                break;
            case Stats:
                SetStats(activity.getBaseContext());
                break;
            case StatsList:
                SetStatsList(activity.getBaseContext());
                break;
            case About:
                SetAbout(activity.getBaseContext());
                break;
            case Setting:
                SetSetting((SherlockPreferenceActivity)activity);
                break;
            default:
                break;
        }
    }

    private static void SetSplashscreen(Context context) {
        Object[] prefs = Utility.GetSharedPreference(context);

        TextView loading = SplashScreen.Loading;
        loading.setText(AppConfig.SPLASH_LOADING_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Splashscreen,
                    context,
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.SPLASH_LANGUAGE_SIZE);

            if (strings != null)
                loading.setText(strings[AppConfig.SPLASH_LOADING_INDEX] + "...");
        }
    }

    private static void SetMain(Context context) {
        Object[] prefs = Utility.GetSharedPreference(context);

        Button start = Main.Start;
        start.setText(AppConfig.MAIN_START_DEF);

        Button bestScore = Main.BestScore;
        bestScore.setText(AppConfig.MAIN_BEST_SCORE_DEF);

        Button list = Main.List;
        list.setText(AppConfig.MAIN_LIST_DEF);

        Button setting = Main.Setting;
        setting.setText(AppConfig.MAIN_SETTING_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Main,
                    context,
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

    private static void SetStart(Context context) {
        Object[] prefs = Utility.GetSharedPreference(context);

        TextView easy = Start.Easy;
        easy.setText(AppConfig.START_EASY_DEF);

        TextView medium = Start.Medium;
        medium.setText(AppConfig.START_MEDIUM_DEF);

        TextView hard = Start.Hard;
        hard.setText(AppConfig.START_HARD_DEF);

        TextView allPlates = Start.AllPlates;
        allPlates.setText(AppConfig.START_ALL_PLATES_DEF);

        TextView noFaults = Start.NoFault;
        noFaults.setText(AppConfig.START_NO_FAULTS_DEF);

        TextView timeLimits = Start.TimeLimits;
        timeLimits.setText(AppConfig.START_TIME_LIMITS_DEF);

        TextView noTimeLimits = Start.NoTimeLimits;
        noTimeLimits.setText(AppConfig.START_NO_TIME_LIMITS_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Start,
                    context,
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

    private static void SetBestScore(Context context) {
        Object[] prefs = Utility.GetSharedPreference(context);

        TextView easy = BestScore.Easy;
        easy.setText(AppConfig.BEST_SCORE_EASY_DEF);

        TextView medium = BestScore.Medium;
        medium.setText(AppConfig.BEST_SCORE_MEDIUM_DEF);

        TextView hard = BestScore.Hard;
        hard.setText(AppConfig.BEST_SCORE_HARD_DEF);

        TextView allPlates = BestScore.AllPlates;
        allPlates.setText(AppConfig.BEST_SCORE_ALL_PLATES_DEF);

        TextView noFaults = BestScore.NoFault;
        noFaults.setText(AppConfig.BEST_SCORE_NO_FAULT_DEF);

        TextView bestScore = BestScore.BestScore;
        bestScore.setText(AppConfig.BEST_SCORE_BEST_SCORE_DEF);

        TextView stats = BestScore.Stats;
        stats.setText(AppConfig.BEST_SCORE_STATS_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Start,
                    context,
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.BEST_SCORE_LANGUAGE_SIZE);
            if (strings != null) {
                easy.setText(AppConfig.BEST_SCORE_EASY_INDEX);
                medium.setText(AppConfig.BEST_SCORE_MEDIUM_INDEX);
                hard.setText(AppConfig.BEST_SCORE_HARD_INDEX);
                allPlates.setText(AppConfig.BEST_SCORE_ALL_PLATES_INDEX);
                noFaults.setText(AppConfig.BEST_SCORE_NO_FAULT_INDEX);
                bestScore.setText(strings[AppConfig.BEST_SCORE_BEST_SCORE_INDEX]);
                stats.setText(AppConfig.BEST_SCORE_STATS_INDEX);
            }
        }
    }

    private static void SetScore(Context context) {
        Object[] prefs = Utility.GetSharedPreference(context);

        TextView gameOver = Score.GameOver;
        gameOver.setText(AppConfig.SCORE_GAME_OVER_DEF);

        TextView correctAnswer = Score.CorrectAnswer;
        correctAnswer.setText(AppConfig.SCORE_CORRECT_ANSWER_DEF);

        TextView wrongAnswer = Score.WrongAnswer;
        wrongAnswer.setText(AppConfig.SCORE_WRONG_ANSWER_DEF);

        TextView point = Score.Point;
        point.setText(AppConfig.SCORE_POINT_DEF);

        TextView rate = Score.Rate;
        rate.setText(AppConfig.SCORE_RATE_DEF);

        TextView back = Score.Back;
        back.setText(AppConfig.SCORE_BACK_DEF);

        TextView review = Score.Review;
        review.setText(AppConfig.SCORE_REVIEW_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.Score,
                    context,
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

    private static void SetStats(Context context) {

    }

    private static void SetStatsList(Context context) {
        Object[] prefs = Utility.GetSharedPreference(context);

        TextView general = StatsList.General;
        general.setText(AppConfig.STATS_LIST_GENERAL_DEF);

        TextView time = StatsList.Time;
        time.setText(AppConfig.STATS_LIST_TIME_DEF);

        TextView noTime = StatsList.NoTime;
        noTime.setText(AppConfig.STATS_LIST_NO_TIME_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.StatsList,
                    context,
                    prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                    AppConfig.STATS_LIST_LANGUAGE_SIZE);
            if (strings != null) {
                general.setText(AppConfig.STATS_LIST_GENERAL_INDEX);
                time.setText(AppConfig.STATS_LIST_TIME_INDEX);
                noTime.setText(AppConfig.STATS_LIST_NO_TIME_INDEX);
            }
        }
    }

    private static void SetAbout(Context context) {
        Object[] prefs = Utility.GetSharedPreference(context);

        TextView version = About.Version;
        version.setText(AppConfig.ABOUT_VERSION_DEF);

        TextView developer = About.Developer;
        developer.setText(AppConfig.ABOUT_DEVELOPER_DEF);

        TextView acknowledge = About.Acknowledge;
        acknowledge.setText(AppConfig.ABOUT_ACKNOWLEDGE_DEF);

        TextView back = About.Back;
        back.setText(AppConfig.ABOUT_BACK_DEF);

        if (prefs.length == AppConfig.PREFERENCE) {
            String[] strings = GetStringArray(ComponentName.About,
                    context,
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

    private static void SetSetting(SherlockPreferenceActivity activity) {
        //final int SIZE = 6;
        Context context = activity.getBaseContext();

        Object[] prefs = Utility.GetSharedPreference(context);
        if (prefs.length == AppConfig.PREFERENCE) {
            String language = prefs[AppConfig.PREF_LANGUAGE_INDEX].toString();

            // Getting all titles for the language selected
            String[] strTitle = GetStringArray(
                    SettingName.Title,
                    context,
                    language,
                    AppConfig.SETTING_LANGUAGE_TITLE_SIZE);

            // Getting all the summaries for the language selected
            String[] strSummary = GetStringArray(
                    SettingName.Summary,
                    context,
                    language,
                    AppConfig.SETTING_LANGUAGE_SUMMARY_SIZE);

            // Check there are title and summaries and their lenght is equal to 6
            if(strTitle != null && strTitle.length == AppConfig.SETTING_LANGUAGE_TITLE_SIZE &&
               strSummary != null && strSummary.length == AppConfig.SETTING_LANGUAGE_SUMMARY_SIZE){
                SetTitleAndSummary(activity, strTitle, strSummary, PreferenceName.Language, context, language);
                SetTitleAndSummary(activity, strTitle, strSummary, PreferenceName.Theme, context, language);
                SetTitleAndSummary(activity, strTitle, strSummary, PreferenceName.Range, context, language);
                SetTitleAndSummary(activity, strTitle, strSummary, PreferenceName.Update, context, language);
                SetTitleAndSummary(activity, strTitle, strSummary, PreferenceName.Sound, context, language);
                SetTitleAndSummary(activity, strTitle, strSummary, PreferenceName.Clear, context, language);
            }
        }
    }

    @SuppressWarnings("deprecation")
    public static void SetTitleAndSummary(SherlockPreferenceActivity preference, String[] strTitle, String[] strSummary, PreferenceName name, Context context, String language){
        //final int SIZE = 3;
        Preference connectionPref = null;
        String sumSel = null;
        String selPref = null;


        switch(name)
        {
            case Language:
                connectionPref = preference.findPreference(name.toString());
                connectionPref.setTitle(strTitle[0]);
                selPref = Utility.GetSharedPreference(context)[0].toString();
                sumSel = GetPreferenceLocalized(name, context, selPref, language);
                connectionPref.setSummary(strSummary[0].concat(sumSel == null ? selPref : sumSel));
                break;
            case Theme:
                connectionPref = preference.findPreference(name.toString());
                connectionPref.setTitle(strTitle[1]);
                selPref = Utility.GetSharedPreference(context)[1].toString();
                sumSel = GetPreferenceLocalized(name, context, selPref, language);
                connectionPref.setSummary(strSummary[1].concat(sumSel == null ? selPref : sumSel));
                break;
            case Range:
                connectionPref = preference.findPreference(name.toString());
                connectionPref.setTitle(strTitle[2]);
                selPref = Utility.GetSharedPreference(context)[2].toString();
                sumSel = GetPreferenceLocalized(name, context, selPref, language);
                connectionPref.setSummary(strSummary[2].concat(sumSel == null ? selPref : sumSel));
                break;
            case Update:
                connectionPref = preference.findPreference(name.toString());
                connectionPref.setTitle(strTitle[3]);
                selPref = Utility.GetSharedPreference(context)[3].toString();
                sumSel = GetPreferenceLocalized(name, context, selPref, language);
                connectionPref.setSummary(strSummary[3].concat(sumSel == null ? selPref : sumSel));
                break;
            case Sound:
                connectionPref = preference.findPreference(name.toString());
                connectionPref.setTitle(strTitle[4]);
                selPref = Utility.GetSharedPreference(context)[4].toString();
                sumSel = GetPreferenceLocalized(name, context, selPref, language);
                connectionPref.setSummary(strSummary[4].concat(sumSel == null ? selPref : sumSel));
                break;
            case Clear:
                DialogPreference dialogPref = (DialogPreference) preference.findPreference(name.toString());
                dialogPref.setTitle(strTitle[5]);
                dialogPref.setSummary(strSummary[5]);

                String[] strClear = GetStringArray(
                        ComponentName.Setting,
                        context,
                        language,
                        AppConfig.SETTING_CLEAR_LANGUAGE_SIZE);

                if(strClear != null){
                    dialogPref.setDialogMessage(strClear[0]);
                    dialogPref.setPositiveButtonText(strClear[1]);
                    dialogPref.setNegativeButtonText(strClear[2]);
                }
                break;
        }
    }

    private static String GetPreferenceLocalized(PreferenceName name, Context context, String sumSel, String language){
        String localized = null;
        String[] vals = null;
        String[] disp = null;
        int pos = -1;

        switch(name)
        {
            case Language:
                vals = context.getResources().getStringArray(R.array.setting_language_val);
                disp = context.getResources().getStringArray(R.array.setting_language);
                pos = Utility.FindPosition(vals, sumSel);
                break;
            case Theme:
                vals = context.getResources().getStringArray(R.array.setting_theme_val);
                disp = context.getResources().getStringArray(Utility.GetResId("setting_theme_".concat(language), R.array.class));
                pos = Utility.FindPosition(vals, sumSel);
                break;
            case Range:
                vals = context.getResources().getStringArray(R.array.setting_range_val);
                disp = context.getResources().getStringArray(Utility.GetResId("setting_range_".concat(language), R.array.class));
                pos = Utility.FindPosition(vals, sumSel);
                break;
            case Update:
                vals = context.getResources().getStringArray(R.array.setting_update_val);
                disp = context.getResources().getStringArray(Utility.GetResId("setting_update_".concat(language), R.array.class));
                pos = Utility.FindPosition(vals, sumSel);
                break;
            case Sound:
                vals = context.getResources().getStringArray(R.array.setting_sound_val);
                disp = context.getResources().getStringArray(Utility.GetResId("setting_sound_".concat(language), R.array.class));
                pos = Utility.FindPosition(vals, sumSel);
                break;
            default:
                break;
        }

        if(pos != -1 && disp != null && vals != null && disp.length == vals.length)
            localized =  disp[pos];

        return localized;
    }

    public static String GetServerErrorLanguage(ServerError serverError,
                                                SherlockActivity activity,
                                                ComponentName activityName,
                                                int activityStringNum) {
        String result = null;
        Object[] prefs = Utility.GetSharedPreference(activity);

        if (prefs.length != AppConfig.PREFERENCE){
            String[] strArr = GetStringArray(activityName,
                                             activity.getBaseContext(),
                                             prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                                             activityStringNum);
            if(strArr != null) {
                switch (serverError) {
                    case NO_ERROR:
                        result = strArr[0];
                        break;
                    case GENERAL:
                        result = strArr[1];
                        break;
                    case CONNECTION:
                        result = strArr[2];
                        break;
                    case PROTOCOL:
                        result = strArr[3];
                        break;
                    case STREAM:
                        result = strArr[4];
                        break;
                    case OBJECT_NOT_FOUND:
                        result = strArr[5];
                        break;
                    case NEW_BUILD:
                        result = strArr[6];
                        break;
                    case OLD_BUILD:
                        result = strArr[7];
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }

    public static String[] GetAcknowledgeStrings(SherlockActivity activity,
                                                 ComponentName activityName,
                                                 int activityStringNum) {

        Object[] prefs = Utility.GetSharedPreference(activity);
        if (prefs.length != AppConfig.PREFERENCE)
            return new String[]{AppConfig.ACKNOWLEDGE_VERSION_DEF};

        return GetStringArray(activityName,
                activity.getBaseContext(),
                prefs[AppConfig.PREF_LANGUAGE_INDEX].toString(),
                activityStringNum);
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
    
    public static String SetMainList(Context context, String continent) {
    	String result = AppConfig.MAIN_LIST_EUROPE_DEF;
    	Object[] prefs = Utility.GetSharedPreference(context);
        if (prefs.length == AppConfig.PREFERENCE) {
            String language = prefs[AppConfig.PREF_LANGUAGE_INDEX].toString();
            
            // Getting all continent for the language selected
            String[] strContinent = GetStringArray(
                    ComponentName.MainList,
                    context,
                    language,
                    AppConfig.MAIN_LIST_LANGUAGE_SIZE);
            
            //TODO: Add country, area
            if (strContinent != null) {
                if (continent.equals(AppConfig.MAIN_LIST_EUROPE_DEF)) {
                    result = strContinent[AppConfig.MAIN_LIST_EUROPE_INDEX];
                } else if (continent.equals(AppConfig.MAIN_LIST_NORTH_AMERICA_DEF)) {
                    result = strContinent[AppConfig.MAIN_LIST_NORTH_AMERICA_INDEX];
                } else if (continent.equals(AppConfig.MAIN_LIST_SOUTH_AMERICA_DEF)) {
                    result = strContinent[AppConfig.MAIN_LIST_SOUTH_AMERICA_INDEX];
                } else if (continent.equals(AppConfig.MAIN_LIST_ASIA_DEF)) {
                    result = strContinent[AppConfig.MAIN_LIST_ASIA_INDEX];
                } else if (continent.equals(AppConfig.MAIN_LIST_AFRICA_DEF)) {
                    result = strContinent[AppConfig.MAIN_LIST_AFRICA_INDEX];
                } else if (continent.equals(AppConfig.MAIN_LIST_OCEANIA_DEF)) {
                    result = strContinent[AppConfig.MAIN_LIST_OCEANIA_INDEX];
                }
            }            
        }        
        return result;
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
                break;
            case Acknowledge:
                arrName = "acknowledgements_".concat(language);
                break;
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


    public static String[] GetStringArray(SettingName name,
                                          Context context,
                                          String language,
                                          int size) {
        String arrName = null;

        switch (name) {
            case Title:
                arrName = "setting_title_".concat(language);
                break;
            case Summary:
                arrName = "setting_summary_".concat(language);
                break;
            case Clear:
                arrName = "clear_message_".concat(language);
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