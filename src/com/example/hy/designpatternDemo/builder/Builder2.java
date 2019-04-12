package com.example.hy.designpatternDemo.builder;

/**
 * 抽象Builder类
 * Created by 陈健宇 at 2018/10/4
 */
public abstract class Builder2 {

    public abstract Builder2 buildBroad(String broad);//设置主机
    public abstract Builder2 buildDisplay(String display);//设置显示器
    public abstract Builder2 buildOS();//设置操作系统
    public abstract Computer create();//创建Computer

}
