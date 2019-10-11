package com.margin.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

/**
 * Created by:blank
 * Created on: 2019/10/10.23:02
 * Description:
 */
public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton abtnLogin, abtnHome;
    TextView tvHello;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity_register);


        abtnLogin = findViewById(R.id.abtn_register_btn1);
        abtnHome = findViewById(R.id.abtn_register_btn2);

        tvHello = findViewById(R.id.abtn_register_hello);


        abtnLogin.setOnClickListener(this);
        abtnHome.setOnClickListener(this);

        Intent intent = getIntent();
        String hello = intent.getStringExtra("intent_info_hello");

        tvHello.setText(hello);

    }


    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.abtn_register_btn2) {
            go2ActivityForName("com.margin.modularization.MainActivity");
        } else if (i == R.id.abtn_register_btn1) {

            go2ActivityForName("com.margin.login.LoginActivity");

        }
    }

    public void go2ActivityForName(String packageName) {
        try {
            Class aClass = Class.forName(packageName);
            Intent intent = new Intent(this, aClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


