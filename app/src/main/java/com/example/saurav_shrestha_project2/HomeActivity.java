package com.example.saurav_shrestha_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button buttonHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonHome = findViewById(R.id.buttonHome);

        buttonHome.setOnClickListener(v -> startActivity(new Intent(HomeActivity.this, LoginActivity.class)));
    }
}