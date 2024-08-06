package com.meneses.apptestusers.data.network.response;

import com.google.gson.annotations.SerializedName;

/***
 *  Project: appTestUsers
 *  From: com.meneses.apptestusers.data.network.response
 * Create by Ing. Victor Manuel Meneses
 *  05/08/2024 05:43 PM
 * Allrights reserved 2024
 ***/
public class responseGeneric {
    public String getSuccess() {
        return success;
    }

    public Employee getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    @SerializedName("status") private String success;
    @SerializedName("data")private Employee data;
    @SerializedName("message")private String message;

}
