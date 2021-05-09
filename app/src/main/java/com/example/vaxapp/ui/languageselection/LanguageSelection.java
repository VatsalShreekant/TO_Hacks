package com.example.vaxapp.ui.languageselection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vaxapp.R;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.io.IOException;
import java.io.InputStream;

public class LanguageSelection extends AppCompatActivity {
    private boolean connected;
    Translate translate;
    private Button mtrans_en;
    private Button mtrans_fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_selection_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LanguageSelectionFragment.newInstance())
                    .commitNow();
        }

        mtrans_fr = (Button)findViewById(R.id.french_btn);
        mtrans_fr.setText(getString(R.string.french_btntxt));
        mtrans_en = (Button)findViewById(R.id.english_btn);
        mtrans_en.setText(getString(R.string.english_btntxt));

        mtrans_fr.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                if (checkInternetConnection()) {

                    //If there is internet connection, get translate service and start translation:
                    getTranslateService();
                    translate();

                } else {

                    //If not, display "no connection" warning:
                    Log.i("No internet connection", "-msg");
                }
            }
        });



    }

    public void getTranslateService() {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        try (InputStream is = getResources().openRawResource(R.raw.translate)) {

            //Get credentials:
            final GoogleCredentials myCredentials = GoogleCredentials.fromStream(is);

            //Set credentials and get translate service:
            TranslateOptions translateOptions = TranslateOptions.newBuilder().setCredentials(myCredentials).build();
            translate = translateOptions.getService();

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }

    public void translate() {

        //Get input text to be translated:
        String[] translatedText = new String[2];
        String[] originalText = {getString(R.string.french_btntxt), getString(R.string.english_btntxt)};
        Translation translation1 = translate.translate(originalText[0], Translate.TranslateOption.targetLanguage("fr"));
        Translation translation2 = translate.translate(originalText[1], Translate.TranslateOption.targetLanguage("fr"));
        translatedText[0] = translation1.getTranslatedText();
        translatedText[1] = translation2.getTranslatedText();

        //Translated text and original text are set to TextViews:
            mtrans_en.setText(translatedText[1]);
            mtrans_fr.setText(translatedText[0]);
    }

    public boolean checkInternetConnection() {

        //Check internet connection:
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        //Means that we are connected to a network (mobile or wi-fi)
        connected = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED;

        return connected;
    }
}