package com.example.android.singlecardappmaxine;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SingleCardAppMaxine extends AppCompatActivity {

    @Override
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, www.maxinenwaneri.com);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + 2125551212));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:60.23, -5.19"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public class MyActivity extends Activity {
        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);

            setContentView(R.layout.content_layout_id);

            final Button button = (Button) findViewById(R.id.button_id);
            button.setOnClick(new View.OnClick() {
                public void onClick(View v) {
                    // Perform action on click
                }
            });
        }
    }
}
