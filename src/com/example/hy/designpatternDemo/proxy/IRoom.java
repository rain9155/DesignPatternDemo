package com.example.hy.designpatternDemo.proxy;

/**
 * 租房步骤过程接口，即Subject角色
 * Created by 陈健宇 at 2019/2/23
 */
public interface IRoom {

    void seekRoom();//找房
    void watchRoom();//看房
    void room();//给钱租房
    void finish();//完成租房

}
