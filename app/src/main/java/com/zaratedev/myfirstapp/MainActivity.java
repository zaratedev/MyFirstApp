package com.zaratedev.myfirstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create a linearLayout
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());

        //Configuration linearLayout
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.BLUE);

        //set linearLayout to ContentView
        setContentView(linearLayout);

        //Add textView
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        TextView textView = new TextView(getApplicationContext());
        textView.setText("Hello world");

        //textView.setLayoutParams(params);
        textView.setBackgroundColor(Color.RED);

        //set textView to LinearLayout
        linearLayout.addView(textView, params);
    }

}
