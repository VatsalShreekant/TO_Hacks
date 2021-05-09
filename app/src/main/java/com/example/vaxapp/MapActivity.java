package com.example.vaxapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MapActivity extends AppCompatActivity {
    public void backButton(View v){
        Log.i("info:","Back Button Worked");
        Intent intent = new Intent(this, NotificationPage.class);
        startActivity(intent);
    }

    public void harlem(View v){
        Intent intent = new Intent(this, HarlemStreetActivity.class);
        startActivity(intent);
    }

    public void brock(View v){
        Intent intent = new Intent(this, BrockStActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }
}