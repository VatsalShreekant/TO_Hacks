package com.example.vaxapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vaxapp.ui.main.MainFragment;

public class LandingActivity extends AppCompatActivity {

    public void onVaccineButtonClick(View view) {
        // TODO - Route to the Vaccine Registration flow landing screen
        /*Intent launchVaccineLandingScreen = new Intent(this,
        // TODO - Add Vaccine Registration flow landing class here
        )
        startActivity(launchVaccineLandingScreen)*/
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onPopUpClinicButtonClick(View view) {
        // TODO - Route to the Pop-Up Clinic Registration flow landing screen
        /*Intent launchPopUpClinicLandingScreen = new Intent(this,
        // TODO - Add Pop-Up Clinic Registration flow landing class here
        )
        startActivity(launchPopUpClinicLandingScreen)*/
        //Intent intent = new Intent(this, NotificationPage.class);
        //startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_landing);


        super.onCreate(savedInstanceState);
        // setContentView(R.layout.main_activity);
        setContentView(R.layout.activity_landing);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        TextView landingSelectView = findViewById(R.id.landing_select_text);
        landingSelectView.setText(R.string.vax_app_landing_select_text);
        Button vaccineButton = findViewById(R.id.landing_button_1);
        vaccineButton.setText(R.string.vax_app_landing_vaccine_button_text);
        Button popUpClinicButton = findViewById(R.id.landing_button_2);
        popUpClinicButton.setText(R.string.vax_app_landing_pop_up_button_text);
    }
}