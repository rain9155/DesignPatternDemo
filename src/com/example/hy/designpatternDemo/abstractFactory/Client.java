package com.example.hy.designpatternDemo.abstractFactory;


/**
 * 客户端
 * Created by 陈健宇 at 2018/10/5
 */
public class Client {

    public static void main(String[] args){
         //创建一个生产奥迪的工厂
         CarFactory carFactoryAudi = new AudiCarFactory();
         carFactoryAudi.createTire().tire();
         carFactoryAudi.createEngine().engine();
         carFactoryAudi.createBrake().brake();
         System.out.println();
        //创建一个生产奔驰的工厂
         CarFactory carFactoryBenz = new BenzCarFactory();
        carFactoryBenz.createTire().tire();
        carFactoryBenz.createEngine().engine();
        carFactoryBenz.createBrake().brake();
        System.out.println();
        //创建一个生产宝马的工厂
        CarFactory carFactoryBWM = new BWMCarFactory();
        carFactoryBWM.createTire().tire();
        carFactoryBWM.createEngine().engine();
        carFactoryBWM.createBrake().brake();
    }
}
