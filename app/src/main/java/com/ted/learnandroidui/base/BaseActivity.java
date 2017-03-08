package com.ted.learnandroidui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * FileName:
 * com.ted.learnandroidui.base.BaseActivity.java
 * Author: TT
 * Date: 2017-03-02
 * Description: <描述当前版本功能>
 */
public class BaseActivity extends AppCompatActivity{

    public static BaseActivity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getApplication().addActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        activity = this;
    }

    @Override
    protected void onPause() {
        super.onPause();
        activity = null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.getApplication().removeActivity(this);
    }
}
