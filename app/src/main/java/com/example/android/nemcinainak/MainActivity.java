package com.example.android.nemcinainak;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void address(View view) {

        Intent gps = new Intent(Intent.ACTION_VIEW);
        gps.setData(Uri.parse("google.navigation:q=Námestie hraničiarov 8/A, Bratislava, Slovenko"));
        if (gps.resolveActivity(getPackageManager()) != null) {
            startActivity(gps);

        }
    }
}
