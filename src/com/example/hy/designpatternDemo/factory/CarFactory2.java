package com.example.hy.designpatternDemo.factory;

/**
 * 使用反射的方式来生产具体的产品对象，抽象工厂角色
 * Created by 陈健宇 at 2018/10/5
 */
public abstract class CarFactory2 {

    /**
     * 抽象工厂方法，具体生产什么产品由子类决定
     */
    public abstract <T extends Car> T createCar(Class<T> car);

}
