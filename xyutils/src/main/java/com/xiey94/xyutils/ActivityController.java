package com.xiey94.xyutils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiey on 2017/11/10.
 */

public class ActivityController {

    private static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
