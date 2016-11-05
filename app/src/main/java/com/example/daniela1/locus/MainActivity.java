package com.example.daniela1.locus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lookingButtonGotPressed(View view)
    {
        Intent lookingIntent = new Intent(this, lookingActivity.class);
        startActivity(lookingIntent);
    }
    public void rentingButtonGotPressed (View view)
    {
        Intent rentingIntent = new Intent(this, RentersActivity.class);
        startActivity(rentingIntent);
    }
}
