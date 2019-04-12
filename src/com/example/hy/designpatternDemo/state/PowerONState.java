package com.example.hy.designpatternDemo.state;

/**
 * 开机状态，即ConcreteState角色
 * Created by 陈健宇 at 2018/10/7
 */
public class PowerONState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void preChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("音量变大");
    }

    @Override
    public void tuenDown() {
        System.out.println("音量变小");
    }
}
