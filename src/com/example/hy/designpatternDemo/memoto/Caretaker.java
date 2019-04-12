package com.example.hy.designpatternDemo.memoto;

/**
 * 负责管理Memoto，即Caretaker角色
 * Created by 陈健宇 at 2018/10/16
 */
public class Caretaker {
    private Memoto mMemoto;//备忘录

    //存档
    public void storeMemoto(Memoto memoto){
        mMemoto = memoto;
    }

    //获取存档
    public Memoto restoreMemoto(){
        return mMemoto;
    }
}
