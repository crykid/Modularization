package com.margin.modularization;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.margin.base.base.BaseActivity;
import com.margin.base.base.BaseFragment;
import com.margin.discovery.DiscoveryFragment;
import com.margin.home.HomeFragment;
import com.margin.modularization.hometab.SettingFragment;


public class MainActivity extends BaseActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    private static final String TAG = "MainActivity";
    AppCompatButton abtnLogin, abtnRegister, abtnHome;
    RadioButton rbtnHomde, rbtnDiscovery, rbtnSetting;
    RadioGroup radioGroup;
    FrameLayout fragmentContainer;
    BaseFragment mCurrentFragment;
    HomeFragment homeFragment;
    DiscoveryFragment discoveryFragment;
    SettingFragment settingFragment;



    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onBindView(Intent intent) {

        fragmentContainer = findViewById(R.id.fl_main_viewparent);
        rbtnHomde = findViewById(R.id.rbtn_main_home);
        rbtnDiscovery = findViewById(R.id.rbtn_main_discovery);
        rbtnSetting = findViewById(R.id.rbtn_main_setting);
        radioGroup = findViewById(R.id.rgoup_main);
        radioGroup.setOnCheckedChangeListener(this);


        homeFragment = HomeFragment.create();
        discoveryFragment = DiscoveryFragment.create();
        settingFragment = SettingFragment.create();

        switchFragment(homeFragment);
    }


    @Override
    public void onClick(View v) {

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


    private void switchFragment(BaseFragment fragment) {

        //防重复点击
        if (mCurrentFragment != fragment) {

            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            if (!fragment.isAdded()) {
                //加载第一个fragment
                if (mCurrentFragment == null) {
                    transaction.add(R.id.fl_main_viewparent, fragment);
                } else {
                    transaction.hide(mCurrentFragment).add(R.id.fl_main_viewparent, fragment);
                }
            } else {
                transaction.hide(mCurrentFragment).show(fragment);
            }
            mCurrentFragment = fragment;
            transaction.commitAllowingStateLoss();
        }

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        final int id = group.getCheckedRadioButtonId();
        Log.d(TAG, "onCheckedChanged: " + id);
        switch (id) {
            case R.id.rbtn_main_home:
                switchFragment(homeFragment);
                break;
            case R.id.rbtn_main_discovery:
                switchFragment(discoveryFragment);
                break;
            case R.id.rbtn_main_setting:
                switchFragment(settingFragment);
                break;
        }
    }
}
