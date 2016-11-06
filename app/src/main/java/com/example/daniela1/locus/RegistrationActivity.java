package com.example.daniela1.locus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void doneButtonGotPressed (View view)
    {
        Intent doneIntent = new Intent(this, MainActivity.class);
        startActivity(doneIntent);
    }

    public void backButtonGotPressed (View view)
    {
        Intent backIntent = new Intent(this, IntroActivity.class);
        startActivity(backIntent);
    }

    public void addUserInfo()
}
