package com.example.servicenovigra_livrable1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText userName,password;
    Button btnLogin_client;
    Button btLogin_employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=(EditText)findViewById(et_usernameL);
        password=(EditText)findViewById(et_password);
        btLogin_employee=(EditText)findViewById(clientbt);
        btnLogin_client=(EditText)findViewById(employeebt);
    }

}