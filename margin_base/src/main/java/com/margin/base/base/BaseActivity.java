package com.margin.base.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 19:17
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);

    }

    @Override
    public final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        onBindView(getIntent());
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

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    protected abstract int getLayoutId();

    protected abstract void onBindView(Intent intent);

}
