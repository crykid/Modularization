package com.margin.discovery;

import android.os.Bundle;

import com.margin.base.base.BaseFragment;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 11:01
 * Description:
 */
public class DiscoveryFragment extends BaseFragment {


    public static DiscoveryFragment create() {
        DiscoveryFragment fragment = new DiscoveryFragment();
        Bundle arg = new Bundle();
        fragment.setArguments(arg);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.discovery_fragment_discovery;
    }

    @Override
    protected void onBindView(Bundle savedInstanceState) {

    }
}
