package com.example.hy.designpatternDemo.decorator;

/**
 * 小米手机，即抽象组件的具体实现类
 */
public class MIPhone extends Phone {

    @Override
    public void operate() {
        System.out.println("一台崭新的小米手机");
    }

}
