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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = null;
        if (getLayoutId() > 0) {
            view = inflater.inflate(getLayoutId(), container, false);
        }
        onBindView(savedInstanceState);
        return view;
    }

    protected abstract int getLayoutId();

    protected abstract void onBindView(Bundle savedInstanceState);
}
