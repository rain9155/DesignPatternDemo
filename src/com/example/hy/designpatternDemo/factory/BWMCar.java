package com.example.hy.designpatternDemo.factory;

/**
 * 宝马汽车，即具体的产品类
 * Created by 陈健宇 at 2018/10/5
 */
public class BWMCar extends Car {
    @Override
    public void drive() {
       System.out.println("宝马汽车开始启动啦！");
    }
}
