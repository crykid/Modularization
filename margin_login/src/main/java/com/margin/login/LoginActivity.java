package com.margin.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.github.mzule.activityrouter.annotation.Router;
import com.margin.base.base.BaseActivity;

@Router("LoginActivity")
public class LoginActivity extends BaseActivity {
AppCompatTextView atvHello;
    @Override
    protected int getLayoutId() {
        return R.layout.login_activity_login;
    }

    @Override
    protected void onBindView(Intent intent) {
        //见setteingFragment跳转并传值
        final String phone = intent.getStringExtra("phone");
        final String password = intent.getStringExtra("password");
        atvHello=findViewById(R.id.atv_login_hello);
        atvHello.setText("phone = "+phone+", password = "+password);
    }


    public void go2Home(View view) {
        go2ActivityForName("com.margin.modularization.MainActivity");
    }

    public void go2Register(View view) {
        go2ActivityForName("com.margin.register.RegisterActivity");
    }

}
