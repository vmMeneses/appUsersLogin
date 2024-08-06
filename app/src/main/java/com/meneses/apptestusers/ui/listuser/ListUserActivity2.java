package com.meneses.apptestusers.ui.listuser;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.meneses.apptestusers.R;
import com.meneses.apptestusers.data.network.response.Employee;
import com.meneses.apptestusers.ui.profile.ProfileFragment;

import java.util.ArrayList;
import java.util.List;

public class ListUserActivity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private List<Employee> listEmplyee;

    private DrawerLayout drawelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user2);

        initUI(savedInstanceState);

    }

    private void initUI(Bundle savedInstanceState) {
        /*String idUser = getIntent().getExtras().getString("idUser");
        String nameUser =getIntent().getExtras().getString("nameUser");
        String salaryUser =getIntent().getExtras().getString("salaryUser");
        String ageUser =getIntent().getExtras().getString("ageUser");
        String imageUser = getIntent().getExtras().getString("imageUser");*/
        TextView LogOut = findViewById(R.id.TextViewNameLogout);



        //initRecyclerView();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawelayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle togle = new ActionBarDrawerToggle(this, drawelayout, toolbar, R.string.open_nav, R.string.close_nav);

        drawelayout.addDrawerListener(togle);
        togle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ListEmployeesFragment()).commit();
        }



    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.e("ItemId=>", "=> " + item.getItemId());
        int itemId = item.getItemId();
        switch (itemId) {
            case 2131231041://HOme
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ListEmployeesFragment()).commit();
                break;
            case 2131231040://R.id.nav_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragment()).commit();
                break;
            case 2131231039://R.id.nav_logout:
                Toast.makeText(this, "Close Sesion", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }


        drawelayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawelayout.isDrawerOpen(GravityCompat.START)) {
            drawelayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void initRecyclerView() {
        listEmplyee = new ArrayList<Employee>();
        listEmplyee.add(new Employee(1, "Tiger Nixon", 320800, 61, ""));
        listEmplyee.add(new Employee(2, "Garrett Winters", 170750, 63, ""));
        listEmplyee.add(new Employee(3, "Ashton Cox", 86000, 66, ""));


        //RecyclerView recyclerViewUser = findViewById(R.id.RecyclerviewUser);
        //recyclerViewUser.setLayoutManager(new LinearLayoutManager(this));
        //recyclerViewUser.setAdapter(new UserAdapter(getApplicationContext(), listEmplyee));
    }
}