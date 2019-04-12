package com.example.hy.designpatternDemo.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 订阅者，订阅了新闻的人，即观察者角色
 * Created by 陈健宇 at 2018/10/11
 */
public class SubScriber implements Observer {

    private String name;

    public SubScriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("你好！" + name + ", 新闻专栏更新啦！" + arg);
    }

    @Override
    public String toString() {
        return "订阅者： " + name;
    }
}
