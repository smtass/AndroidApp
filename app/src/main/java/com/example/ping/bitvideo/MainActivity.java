package com.example.ping.bitvideo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotoMagnet();

    }

    protected void gotoMagnet(){
        //start magneturlactivity
        Intent magIntent = new Intent();
        magIntent.setAction(Intent.ACTION_VIEW);
        magIntent.addCategory(Intent.CATEGORY_BROWSABLE);
        //magIntent.setData("magnet:urn:bith:XXXXXXXXXXXXXXXXXXXXXXX");
        magIntent.setClassName("com.example.ping.bitvideo","com.example.ping.bitvideo.MagnetUrlActivity");
        startActivity(magIntent);
    }
}
