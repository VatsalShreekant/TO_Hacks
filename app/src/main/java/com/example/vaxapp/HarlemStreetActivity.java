package com.example.vaxapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class HarlemStreetActivity extends AppCompatActivity {
    public void backButton(View v){
        Log.i("info:","Back Button Worked");
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
    public void confirmButton(View v){
        Log.i("info:","Back Button Worked");
        Toast.makeText(this,"Confirmation Sent to Email",Toast.LENGTH_LONG).show();
    }
    public void homeButton(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harlem_street);
    }
}