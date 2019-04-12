package com.example.hy.designpatternDemo.proxy;

/**
 * 客户端，即Client角色
 * Created by 陈健宇 at 2019/2/23
 */
public class Client {
    public static void main(String[] args){
        //小明想租房
        XiaoMing xiaoMing = new XiaoMing();
        //找一个代理人，房产中介
        RoomAgency roomAgency = new RoomAgency(xiaoMing);
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
