package com.example.GuessBeerCountry.Activity;

import android.os.Bundle;
import android.widget.TextView;
import com.actionbarsherlock.app.SherlockActivity;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class Score extends SherlockActivity {
    public static TextView GameOver;
    public static TextView CorrectAnswer;
    public static TextView WrongAnswer;
    public static TextView Point;
    public static TextView Rate;
    public static TextView Back;
    public static TextView Review;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }
}