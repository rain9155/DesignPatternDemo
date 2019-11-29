package com.example.hy.designpatternDemo.singleton.inner;

import com.example.hy.designpatternDemo.singleton.Staff;

/**
 * 静态内部类模式
 * Created by 陈健宇 at 2018/10/1
 */
public class CEO extends Staff {

    private CEO(){}

    public static CEO getInstanse(){
        return SingletonHolder.mCeo;
    }

    @Override
    public void doWork() {}

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static CEO mCeo = new CEO();
    }

}
