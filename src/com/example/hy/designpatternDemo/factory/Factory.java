package com.example.hy.designpatternDemo.factory;

/**
 * 一个工厂，只生产一种产品
 * Created by 陈健宇 at 2018/10/5
 */
public class Factory {

    public static Car createWuLingCar(){
        return new WuLingCar();
    }

}
