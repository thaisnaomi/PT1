package com.example.pt1thaisnaomi_seki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
    }

    public void onClickAjuda(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }
}
