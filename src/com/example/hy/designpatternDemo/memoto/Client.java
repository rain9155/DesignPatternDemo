package com.example.hy.designpatternDemo.memoto;

/**
 * 客户端
 * Created by 陈健宇 at 2018/10/16
 */
public class Client {

    public static void main(String[] args){
        //构建记事本
        NotePad notePad = new NotePad();
        //构建Caretaker
        Caretaker caretaker = new Caretaker();
        //记笔记
        notePad.note("今天发现了");
        //存档
        caretaker.storeMemoto(notePad.createMemoto());
        //退出记事本
        notePad.quit();
        //再次进入笔记本
        NotePad notePad2 = new NotePad();
        //恢复存档
        notePad2.restore(caretaker.restoreMemoto());
        //接着写
        notePad2.note("很好玩的事情");
    }

}
