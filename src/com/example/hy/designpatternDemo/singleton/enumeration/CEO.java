package com.example.hy.designpatternDemo.singleton.enumeration;

/**
 * 枚举模式
 * Created by 陈健宇 at 2018/10/1
 */
public enum CEO {
    INSTANCE;
    String name = "ceo";
    public void doSomething(){
        System.out.println("do Something");
    }
}
