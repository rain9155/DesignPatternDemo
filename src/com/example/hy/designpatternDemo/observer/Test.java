package com.example.hy.designpatternDemo.observer;

/**
 * 测试代码
 * Created by 陈健宇 at 2018/10/11
 */
public class Test {

    public static void main(String[] args){
        //新闻专栏（被观察者角色）
        NewsColumn newsColumn = new NewsColumn();
        //订阅者（观察者角色）
        SubScriber subScriber1 = new SubScriber("小宁");
        SubScriber subScriber2 = new SubScriber("小明");
        SubScriber subScriber3 = new SubScriber("李华");
        //订阅者订阅新闻（即将观察者注册到被观察者对象的观察者列表中）
        newsColumn.addObserver(subScriber1);
        newsColumn.addObserver(subScriber2);
        newsColumn.addObserver(subScriber3);
        //发布新闻
        newsColumn.postNews("今天有大事发生！");
    }

}
