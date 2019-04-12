package com.example.hy.designpatternDemo.builder;

/**
 * 华硕电脑，具体的产品类
 * Created by 陈健宇 at 2018/10/4
 */
public class ASUSbook extends Computer {

    protected ASUSbook() {}

    @Override
    public void setmOS() {
        mOS = "Windows 10 专业版";
    }
}
