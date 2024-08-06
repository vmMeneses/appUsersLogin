package com.meneses.apptestusers.ui.listuser.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.meneses.apptestusers.R;

/***
 *  Project: appTestUsers
 *  From: com.meneses.apptestusers.ui.listuser.adapter
 * Create by Ing. Victor Manuel Meneses
 *  05/08/2024 07:31 PM
 * Allrights reserved 2024
 ***/
public class userViewHolder extends RecyclerView.ViewHolder {

    TextView idUser;
    TextView NameUser;
    TextView SalaryUser;
    TextView AgeUser;
    TextView PhotoUser;

    public userViewHolder(@NonNull View itemView) {
        super(itemView);

        idUser.findViewById(R.id.TextViewId);
        NameUser.findViewById(R.id.TextViewName);
        SalaryUser.findViewById(R.id.TextViewSalary);
        AgeUser.findViewById(R.id.TextViewAge);

    }
}
