package com.altaelimia.academy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    final private static int splashTimeOut = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

//                    if (FirebaseAuth.getInstance().getCurrentUser() != null) {
//                        startActivity(new Intent(SplashScreenActivity.this, NavigationActivity.class));
//                    } else {
                        Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
                        startActivity(i);
//                    }
                    finish();
                }
            }, splashTimeOut);
        }
    }