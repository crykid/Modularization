package com.margin.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_login);
    }

    public void go2Home(View view) {
        go2ActivityForName("com.margin.modularization.MainActivity");
    }

    public void go2Register(View view) {
        go2ActivityForName("com.margin.register.RegisterActivity");
    }


    public void go2ActivityForName(String packageName) {
        try {
            Class aClass = Class.forName(packageName);
            Intent intent = new Intent(this, aClass);
            intent.putExtra("intent_info_hello", "from login");
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
