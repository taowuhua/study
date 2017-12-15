package com.example.zt.myhotfix_mutidex;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lhx on 2017/12/14.
 */

public class MyTestClass {
    public void testFix(Context context) {
        int i = 10;
        int a = 0;
        Toast.makeText(context, "结果："+i/a, Toast.LENGTH_SHORT).show();
    }
}
