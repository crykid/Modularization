package com.margin.base.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.margin.base.R;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 19:17
 * Description:
 */
public abstract class BaseFragmentContainerActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.base_activity_container;
    }

    @Override
    protected void onBindView(Intent intent) {

        BaseFragment fragment = getFragment();
        if (fragment == null) throw new NullPointerException("Fragment can not be empty");

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fl_base_container, fragment);
        transaction.commit();
    }

    protected abstract BaseFragment getFragment();
}
