package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitivity);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

               Intent intent = new Intent(splashAcitivity.this,MainActivity.class);
            startActivity(intent);
            finish();
            }
        } ,3000);
    }

}