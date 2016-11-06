package com.example.daniela1.locus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.daniela1.locus.R.id.textView;
import static com.example.daniela1.locus.R.id.textView2;
import static com.example.daniela1.locus.R.id.textView3;
import static com.example.daniela1.locus.R.id.textView4;
import static com.example.daniela1.locus.R.id.textView5;
import static com.example.daniela1.locus.R.id.textView6;

public class RegistrationActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void doneButtonGotPressed(View view) {
        Intent doneIntent = new Intent(this, MainActivity.class);
        startActivity(doneIntent);
    }

    public void backButtonGotPressed(View view) {
        Intent backIntent = new Intent(this, IntroActivity.class);
        startActivity(backIntent);
    }
<<<<<<< HEAD

    public void addFirstName(View view) {
        EditText firstNameEditText = (EditText) findViewById(textView);
        String sUsername;
        sUsername = firstNameEditText.getText().toString();
        if (sUsername.matches("")) {
            Toast.makeText(this, "You did not enter a first name", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void addLastName(View view) {
        EditText lastNameEditText = (EditText) findViewById(textView2);
        String sUsername;
        sUsername = lastNameEditText.getText().toString();
        if (sUsername.matches("")) {
            Toast.makeText(this, "You did not enter a last name", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void addUsername(View view) {
        EditText usernameEditText = (EditText) findViewById(textView3);
        String sUsername;
        sUsername = usernameEditText.getText().toString();
        if (sUsername.matches("")) {
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void addPassword(View view) {
        EditText passwordEditText = (EditText) findViewById(textView4);
        String sUsername;
        sUsername = passwordEditText.getText().toString();
        if (sUsername.matches("")) {
            Toast.makeText(this, "You did not enter a password", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void addPhoneNumber(View view) {
        EditText phoneNumberEditText = (EditText) findViewById(textView5);
        String sUsername;
        sUsername = phoneNumberEditText.getText().toString();
        if (sUsername.matches("")) {
            Toast.makeText(this, "You did not enter a phone number", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void addEmail(View view) {
        EditText emailEditText = (EditText) findViewById(textView6);
        String sUsername;
        sUsername = emailEditText.getText().toString();
        if (sUsername.matches("")) {
            Toast.makeText(this, "You did not enter an email", Toast.LENGTH_SHORT).show();
            return;
        }
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Registration Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
=======
>>>>>>> b890b551ecd0c47c2b5c7e6733999bf799afd92e
}
