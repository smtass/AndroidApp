package com.example.ping.bitvideo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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
        magIntent.setData(Uri.parse("magnet:?xt=urn:btih:03621694F0E8B2CE87216C99CB5CA3AF23029E37"));
        magIntent.setClassName("com.example.ping.bitvideo","com.example.ping.bitvideo.MagnetUrlActivity");
        startActivity(magIntent);
    }
}
