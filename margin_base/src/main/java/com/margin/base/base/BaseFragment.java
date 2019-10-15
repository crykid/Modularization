package com.margin.base.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.margin.base.eventbus.EventbusMessage;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 10:10
 * Description:
 */
public abstract class BaseFragment extends Fragment {


    protected View mRootView;

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        if (getLayoutId() > 0) {
            mRootView = inflater.inflate(getLayoutId(), container, false);
        }
        onBindView(savedInstanceState);
        return mRootView;
    }

    public void go2ActivityForName(String packageName) {
        try {
            Class aClass = Class.forName(packageName);
            Intent intent = new Intent(getActivity(), aClass);
            intent.putExtra("intent_info_hello", "from home");
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventbusMessage(EventbusMessage msg) {
        handleEventbusMessage(msg);
    }

    protected void handleEventbusMessage(EventbusMessage msg) {
    }


    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    protected abstract int getLayoutId();

    protected abstract void onBindView(Bundle savedInstanceState);


}
