package com.example.admin.quizchallenge;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity  {
    Button philosopohy, religion, mathematics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        philosopohy = (Button) findViewById(R.id.philosophy);
        religion = (Button) findViewById(R.id.religion);
        mathematics = (Button) findViewById(R.id.mathematics);

    }


    //GotoOptions is created to give the user a chance to go to the next page



    public void philosophyOne(View v) {
        Intent objIntent = new Intent(Main2Activity.this, Philosophy.class);
        startActivity(objIntent);
    }


    public void religion(View v) {
        Intent objIntent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(objIntent);
    }

    public void mathematics(View v) {
        Intent objIntent = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(objIntent);

    }
}