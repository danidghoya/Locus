package com.example.daniela1.locus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

public class MyStoryActivity extends AppCompatActivity {
    EditText numbClothes, numbMisc, numbOther, phone;
    DatePicker startDate, endDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_story);

        numbClothes = (EditText) findViewById(R.id.BoxCloth);
        numbMisc = (EditText) findViewById(R.id.BoxMisc);
        numbOther = (EditText) findViewById(R.id.BoxOut);

        phone = (EditText) findViewById(R.id.phoneNumb);

        startDate = (DatePicker) findViewById(R.id.startDate);
        endDate = (DatePicker) findViewById(R.id.endDate);

    }
}
