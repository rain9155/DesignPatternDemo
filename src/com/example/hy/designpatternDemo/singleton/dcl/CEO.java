package com.example.hy.designpatternDemo.singleton.dcl;

import com.example.hy.designpatternDemo.singleton.Staff;

import java.io.ObjectStreamException;

/**
 * DCL模式
 * Created by 陈健宇 at 2018/10/1
 */
public class CEO extends Staff {

    private static CEO mCeo = null;

    private CEO(){}

    @Override
    public void doWork() {

    }

    public static CEO getInstance(){
        if(mCeo == null){
            synchronized (CEO.class){
                if(mCeo == null){
                    mCeo = new CEO();
                }
            }
        }
        return mCeo;
    }

    private Object readResolve() throws ObjectStreamException {
        return mCeo;
    }

}
