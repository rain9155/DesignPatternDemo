package com.example.hy.designpatternDemo.singleton.hungry;


import com.example.hy.designpatternDemo.singleton.Staff;

/**
 * 饿汉模式：
 * 公司的CEO，单例类
 * Created by 陈健宇 at 2018/10/1
 */
public class CEO extends Staff {
    private static CEO mCeo = new CEO();
    //构造函数私有
    private CEO(){}

    @Override
    public void doWork() {
        System.out.println("doWork: 我是CEO1");
    }

    //公有的静态函数，对外暴露获取单例对象的接口
    public static CEO getInstance(){
        return mCeo;
    }
}
