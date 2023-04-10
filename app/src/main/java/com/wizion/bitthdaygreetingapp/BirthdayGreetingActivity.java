package com.wizion.bitthdaygreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        String name = getIntent().getStringExtra(MainActivity.KEY);
        tvName = findViewById(R.id.tvName);
        tvName.setText(name);

    }
}