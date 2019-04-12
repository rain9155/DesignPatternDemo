package com.example.hy.designpatternDemo.abstractFactory;

/**
 * 抽象汽车工厂，即抽象工厂角色
 * Created by 陈健宇 at 2018/10/5
 */
public abstract class CarFactory {
    public abstract Tire createTire();//生产轮胎
    public abstract Engine createEngine();//生产发动机
    public abstract Brake createBrake();//生产制动
}
