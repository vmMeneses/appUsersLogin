package com.meneses.apptestusers.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.meneses.apptestusers.R;
import com.meneses.apptestusers.ui.splash.SplashActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LaunchSplashActivity();
    }

    private void LaunchSplashActivity() {
        Intent intentSplash = new Intent( getApplicationContext(), SplashActivity.class);
        startActivity(intentSplash);
    }
}