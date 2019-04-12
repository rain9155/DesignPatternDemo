package com.example.hy.designpatternDemo.observer;

import java.util.Observable;

/**
 * 新闻专栏，即被观察者角色，当它有更新时通知所有观察者（这里是订阅者）
 * Created by 陈健宇 at 2018/10/11
 */
public class NewsColumn extends Observable {

    /**
     * 发布新闻
     * @param content 新闻内容
     */
    public void postNews(String content){
        //设置标志位为true，表示有新内容
        setChanged();
        //通知所有观察者（即订阅了这新闻的人们）
        notifyObservers(content);
    }

}
