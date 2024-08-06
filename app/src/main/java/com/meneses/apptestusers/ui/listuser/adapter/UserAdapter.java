package com.meneses.apptestusers.ui.listuser.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.meneses.apptestusers.R;
import com.meneses.apptestusers.data.network.response.Employee;

import java.util.List;

/***
 *  Project: appTestUsers
 *  From: com.meneses.apptestusers.ui.listuser.adapter
 * Create by Ing. Victor Manuel Meneses
 *  05/08/2024 07:36 PM
 * Allrights reserved 2024
 ***/
public class UserAdapter extends RecyclerView.Adapter<userViewHolder> {
    Context context;
    List<Employee> items;

    public UserAdapter(Context context, List<Employee> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public userViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userViewHolder(LayoutInflater.from(context).inflate(R.layout.item_employee, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolder holder, int position) {
        holder.idUser.setText("Id User: "+items.get(position).getId());
        holder.NameUser.setText("Name: "+items.get(position).getName());
        holder.SalaryUser.setText("Salary: $"+ items.get(position).getSalary());
        holder.AgeUser.setText("Age: "+items.get(position).getAge());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
