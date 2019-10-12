package com.margin.base.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 19:17
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public final void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        onBindView(getIntent());
    }

    protected abstract int getLayoutId();

    protected abstract void onBindView(Intent intent);
}
