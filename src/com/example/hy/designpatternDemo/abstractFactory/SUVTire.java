package com.example.hy.designpatternDemo.abstractFactory;

/**
 * 越野轮胎
 * Created by 陈健宇 at 2018/10/5
 */
public class SUVTire extends Tire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
