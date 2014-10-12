package com.example.GuessBeerCountry.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.GuessBeerCountry.R;

/**
 * Created by Alberto on 07/10/2014.
 */
public class BestScore extends Activity {
    public static TextView Easy;
    public static TextView Medium;
    public static TextView Hard;
    public static TextView AllPlates;
    public static TextView NoFaults;
    public static TextView BestScore;
    public static TextView Stats;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.best_score);
    }
}