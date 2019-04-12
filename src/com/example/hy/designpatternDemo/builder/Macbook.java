package com.example.hy.designpatternDemo.builder;

/**
 * 苹果电脑，具体的产品类
 * Created by 陈健宇 at 2018/10/4
 */
public class Macbook extends Computer {

    protected Macbook() {}

    @Override
    public void setmOS() {
        mOS = "Mac OS X 10.10";
    }
}
