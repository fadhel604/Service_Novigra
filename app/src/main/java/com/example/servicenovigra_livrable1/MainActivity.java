package com.example.servicenovigra_livrable1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText userName,password;
    Button btnLogin_client;
    Button btnLogin_employee;
    Button  btnSign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=(EditText)findViewById(R.id.et_usernameL);
        password=(EditText)findViewById(R.id.et_password);
        btnSign_up=(EditText)findViewById(R.id.bt_signin);

        btnLogin_client=(EditText)findViewById(R.id.customerbt);


        btnLogin_client.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Welcome_cutomer.class);
                startActivity(intent);
            }
        }

        btnSign_up.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Sign_up.class);
                startActivity(intent);
            }
        }



    }

}