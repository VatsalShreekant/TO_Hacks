package com.example.vaxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vaxapp.ui.languageselection.LanguageSelectionFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_selection_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LanguageSelectionFragment.newInstance())
                    .commitNow();
        }
    }
}