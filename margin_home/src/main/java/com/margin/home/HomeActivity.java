package com.margin.home;

import com.margin.base.base.BaseFragment;
import com.margin.base.base.BaseFragmentContainerActivity;

public class HomeActivity extends BaseFragmentContainerActivity {


    @Override
    protected BaseFragment getFragment() {
        return HomeFragment.create();
    }
}
