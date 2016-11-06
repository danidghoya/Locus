package com.example.daniela1.locus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginButtonGotPressed (View view)
    {
        Intent loginIntent = new Intent(this, MainActivity.class);
        startActivity(loginIntent);
    }

    public void cancelButtonGotPressed (View view)
    {
        Intent cancelIntent = new Intent(this, IntroActivity.class);
        startActivity(cancelIntent);
    }

}
