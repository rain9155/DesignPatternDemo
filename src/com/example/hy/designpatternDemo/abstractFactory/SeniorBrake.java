package com.example.hy.designpatternDemo.abstractFactory;

/**
 * 高级制动
 * Created by 陈健宇 at 2018/10/5
 */
public class SeniorBrake extends Brake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
