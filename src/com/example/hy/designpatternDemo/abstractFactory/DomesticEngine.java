package com.example.hy.designpatternDemo.abstractFactory;

/**
 * 国产发动机
 * Created by 陈健宇 at 2018/10/5
 */
public class DomesticEngine extends Engine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
