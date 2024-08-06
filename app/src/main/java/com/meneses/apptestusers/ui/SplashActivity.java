package com.meneses.apptestusers.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.meneses.apptestusers.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       returnMain();
    }

    private void returnMain() {

        Thread threadSplash = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent intentMain = new Intent( getApplicationContext(), LoginActivity.class);
                    startActivity(intentMain);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        threadSplash.start();

    }
}