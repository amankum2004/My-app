package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class services extends AppCompatActivity {
Button serbtn1,serbtn2,serbtn3,serbtn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        serbtn1 = findViewById(R.id.serbtn1);
        serbtn2 = findViewById(R.id.serbtn2);
        serbtn3 = findViewById(R.id.serbtn3);
        serbtn4 = findViewById(R.id.serbtn4);

        serbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext1;
                iNext1 = new Intent(services.this,category.class);
                startActivity(iNext1);
            }
        });

        serbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext1;
                iNext1 = new Intent(services.this,category.class);
                startActivity(iNext1);
            }
        });


    }
}