package com.example.hy.designpatternDemo.singleton.lazy;

import com.example.hy.designpatternDemo.singleton.Staff;

/**
 * 懒汉模式
 * Created by 陈健宇 at 2018/10/1
 */
public class CEO extends Staff {

    private static CEO mCeo;

    private CEO(){}

    @Override
    public void doWork() {

    }

    public static synchronized CEO getInstance(){
        if(mCeo == null){
            mCeo = new CEO();
        }
        return mCeo;
    }
}
