package com.margin.discovery;

import com.margin.base.base.BaseFragment;
import com.margin.base.base.BaseFragmentContainerActivity;

/**
 * Created by : mr.lu
 * Created at : 2019-10-14 at 17:55
 * Description:
 */
public class DiscoveryActivity extends BaseFragmentContainerActivity {
    @Override
    protected BaseFragment getFragment() {
        return DiscoveryFragment.create();
    }
}
