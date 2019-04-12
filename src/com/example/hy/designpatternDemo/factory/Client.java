package com.example.hy.designpatternDemo.factory;

/**
 * 客户端
 * Created by 陈健宇 at 2018/10/5
 */
public class Client {

    public static void main(String[] args){
        //创建工厂
        CarFactory2 carFactory = new ConcreteCarFactory2();
        //生产车
        AudiCar audiCar = carFactory.createCar(AudiCar.class);
        BenzCar benzCar = carFactory.createCar(BenzCar.class);
        BWMCar bwmCar = carFactory.createCar(BWMCar.class);
        //车启动
        audiCar.drive();
        benzCar.drive();
        bwmCar.drive();


//        //制造各个工厂
//        CarFactory audiFactory = new AudiCarFactory();
//        CarFactory benzFactory = new BenzCarFactory();
//        CarFactory bwmFactory = new BWMCarFactory();
//        //生产各种车
//        Car audiCar = audiFactory.createCar();
//        Car benzCar = benzFactory.createCar();
//        Car bwmCar = bwmFactory.createCar();
//        //车启动
//        audiCar.drive();
//        benzCar.drive();
//        bwmCar.drive();
    }

}
