package com.margin.base.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by : mr.lu
 * Created at : 2019-10-12 at 10:10
 * Description:
 */
public abstract class BaseFragment extends Fragment {



    protected  View mRootView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        if (getLayoutId() > 0) {
            mRootView = inflater.inflate(getLayoutId(), container, false);
        }
        onBindView(savedInstanceState);
        return mRootView;
    }

    protected abstract int getLayoutId();

    protected abstract void onBindView(Bundle savedInstanceState);
}
