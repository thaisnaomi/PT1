package com.example.pt1thaisnaomi_seki;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/*
 *Author: Thaís Naomi Seki
 */

public class HelpActivity extends AppCompatActivity {

    public static final String TAG="HelpActivity";
    DisplayMessage dm = new DisplayMessage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        dm.displayMessage(TAG, "Obriu la pantalla d'ajuda");

    }
}
