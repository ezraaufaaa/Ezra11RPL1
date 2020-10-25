package com.example.ezraapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    Button btnlogin, btnregis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnregis = (Button) findViewById(R.id.btndaftar);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, MainActivityy.class);
                startActivity(intent);
            }
        });

        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Register.this, "Button belum berfungsi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
