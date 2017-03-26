package com.example.android.singlecardappmaxine;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SingleCardAppMaxine extends AppCompatActivity {

    public void SendEmail(View v) {
    Intent sendEmailIntent = new Intent(Intent.ACTION_SENDTO,
            Uri.fromParts("mailto", "maxine@maxinenwaneri.com", null));

sendEmailIntent.putExtra(Intent.EXTRA_SUBJECT, "Please give me a call back at...");
    sendEmailIntent.putExtra(Intent.EXTRA_TEXT, "Write your message here.");
    startActivity(Intent.createChooser(sendEmailIntent, "Choose an email with Gmail etc..."));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_card_app_maxine);
    }

    public void CallNumber(View v) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+4915757717173"));
        startActivity(dialIntent);
    }

public void GoToWebsite(View v){
        Intent openWebsite=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.maxinenwaneri.com"));
        startActivity(openWebsite);
        }
}