package com.margin.setting;

import com.margin.base.base.BaseFragment;
import com.margin.base.base.BaseFragmentContainerActivity;

/**
 * Created by:blank
 * Created on: 2019/10/14.22:54
 * Description:
 */
public class SettingActivity extends BaseFragmentContainerActivity {

    @Override
    protected BaseFragment getFragment() {

        return SettingFragment.create();
    }
}
