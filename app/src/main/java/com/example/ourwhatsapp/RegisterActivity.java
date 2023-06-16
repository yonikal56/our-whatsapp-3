package com.example.ourwhatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        loginButton = findViewById(R.id.navToLogin);

        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);

            startActivity(intent);
        });
    }
}
