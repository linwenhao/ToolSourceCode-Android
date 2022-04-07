package com.linwh.helper.activity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * author : linwenhao
 * date   : 2022/4/7 14:14
 * desc   :
 * version: 1.0
 */
public class ActivityCollector {
    private static List<Activity> mActivities=new ArrayList<>();
    public static void addActivity(Activity activity){
        mActivities.add(activity);
    }
    public static void removeActivity(Activity activity){
        mActivities.remove(activity);
    }
    public static void finishAll(){
        for (int i = 0; i < mActivities.size(); i++) {
            mActivities.get(i).finish();
        }
        mActivities.clear();
    }

}
