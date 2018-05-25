package com.example.surejahit.camera_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button loginbtn;
    private EditText ipaddress;
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn = findViewById(R.id.btn);
        ipaddress = findViewById(R.id.ipAdd);
        username = findViewById(R.id.uName);
        password = findViewById(R.id.Pwd);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(a);
            }
        });


    }



}
