package com.margin.setting;

import android.os.Bundle;

import com.github.mzule.activityrouter.router.Routers;
import com.margin.base.base.BaseFragment;
import com.margin.base.eventbus.EventbusMessage;

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
        return R.layout.setting_fragment_setting;
    }

    @Override
    protected void onBindView(Bundle savedInstanceState) {
        mRootView.findViewById(R.id.btn_setting_login).setOnClickListener(v -> {

//            go2ActivityForName("com.margin.login.LoginActivity");
            //简单跳转
//            Routers.open(getActivity(),"login://LoginActivity");
            //跳转并传值,对方通过intent.getString("xxx")....
            Routers.open(getActivity(),"login://LoginActivity?phone=13412345678&password=qwer1234");
        });
    }

    @Override
    protected void handleEventbusMessage(EventbusMessage msg) {
        
    }
}
