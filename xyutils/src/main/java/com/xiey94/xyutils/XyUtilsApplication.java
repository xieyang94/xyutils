package com.xiey94.xyutils;

import android.app.Application;
import android.content.Context;

/**
 * @author xiey
 * @date created at 2017/11/10 22:24
 * @package com.xiey94.xyutils
 * @project XyUtils
 * @email xiey94@qq.com
 * @motto Why should our days leave us never to return?
 */

public class XyUtilsApplication extends Application {

    static Context mContext;

    public XyUtilsApplication() {
        mContext = this;
    }

    public static void initialize(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        if (mContext == null) {
            throw new NullPointerException("the Context is null");
        }
        return mContext;
    }


}
