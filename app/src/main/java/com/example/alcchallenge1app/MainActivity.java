package com.example.alcchallenge1app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*  Button Methods    */
    //Call onClickAbout() when this button1 is clicked
    public void onClickAbout(View v){
        Intent intent1 = new Intent(this, AboutActivity.class);
        startActivity(intent1);

    }
    //Call onClickProfile() when this button2 is clicked
    public void onClickProfile(View v){
        Intent intent2 = new Intent(this, ProfileActivity.class);
        startActivity(intent2);
    }
}


