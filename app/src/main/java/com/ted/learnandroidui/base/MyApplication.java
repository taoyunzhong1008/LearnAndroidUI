package com.ted.learnandroidui.base;

import android.app.Application;
import android.content.Context;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * FileName:
 * com.ted.learnandroidui.base.MyApplication.java
 * Author: TT
 * Date: 2017-03-02
 * Description: <描述当前版本功能>
 */
public class MyApplication extends Application{
    public final static String TAG = "BaseApplication";
    private static MyApplication myApplication;
    private static int mainTid;

    private static List<BaseActivity> activities;

    public static Context getContext() {
        return myApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
        activities = new LinkedList<>();
        mainTid = android.os.Process.myTid();  // 获取当前线程id，即UI线程、主线程id   TED_MARK
    }

    /**
     * 获取application
     *
     * @return
     */
    public static MyApplication getApplication() {
        return myApplication;
    }

    /**
     * 获取主线程ID
     *
     * @return
     */
    public static int getMainTid() {
        return mainTid;
    }

    /**
     * 添加一个Activity
     *
     * @param activity
     */
    public void addActivity(BaseActivity activity) {
        activities.add(activity);
    }

    /**
     * 结束一个Activity
     *
     * @param activity
     */
    public void removeActivity(BaseActivity activity) {
        activities.remove(activity);
    }

    /**
     * 结束当前所有Activity
     */
    public static void clearActivities() {
        ListIterator<BaseActivity> iterator = activities.listIterator();
        BaseActivity activity;
        while (iterator.hasNext()) {
            activity = iterator.next();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /**
     * 退出应运程序
     */
    public static void quiteApplication() {
        clearActivities();
        System.exit(0);
    }
}
