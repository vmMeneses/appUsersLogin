package com.meneses.apptestusers.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.meneses.apptestusers.R;
import com.meneses.apptestusers.data.network.response.UserApiService;
import com.meneses.apptestusers.data.network.response.responseGeneric;
import com.meneses.apptestusers.di.NetworkModule;
import com.meneses.apptestusers.ui.listuser.ListUserActivity2;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUI();
    }

    private void initUI() {
        Button buttonLogin = findViewById(R.id.ButtonLogin);
        EditText editTextIdUSer = findViewById(R.id.EditTextIdUser);
        buttonLogin.setEnabled(false);

        editTextIdUSer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String idUser = editTextIdUSer.getText().toString().trim();
                if(idUser.isEmpty()){
                    buttonLogin.setEnabled(false);
                }else{
                    buttonLogin.setEnabled(true);
                }
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idUser = editTextIdUSer.getText().toString().trim();
                /*if(idUser.isEmpty()){
                    buttonLogin.setEnabled(false);
                    Toast.makeText(LoginActivity.this, "Ingrese un ID válido", Toast.LENGTH_SHORT).show();
                }else{*/
                    pruebadePeticion(idUser);
                    buttonLogin.setEnabled(true);
                    //launchActivityLstSimple();
                //}

            }
        });
    }


    private void pruebadePeticion(String id_user) {
        NetworkModule retrofit = new NetworkModule();

        UserApiService service = retrofit.getRetrofit().create(UserApiService.class);

        Call<responseGeneric> call = service.getUser(id_user);

        call.enqueue(new Callback<responseGeneric>() {
            @Override
            public void onResponse(Call<responseGeneric> call, Response<responseGeneric> response) {

                if(response.isSuccessful()){
                    Log.e("ResponseService","Code =>"+response.code());
                    Log.e("ResponseService","Data =>"+response.body().getData().getName());
                    int id_user = response.body().getData().getId();
                    String name_user = response.body().getData().getName();
                    float salary = response.body().getData().getSalary();
                    int age = response.body().getData().getAge();
                    String profile_image = response.body().getData().getImage_profile();
                    launchActivityList(id_user,name_user,salary,age,profile_image);
                    Toast.makeText(LoginActivity.this, "Bienvenido "+name_user, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<responseGeneric> call, Throwable t) {
                Log.e("ResponseService","Exception =>"+t.getMessage());
            }
        });
    }

    private void launchActivityList(int idUser, String nameUser, float salary, int age, String profileImage) {
        Intent intentList = new Intent( getApplicationContext(), ListUserActivity2.class);
        intentList.putExtra("idUser",idUser);
        intentList.putExtra("nameUser",nameUser);
        intentList.putExtra("salaryUser",salary);
        intentList.putExtra("ageUser",age);
        intentList.putExtra("imageUser",profileImage);
        startActivity(intentList);
    }

    private void launchActivityLstSimple() {
        Intent intentList = new Intent( getApplicationContext(), ListUserActivity2.class);
        startActivity(intentList);
    }
}