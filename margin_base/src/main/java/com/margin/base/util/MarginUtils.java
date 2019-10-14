package com.margin.base.util;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

import java.util.List;

/**
 * Created by : mr.lu
 * Created at : 2019-10-14 at 09:48
 * Description:
 */
public class MarginUtils {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP_MR1)
    public static String getPhoneNumber(Activity context) throws SecurityException {

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_STATE) != PermissionChecker.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(context, new String[]{Manifest.permission.READ_PHONE_STATE}, 0);
        } else if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_PHONE_NUMBERS) != PermissionChecker.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(context, new String[]{Manifest.permission.READ_PHONE_NUMBERS}, 0);
        }

        SubscriptionManager mSubscriptionManager = (SubscriptionManager) context.getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE);
        mSubscriptionManager.getActiveSubscriptionInfoCountMax();//手机SIM卡数
        mSubscriptionManager.getActiveSubscriptionInfoCount();//手机使用的SIM卡数
        List<SubscriptionInfo> activeSubscriptionInfoList = mSubscriptionManager.getActiveSubscriptionInfoList();//手机SIM卡信息
        String number = activeSubscriptionInfoList.get(0).getNumber();
        return (number != null ? number : "NA");
    }
}
