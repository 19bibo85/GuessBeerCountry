package com.GuessBeerCountry.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.GuessBeerCountry.R;
import com.GuessBeerCountry.Library.*;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;

import java.util.Locale;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class Score extends SherlockActivity {
    private final static String TAG = "Score";
    public static ScrollView ScrollView;
    public static TextView GameOver;
    public static TextView CorrectAnswer;
    public static TextView PointCorrectAnswer;
    public static TextView WrongAnswer;
    public static TextView PointWrongAnswer;
    public static TextView Point;
    public static TextView Rate;
    public static TextView NumberCorrectAnswer;
    public static TextView NumberWrongAnswer;
    public static TextView PointValue;
    public static TextView RateValue;
    public static TextView Back;
    public static TextView Review;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.score);

            ActionBar actionBar = getSupportActionBar();
            Utility.SetActionBar(actionBar, this);
            Log.i(TAG, "Setting ACTIONBAR.");

            ScrollView = (ScrollView) findViewById(R.id.scroll_view);

            // Game Over
            GameOver = (TextView) findViewById(R.id.game_over);
            GameOver.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting GAME OVER view.");

            // Correct answer
            CorrectAnswer = (TextView) findViewById(R.id.correct_answer);
            CorrectAnswer.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting CORRECT ANSWER views.");

            // Wrong answer
            WrongAnswer = (TextView) findViewById(R.id.wrong_answer);
            WrongAnswer.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting WRONG ANSWER views.");

            // Point
            Point = (TextView) findViewById(R.id.point);
            Point.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting POINT views.");

            // Rate
            Rate = (TextView) findViewById(R.id.rate);
            Rate.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting RATE views.");

            // Number Correct Answer
            NumberCorrectAnswer = (TextView) findViewById(R.id.number_correct_answer);
            NumberCorrectAnswer.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting NUMBER CORRECT ANSWER views.");

            // Point Correct Answer
            PointCorrectAnswer = (TextView) findViewById(R.id.point_correct_answer);
            PointCorrectAnswer.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting POINT CORRECT ANSWER views.");

            // Number Wrong Answer
            NumberWrongAnswer = (TextView) findViewById(R.id.number_wrong_answer);
            NumberWrongAnswer.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting NUMBER WRONG ANSWER views.");

            // Point Wrong Answer
            PointWrongAnswer = (TextView) findViewById(R.id.point_wrong_answer);
            PointWrongAnswer.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting POINT WRONG ANSWER views.");

            // Point Value
            PointValue = (TextView) findViewById(R.id.point_value);
            PointValue.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting POINT VALUE views.");

            // Rate Value
            RateValue = (TextView) findViewById(R.id.rate_value);
            RateValue.setTypeface(Utility.GetFont(this));
            Log.i(TAG, "Setting RATE VALUE views.");

            // Back
            Back = (Button) findViewById(R.id.back);
            Back.setTypeface(Utility.GetFont(this));
            Back.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start MAIN activity.");
                    startActivity();
                }
            });
            Log.i(TAG, "Setting BACK button.");

            // Review
            Review = (Button) findViewById(R.id.review);
            Review.setTypeface(Utility.GetFont(this));
            Review.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    Log.i(TAG, "Start REVIEW activity.");
                    reviewActivity();
                }
            });
            Log.i(TAG, "Setting REVIEW button.");

            Title.SetTitle(ComponentName.Score, actionBar, this.getBaseContext());
            Log.i(TAG, "Setting Title.");
            Language.SetLanguage(ComponentName.Score, this);
            Log.i(TAG, "Setting Language.");
            Theme.SetTheme(ComponentName.Score, this.getBaseContext());
            Log.i(TAG, "Setting Theme.");

            // Add new ad
            //IMBanner banner = (IMBanner) findViewById(R.id.adView);
            //banner.loadBanner();
        } catch(Exception ex){
            Log.e(TAG, "Score exception.");
            Log.e(TAG, "Message: " + ex.getMessage());
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i(TAG, "Retriving Data.");
        if(RetrieveData.SetRetrieveData(ComponentName.Score, this)) {
            Log.i(TAG, "Setting new record.");
            showNewRecord();
        }
        Log.i(TAG, "Setting Audio.");
        Utility.InitializeAudio(this);
        Log.i(TAG, "Setting Transition.");
        Utility.SetTransition(ComponentName.Score, this);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "Starting editing preferences.");
        CommitData.SetCommitData(ComponentName.Score, this);
        Log.e(TAG, "Preferences edited.");
    }

    private void showNewRecord()
    {
        Log.i(TAG, "Starting audio new record.");
        Utility.SetAudio(this, Sound.Applause);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast_layout));
        Log.i(TAG, "Preparing layout to show.");

        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setTypeface(Utility.GetFont(this));
        text.setText(newRecordLocalized());
        Log.i(TAG, "Setting the view of the layout.");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
        Log.i(TAG, "Showing toast.");
    }

    private String newRecordLocalized(){
        Context context = this.getBaseContext();
        String lang = Locale.getDefault().getLanguage();

        Object[] prefs = Utility.GetSharedPreference(context);
        if (prefs.length == AppConfig.PREFERENCE)
            lang =  prefs[AppConfig.PREF_LANGUAGE_INDEX].toString();

        String xmlStr = "score_record_".concat(lang);
        String result = context.getResources().getString(Utility.GetResId(xmlStr, R.string.class));

        return result;
    }

    @Override
    public boolean onOptionsItemSelected(com.actionbarsherlock.view.MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }

    private void startActivity() {
        finish();
        Log.i(TAG, "SCORE activity is destroyed.");
    }

    public void reviewActivity() {
        Intent intent = new Intent(this, ReviewActivity.class);
        intent.putExtra("Transition", true);
        startActivity(intent);
        Log.i(TAG, "Review activity is started.");
    }
}