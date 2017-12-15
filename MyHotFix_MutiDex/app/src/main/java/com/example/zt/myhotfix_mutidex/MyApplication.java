package com.example.zt.myhotfix_mutidex;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import com.example.zt.myhotfix_mutidex.FixUtils.FixDexUtils;


/**
 * Created by lhx on 2017/12/13.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
    }
    @Override
    protected void attachBaseContext(Context base) {
        // TODO Auto-generated method stub
        MultiDex.install(base);
        FixDexUtils.loadFixedDex(base);
        super.attachBaseContext(base);
    }
}
