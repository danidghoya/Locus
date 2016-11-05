package com.example.daniela1.locus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RentersActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageToUpload;
    Button bUploadImage,rentFinish;
    EditText description, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renters);

        imageToUpload = (ImageView) findViewById(R.id.imageToUpload);

        bUploadImage = (Button) findViewById(R.id.bUploadImage);
        rentFinish = (Button) findViewById(R.id.brentFinish);

        description = (EditText) findViewById(R.id.description);
        price = (EditText) findViewById(R.id.price);

        imageToUpload.setOnClickListener(this);
        bUploadImage.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.imageToUpload:

                break;
            case R.id.bUploadImage:

                break;
            case R.id.brentFinish:

                break;
        }
    }
}
