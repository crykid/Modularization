package com.margin.modularization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    AppCompatButton abtnLogin, abtnRegister, abtnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abtnLogin = findViewById(R.id.abtn_main_login);
        abtnRegister = findViewById(R.id.abtn_main_register);
        abtnHome = findViewById(R.id.abtn_main_home);

        abtnLogin.setOnClickListener(this);
        abtnRegister.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.abtn_main_login) {
            go2ActivityForName("com.margin.login.LoginActivity");
        } else if (i == R.id.abtn_main_register) {
            go2ActivityForName("com.margin.register.RegisterActivity");
        } else if (i == R.id.abtn_main_home) {
        }
    }

    public void go2ActivityForName(String packageName) {
        try {
            Class aClass = Class.forName(packageName);
            Intent intent = new Intent(this, aClass);
            intent.putExtra("intent_info_hello", "from home");
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
