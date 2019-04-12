package com.example.hy.designpatternDemo.factory;

/**
 * 生产宝马车的工厂，即具体工厂类
 * Created by 陈健宇 at 2018/10/5
 */
public class BWMCarFactory extends CarFactory {
    @Override
    public Car createCar() {
        return new BWMCar();
    }
}
