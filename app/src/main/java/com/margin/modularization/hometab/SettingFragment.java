package com.margin.modularization.hometab;

import android.os.Bundle;

import com.margin.modularization.R;
import com.margin.base.base.BaseFragment;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 11:01
 * Description:
 */
public class SettingFragment extends BaseFragment {
    public static SettingFragment create() {

        SettingFragment f = new SettingFragment();
        Bundle arg = new Bundle();
        f.setArguments(arg);
        return f;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_setting;
    }

    @Override
    protected void onBindView(Bundle savedInstanceState) {

    }
}
