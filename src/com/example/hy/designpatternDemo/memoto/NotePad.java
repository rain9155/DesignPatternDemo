package com.example.hy.designpatternDemo.memoto;

/**
 * 记事本软件，即Originator角色
 * Created by 陈健宇 at 2018/10/16
 */
public class NotePad {

    private String mText = "";

    //在记事本上写文本
    public void note(String text){
        mText += text;
        System.out.println("写笔记：" + mText);
    }

    //退出记事本
    public void quit(){
        System.out.println( "退出记事本！" + "当前文本：" + mText);
    }

    //创建备忘录
    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.text = mText;
        return memoto;
    }

    //恢复存档
    public void restore(Memoto memoto){
       mText = memoto.text;
       System.out.println("恢复后的记事本文本：" + mText);
    }
}
