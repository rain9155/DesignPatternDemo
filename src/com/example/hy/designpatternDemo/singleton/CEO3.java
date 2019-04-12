package com.example.hy.designpatternDemo.singleton;

import java.io.ObjectStreamException;

/**
 * DCL模式
 * Created by 陈健宇 at 2018/10/1
 */
public class CEO3 extends Staff {

    private static CEO3 mCeo = null;

    private CEO3(){}

    @Override
    public void doWork() {

    }

    public static CEO3 getInstance(){
        if(mCeo == null){
            synchronized (CEO3.class){
                if(mCeo == null){
                    mCeo = new CEO3();
                }
            }
        }
        return mCeo;
    }

    private Object readResolve() throws ObjectStreamException {
        return mCeo;
    }

}
