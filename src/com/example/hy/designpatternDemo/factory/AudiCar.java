package com.example.hy.designpatternDemo.factory;

/**
 * 奥迪汽车，即具体的产品类
 * Created by 陈健宇 at 2018/10/5
 */
public class AudiCar extends Car {
    @Override
    public void drive() {
        System.out.println("奥迪汽车开始启动啦！");
    }
}
