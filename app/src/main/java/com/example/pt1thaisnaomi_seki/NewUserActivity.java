package com.example.pt1thaisnaomi_seki;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*
*Author: Thaís Naomi Seki
*/

public class NewUserActivity extends AppCompatActivity {

    DisplayMessage dm = new DisplayMessage();


    EditText edtTxtUser;
    EditText edtTxtEmail;
    EditText edtTxtPhone;
    EditText edtTxtPasswd;
    EditText edtTxtPasswdRpt;
    RadioGroup radioSexGroup;
    RadioButton radioSexButton;
    public static final String TAG="NewUserActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);


        edtTxtUser = findViewById(R.id.edtTxtUser);
        edtTxtEmail = findViewById(R.id.edtTxtEmail);
        edtTxtPhone = findViewById(R.id.edtTxtPhone);
        edtTxtPasswd = findViewById(R.id.edtTxtPasswd);
        edtTxtPasswdRpt = findViewById(R.id.edtTxtPasswdRpt);
        radioSexGroup = findViewById(R.id.radioSex);
    }


    public void onClickAjuda(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
        dm.displayMessage(TAG, "Aneu a la pantalla d’ajuda des de la pantalla d’nou usuari");
    }

    public void onClickMale(View view) {
        RadioButton cbFemale = (RadioButton) findViewById(R.id.radioFemale);
        cbFemale.setChecked(false);
        dm.displayMessage(TAG, "Selecciona el valor de l'home al camp sexe");
    }

    public void onClickFemale(View view) {
        RadioButton cbFemale = (RadioButton) findViewById(R.id.radioMale);
        cbFemale.setChecked(false);
        dm.displayMessage(TAG, "Selecciona el valor de la dona al camp sexe");
    }


    public void onClickNewUser(View view) {

        String nom = edtTxtUser.getText().toString();
        String correu = edtTxtEmail.getText().toString();
        String telefon = edtTxtPhone.getText().toString();
        String passwd = edtTxtPasswd.getText().toString();
        String passwdConfirm = edtTxtPasswdRpt.getText().toString();
        int selectedId = radioSexGroup.getCheckedRadioButtonId();
        radioSexButton = findViewById(selectedId);
        String text="";
        boolean podeCriar = true;

        if(!passwd.equals(passwdConfirm)){
            dm.displayMessage(TAG, "Demostra que la contrasenya i la contrasenya són les mateixes");
            podeCriar = false;
            Toast.makeText(this, "Les contrasenyes han de coincidir!" , Toast.LENGTH_LONG).show();
        }
        if(nom.isEmpty()){
            dm.displayMessage(TAG, "Demostra que s'ha introduït valor al camp nom");
            podeCriar = false;
            Toast.makeText(this, "Introduïu un nom." , Toast.LENGTH_LONG).show();
        }
        if(correu.isEmpty()){
            dm.displayMessage(TAG, "Demostra que s'ha introduït valor al camp correu");
            podeCriar = false;
            Toast.makeText(this, "Introduïu un correu" , Toast.LENGTH_LONG).show();
        }
        if(telefon.isEmpty()){
            dm.displayMessage(TAG, "Demostra que s'ha introduït valor al camp telèfon");
            podeCriar = false;
            Toast.makeText(this, "Introduïu un telèfon" , Toast.LENGTH_LONG).show();
        }
        if(passwd.isEmpty()){
            dm.displayMessage(TAG, "Demostra que s'ha introduït valor al camp contrasenya");
            podeCriar = false;
            Toast.makeText(this, "Introduïu un password" , Toast.LENGTH_LONG).show();
        }
        if(passwdConfirm.isEmpty()){
            dm.displayMessage(TAG, "Demostra que s'ha introduït valor al camp contrasenya confirm");
            podeCriar = false;
            Toast.makeText(this, "Introduïu un password confirm" , Toast.LENGTH_LONG).show();
        }


        if(podeCriar){
            dm.displayMessage(TAG, "Monta el text per mostra-ho en Log.d");
            text += "Si heu creat un compte nou! User: "+nom;
            text +=  ". Correu electrònic: " + correu;
            text +=  ". Telèfon: "+telefon;
            text +=  ". Contrasenya: " + passwd;
            text += ". Sexe: " + radioSexButton.getText();
            //Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
            dm.displayMessage(TAG, text);
        }

    }


}
