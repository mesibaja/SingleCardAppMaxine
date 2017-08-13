package com.example.android.singlecardappmaxine;

import android.content.ContentUris;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingleCardAppMaxine extends AppCompatActivity {

    TextView textView;

    textView=(TextView)findViewById(R.id.activity_main_textView_Future);

    Typeface face= Typeface.createFromAsset(getAssets(), "fonts/MiltonTwoBold.ttf");

    public void SendEmail(View v) {
        Intent sendEmailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "support@thefutureisgreater.com", null));

        sendEmailIntent.putExtra(Intent.EXTRA_SUBJECT, "Please give me a call back at...");
        sendEmailIntent.putExtra(Intent.EXTRA_TEXT, "Write your message here.");
        startActivity(Intent.createChooser(sendEmailIntent, "Choose an email with Gmail etc..."));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_card_app_maxine);
    }

    public void OpenCalendar(View v) {
        Intent openCalendar = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maxinenwaneri.satoriapp.com/book"));
        startActivity(openCalendar);
    }

    public void GoToWebsite(View v) {
        Intent openWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thefutureisgreater.com"));
        startActivity(openWebsite);
    }

    public void OpenFacebook(View v) {
        Intent openFacebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/TheFutureisGreater/?ref=group_cover"));
        startActivity(openFacebook);
    }
}