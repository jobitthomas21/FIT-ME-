package com.example.political_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Viewreplay extends AppCompatActivity {
    TextView com,re,dat;
    SharedPreferences sh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewreplay);
        com= (TextView) findViewById(R.id.t1);
        re= (TextView) findViewById(R.id.t3);
         dat= (TextView) findViewById(R.id.t4);


    }


}

