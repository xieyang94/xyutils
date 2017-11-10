package com.xiey94.simple;

import android.app.Application;

import com.xiey94.xyutils.XyUtils;

/**
 * @author xiey
 * @date created at 2017/11/10 22:33
 * @package com.xiey94.simple
 * @project XyUtils
 * @email xiey94@qq.com
 * @motto Why should our days leave us never to return?
 */

public class SampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        XyUtils.initialize(getApplicationContext());
    }
}
