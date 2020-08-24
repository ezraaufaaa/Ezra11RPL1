package com.example.ezraapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View v){
        e1=(EditText) findViewById(R.id.editText1);
        e2=(EditText) findViewById(R.id.editText2);

        String User= e1.getText().toString();
        String Pass = e2.getText().toString();
        if (e1.getText().toString().isEmpty() && e2.getText().toString().isEmpty()){
            Toast.makeText(this, "Mohon jangan dikosongi", Toast.LENGTH_SHORT).show();
        }
        else if (e1.getText().toString().isEmpty()){
            Toast.makeText(this, "Username  tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
        else if (e2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
        else if (e1.getText().toString().equals("admin") && e2.getText().toString().equals("admin")) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();

        }
        else  {
            Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
        }
    }
}
