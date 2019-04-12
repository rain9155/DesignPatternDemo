package com.example.hy.designpatternDemo.factory;

/**
 * 生产奥迪车的工厂，即具体工厂类
 * Created by 陈健宇 at 2018/10/5
 */
public class AudiCarFactory extends CarFactory {

    @Override
    public Car createCar() {
        return new AudiCar();
    }

}
