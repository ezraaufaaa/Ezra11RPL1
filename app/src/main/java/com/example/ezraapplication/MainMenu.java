package com.example.ezraapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainMenu extends AppCompatActivity {
    CardView menu1;
    CardView menu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu1 = (CardView)findViewById(R.id.menu1);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ListData.class));
            }
        });
        menu2 = (CardView)findViewById(R.id.menu2);
    }
}