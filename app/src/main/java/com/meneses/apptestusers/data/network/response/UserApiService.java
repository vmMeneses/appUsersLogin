package com.meneses.apptestusers.data.network.response;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/***
 *  Project: appTestUsers
 *  From: com.meneses.apptestusers.data.network.response
 * Create by Ing. Victor Manuel Meneses
 *  05/08/2024 05:15 PM
 * Allrights reserved 2024
 ***/
//http://dummy.restapiexample.com/api/v1/employee/7
public interface UserApiService {
    @GET("employee/{id}")
    Call<responseGeneric> getUser(@Path("id") String id_user);

}
