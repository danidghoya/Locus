package com.example.daniela1.locus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void signOutButtonGotPressed (View view)
    {
        Intent signOutIntent = new Intent(this, IntroActivity.class);
        startActivity(signOutIntent);
    }

    public void submitButtonGotPressed (View view)
    {
        finish();
    }
}
