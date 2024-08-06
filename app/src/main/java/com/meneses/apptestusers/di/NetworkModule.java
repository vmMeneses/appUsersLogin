package com.meneses.apptestusers.di;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/***
 *  Project: appTestUsers
 *  From: com.meneses.apptestusers.di
 * Create by Ing. Victor Manuel Meneses
 *  05/08/2024 06:42 PM
 * Allrights reserved 2024
 ***/
public class NetworkModule {




    public Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
