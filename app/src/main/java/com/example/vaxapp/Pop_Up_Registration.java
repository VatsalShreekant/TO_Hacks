package com.example.vaxapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Pop_Up_Registration extends AppCompatActivity {




    public void backButton(View v){
        Log.i("info:","Back Button Worked");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void nextButton(View v){
        Log.i("info:","Next Button Worked");
        //Elgibility Criteria
        Intent intent = new Intent(this, EligibilityCriteriaActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_registration);
    }
}