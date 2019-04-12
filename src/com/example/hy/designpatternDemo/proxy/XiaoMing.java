package com.example.hy.designpatternDemo.proxy;

/**
 * 想要租房的小明，即RealSubject角色
 * Created by 陈健宇 at 2019/2/23
 */
public class XiaoMing implements IRoom {

    @Override
    public void seekRoom() {
        System.out.println("找房");
    }

    @Override
    public void watchRoom() {
        System.out.println("看房");
    }

    @Override
    public void room() {
        System.out.println("给钱租房");
    }

    @Override
    public void finish() {
        System.out.println("完成租房");
    }
}
