package com.example.pt1thaisnaomi_seki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
 *Author: Thaís Naomi Seki
 */

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MainActivity";
    DisplayMessage dm = new DisplayMessage();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dm.displayMessage(TAG, "Obriu la pantalla Principal");

    }

    public void onClickAjuda(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
        dm.displayMessage(TAG, "Obriu a la pantalla d'ajuda des de la patalla principal");

    }

    public void onClickCreaCompte(View view) {
        Intent intent = new Intent(this, NewUserActivity.class);
        startActivity(intent);
        dm.displayMessage(TAG, "Obriu la pantalla Nou usuari");
    }




}
