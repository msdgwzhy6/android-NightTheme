package com.cxmscb.cxm.ctest;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by cxm on 2016/8/17.
 */
public class MyApplication extends Application{

    public static AppConfig appConfig;


    @Override
    public void onCreate() {
        super.onCreate();
        appConfig = new AppConfig(getApplicationContext());

    }


}
