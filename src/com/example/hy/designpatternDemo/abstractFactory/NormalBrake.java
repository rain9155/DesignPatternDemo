package com.example.hy.designpatternDemo.abstractFactory;

/**
 * 普通制动
 * Created by 陈健宇 at 2018/10/5
 */
public class NormalBrake extends Brake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
