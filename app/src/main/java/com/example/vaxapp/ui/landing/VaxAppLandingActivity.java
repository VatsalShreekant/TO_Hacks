package com.example.vaxapp.ui.landing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.vaxapp.R;

public class VaxAppLandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_fragment);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, VaxAppLandingFragment.newInstance())
                    .commitNow();
        }

        // Setting UI here:
        TextView landingTextView = findViewById(R.id.landing_title_text);
        landingTextView.setText(R.string.vax_app_name);
        ImageView vaccineIcon = findViewById(R.id.vaccine_image_view);
        vaccineIcon.setImageResource(R.drawable.vaccine);
        TextView landingSelectView = findViewById(R.id.landing_select_text);
        landingSelectView.setText(R.string.vax_app_landing_select_text);
        Button vaccineButton = findViewById(R.id.landing_button_1);
        vaccineButton.setText(R.string.vax_app_landing_vaccine_button_text);
        Button popUpClinicButton = findViewById(R.id.landing_button_2);
        popUpClinicButton.setText(R.string.vax_app_landing_pop_up_button_text);
    }

    public void onVaccineButtonClick(View view) {
        // TODO - Route to the Vaccine Registration flow landing screen
        /*Intent launchVaccineLandingScreen = new Intent(this,
        // TODO - Add Vaccine Registration flow landing class here
        )
        startActivity(launchVaccineLandingScreen)*/
    }

    public void onPopUpClinicButtonClick(View view) {
        // TODO - Route to the Pop-Up Clinic Registration flow landing screen
        /*Intent launchPopUpClinicLandingScreen = new Intent(this,
        // TODO - Add Pop-Up Clinic Registration flow landing class here
        )
        startActivity(launchPopUpClinicLandingScreen)*/
    }
}
