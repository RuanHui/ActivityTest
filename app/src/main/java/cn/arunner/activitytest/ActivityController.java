package cn.arunner.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruanhui on 2017/11/5.
 */

public class ActivityController {
    public static List<Activity> activities = new ArrayList<>();
    //保存活动到list
    public static void addActivity(Activity activity) {
        activities.add(activity);
    }
    //从list移除活动
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }
    //销毁所有活动
    public static void finishAll() {
        for (Activity activity : activities) {
           if (!activity.isFinishing()) {
               activity.finish();
           }
        }
        activities.clear();
    }
}
