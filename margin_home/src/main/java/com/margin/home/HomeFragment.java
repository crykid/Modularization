package com.margin.home;

import android.os.Bundle;
import android.widget.TextView;

import com.margin.base.base.BaseFragment;
import com.margin.base.util.MarginUtils;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 10:49
 * Description:
 */
public class HomeFragment extends BaseFragment {

    TextView hello;

    public static HomeFragment create() {

        HomeFragment fragment = new HomeFragment();
        Bundle arg = new Bundle();
        fragment.setArguments(arg);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.home_fragment_home;
    }

    @Override
    protected void onBindView(Bundle savedInstanceState) {
        hello = mRootView.findViewById(R.id.tv_home_hello);

    }
}
