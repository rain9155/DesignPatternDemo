package com.example.hy.designpatternDemo.adapter;

/**
 * 手机充电器，即Adapter角色
 * Created by 陈健宇 at 2019/2/24
 */
public class PhoneAdapter implements Volt5 {

    private Volt220 mVolt220;

    public PhoneAdapter(Volt220 volt220) {
        mVolt220 = volt220;
    }

    public int getVolt220(){
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
