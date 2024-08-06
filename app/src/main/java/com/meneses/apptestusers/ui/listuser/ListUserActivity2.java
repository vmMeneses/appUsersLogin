package com.meneses.apptestusers.ui.listuser;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.meneses.apptestusers.R;
import com.meneses.apptestusers.data.network.response.Employee;
import com.meneses.apptestusers.ui.listuser.adapter.UserAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListUserActivity2 extends AppCompatActivity {

    private List<Employee> listEmplyee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user2);

        initUI();

    }

    private void initUI() {
        /*String idUser = getIntent().getExtras().getString("idUser");
        String nameUser =getIntent().getExtras().getString("nameUser");
        String salaryUser =getIntent().getExtras().getString("salaryUser");
        String ageUser =getIntent().getExtras().getString("ageUser");
        String imageUser = getIntent().getExtras().getString("imageUser");*/


        //initRecyclerView();
    }

    private void initRecyclerView() {
        listEmplyee = new ArrayList<Employee>();
        listEmplyee.add(new Employee(1,"Tiger Nixon",320800,61,""));
        listEmplyee.add(new Employee(2,"Garrett Winters",170750,63,""));
        listEmplyee.add(new Employee(3,"Ashton Cox",86000,66,""));


        RecyclerView recyclerViewUser = findViewById(R.id.RecyclerviewUser);

        recyclerViewUser.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewUser.setAdapter(new UserAdapter(getApplicationContext(), listEmplyee));

    }
}