package com.xiey94.xyutils;

import android.content.Context;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by xiey on 2017/11/6.
 * 读取配置文件
 */

public class ProperUtil {

    public static Properties loadProperties(Context context, String propertiesName) {
        Properties props = new Properties();
        try {
            InputStream in = context.getAssets().open(propertiesName);
            props.load(in);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return props;
    }

    public static String getProperty(Properties props, String properName) {
        return props.getProperty(properName);
    }
}
