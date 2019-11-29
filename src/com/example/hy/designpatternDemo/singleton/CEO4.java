package com.example.hy.designpatternDemo.singleton;

/**
 * 静态内部类模式
 * Created by 陈健宇 at 2018/10/1
 */
public class CEO4 extends Staff {

    private CEO4(){}

    public static CEO4 getInstanse(){
        return SingletonHolder.mCeo;
    }

    @Override
    public void doWork() {}

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static CEO4 mCeo = new CEO4();
    }

}
