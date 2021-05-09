package com.example.vaxapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class EligibilityCriteriaActivity extends AppCompatActivity {
    public void backButton(View v){
        Log.i("info:","Back Button Worked");
        Intent intent = new Intent(this, Pop_Up_Registration.class);
        startActivity(intent);
    }

    public void nextButton(View v){
        Log.i("info:","Next Button Worked");
        Intent intent = new Intent(this, HarlemStreetActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eligibility_criteria);
    }
}