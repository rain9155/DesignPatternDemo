package com.example.hy.designpatternDemo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 客户端，通过动态代理实现
 * Created by 陈健宇 at 2019/2/23
 */
public class Client2 {
    public static void main(String[] args) {
        //构造一个小明
        IRoom xiaoMing = new XiaoMing();
        //构造一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy(xiaoMing);
        //获取被代理类小明的ClassLoader
        ClassLoader classLoader = xiaoMing.getClass().getClassLoader();
        //动态构造一个代理人房产中介
        IRoom roomAgency = (IRoom) Proxy.newProxyInstance(classLoader, new Class[]{IRoom.class}, dynamicProxy);
        //房产中介找房
        roomAgency.watchRoom();
        //房产中介看房
        roomAgency.seekRoom();
        //房产中介租房
        roomAgency.room();
        //房产中介完成租房
        roomAgency.finish();
    }
}
