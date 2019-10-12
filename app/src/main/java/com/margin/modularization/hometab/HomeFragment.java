package com.margin.modularization.hometab;

import android.os.Bundle;

import com.margin.modularization.R;
import com.margin.base.base.BaseFragment;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 10:49
 * Description:
 */
public class HomeFragment extends BaseFragment {

    public static HomeFragment create() {

        HomeFragment fragment = new HomeFragment();
        Bundle arg = new Bundle();
        fragment.setArguments(arg);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void onBindView(Bundle savedInstanceState) {

    }
}
