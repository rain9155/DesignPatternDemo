package com.example.hy.designpatternDemo.singleton;

/**
 * 懒汉模式
 * Created by 陈健宇 at 2018/10/1
 */
public class CEO2 extends Staff {

    private static CEO2 mCeo;

    private CEO2(){}

    @Override
    public void doWork() {

    }

    public static synchronized CEO2 getInstance(){
        if(mCeo == null){
            mCeo = new CEO2();
        }
        return mCeo;
    }
}
