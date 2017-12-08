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

        //create new linearLayout
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());

        setContentView(linearLayout);

        //create new textView
        TextView textView = new TextView(getApplicationContext());
        textView.setText("Hello World");

        //Create layout params
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        //set margin to params
        params.leftMargin = 30;
        //Add padding to textView
        textView.setPadding(0,20,0,0);
        //Add color backgroundColor to textView
        textView.setBackgroundColor(Color.RED);
        //add view textView to linearLayout
        linearLayout.addView(textView, params);

    }

}
