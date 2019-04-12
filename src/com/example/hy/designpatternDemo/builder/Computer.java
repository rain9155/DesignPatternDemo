package com.example.hy.designpatternDemo.builder;

/**
 * 计算机抽象类，即Product角色
 * Created by 陈健宇 at 2018/10/4
 */
public abstract class Computer {

    protected String mBroad;//主板
    protected String mDisplay;//显示器
    protected String mOS;//操作系统

    protected Computer(){}

    /**
     * 设置主板
     * @param broad
     */
    public void setmBroad(String broad){
        mBroad = broad;
    }

    /**
     * 设置显示器
     * @param display
     */
    public void setmDisplay(String display){
        mDisplay = display;
    }

    /**
     * 设置操作系统
     */
    public abstract void setmOS();

    @Override
    public String toString() {
        return "Computer {mBroad = " + mBroad + ", mDisplay = " + mDisplay + ", mOS = " + mOS + "}";
    }
}
