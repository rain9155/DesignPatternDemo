package com.example.hy.designpatternDemo.proxy;

/**
 * 代理人房产中介，即ProxySubject角色
 * Created by 陈健宇 at 2019/2/23
 */
public class RoomAgency implements IRoom {

    private IRoom mRoom;//持有一个具体被代理人的引用

    public RoomAgency(IRoom room){
        this.mRoom = room;
    }

    @Override
    public void seekRoom() {
        mRoom.seekRoom();
    }

    @Override
    public void watchRoom() {
        mRoom.watchRoom();
    }

    @Override
    public void room() {
        mRoom.room();
    }

    @Override
    public void finish() {
        mRoom.finish();
    }
}
