package com.example.GuessBeerCountry.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.GuessBeerCountry.R;

/**
 * Created by Alberto Tosi Brandi on 07/10/2014.
 */
public class About extends Activity {
    public static TextView Version;
    public static TextView Developer;
    public static TextView Acknowledge;
    public static TextView Back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
}