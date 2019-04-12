package com.example.hy.designpatternDemo.prototype;

import java.util.ArrayList;

/**
 * Client角色
 * Created by 陈健宇 at 2018/10/4
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        //1、创建文档对象
        WorkDocument originDoc = new WorkDocument();
        //2、编辑文档
        originDoc.setmText("这是一篇文档");
        originDoc.setmImage("图片1");
        originDoc.setmImage("图片2");
        originDoc.setmImage("图片3");
        originDoc.showDocument();
        //以原型文档为原型，拷贝一份副本
        WorkDocument doc2 = (WorkDocument) originDoc.clone();
        System.out.println("拷贝后：");
        doc2.showDocument();
        doc2.setmText("这是修改后的文本");
        doc2.setmImage("你好.png");//
        System.out.println("修改后的副文本：");
        doc2.showDocument();
        System.out.println("修改后的原文本：");
        originDoc.showDocument();
    }

}
