package com.example.android.singlecardappmaxine;

import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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

    public void OpenCalendar (View v) {
        Intent openCalenarintent = new Intent(Intent.ACTION_VIEW);
        Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
        startActivity(openCalenarintent.setData(builder.build()));

        // Click event trigger here

        Button angryButton = (Button) findViewById(R.id.angry_btn);
        angryButton.setOnClickListener(new View.OnClickListener)
        public void onClick(View v) {
        }}

            public void GoToWebsite(View v){
        Intent openWebsite=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.maxinenwaneri.com"));
        startActivity(openWebsite);
        }
}
