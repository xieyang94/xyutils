package com.xiey94.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.xiey94.xyutils.ProperUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //读取配置文件信息
        String pwd = ProperUtil.getProperty(ProperUtil.loadProperties(this, "password.properties"), "pwd");
        Log.d("TAG", "pwd=" + pwd);
    }
}
