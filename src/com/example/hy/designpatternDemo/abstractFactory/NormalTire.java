package com.example.hy.designpatternDemo.abstractFactory;

/**
 * 普通轮胎
 * Created by 陈健宇 at 2018/10/5
 */
public class NormalTire extends Tire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
