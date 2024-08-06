package com.meneses.apptestusers.data.network.response;

import com.google.gson.annotations.SerializedName;

/***
 *  Project: appTestUsers
 *  From: com.meneses.apptestusers.data.network.response
 * Create by Ing. Victor Manuel Meneses
 *  05/08/2024 05:12 PM
 * Allrights reserved 2024
 ***/
public class Employee {

    @SerializedName("id")private int id;
    @SerializedName("employee_name")private String name;
    @SerializedName("employee_salary")private float salary;
    @SerializedName("employee_age")private int age ;
    @SerializedName("profile_image")private String image_profile;

    public Employee(){

    }

    public Employee(int id, String name, float salary, int age, String image_profile) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.image_profile = image_profile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getImage_profile() {
        return image_profile;
    }


}
