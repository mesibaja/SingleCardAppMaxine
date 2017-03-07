package com.example.android.singlecardappmaxine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SingleCardAppMaxine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_card_app_maxine);
    }
}
    public void honlapMethod(View view){
        goToUrl("http://www.maxinenwaneri.com/") ;
    }
    private void goToUrl(String url){
        Uri uriUrl=Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW,uriUrl);
        startActivity(launchBrowser);

    }
    public void MapMethod(View view){
        Uri gmmIntentUri = Uri.parse("geo:Bergen, Norway?z=19");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
