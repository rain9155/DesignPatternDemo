package com.example.hy.designpatternDemo.singleton;

/**
 * 枚举模式
 * Created by 陈健宇 at 2018/10/1
 */
public enum CEO5{
    INSTANCE;
    String name = "ceo";
    public void doSomething(){
        System.out.println("do Something");
    }
}
