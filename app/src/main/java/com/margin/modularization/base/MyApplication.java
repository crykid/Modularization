package com.margin.modularization.base;

import android.app.Application;
import android.util.Log;

/**
 * Created by:blank
 * Created on: 2019/10/10.23:29
 * Description:
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}
