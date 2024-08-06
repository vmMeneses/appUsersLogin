package com.meneses.apptestusers.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.meneses.apptestusers.R;
import com.meneses.apptestusers.data.network.response.Employee;
import com.meneses.apptestusers.data.network.response.UserApiService;
import com.meneses.apptestusers.data.network.response.responseGeneric;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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