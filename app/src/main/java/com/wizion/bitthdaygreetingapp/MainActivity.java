package com.wizion.bitthdaygreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaration of variables
    EditText etName;
    Button btnEnter;

    static String KEY = "BirthdayPersonName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization
        etName = findViewById(R.id.etName);
        btnEnter = findViewById(R.id.btnEnter);


        //defining intent for navigate to birthdayGreetingActivity
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the text from edittext
                String name = etName.getText().toString();

                Intent intent = new Intent(MainActivity.this,BirthdayGreetingActivity.class);
                intent.putExtra(MainActivity.KEY,name);
                startActivity(intent);
            }
        });

    }
}