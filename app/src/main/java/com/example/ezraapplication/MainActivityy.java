package com.example.ezraapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityy extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    Button login, daftar;
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.txtuser);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        pass = (EditText) findViewById(R.id.txtpass);
        login = (Button) findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equalsIgnoreCase("ezra")
                        && pass.getText().toString().equalsIgnoreCase("aufaa")){
                    //saving ke SP
                    editor = pref.edit();
                    editor.putString("username", user.getText().toString());
                    editor.putString("status", "login");
                    editor.apply();
                    //menuju ke main menu
                    startActivity(new Intent(getApplicationContext(), MainMenu.class));
                    finish();
                }
            }
        });
    }
}