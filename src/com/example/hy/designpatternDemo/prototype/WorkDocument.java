package com.example.hy.designpatternDemo.prototype;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * 文档类型，扮演的是ConcretePrototype角色，Cloneable代表的是Prototype角色
 * Created by 陈健宇 at 2018/10/4
 */
public class WorkDocument implements Cloneable {

    private String mText;//文本
    private ArrayList<String> mImages = new ArrayList<>();//图片列表

    public WorkDocument(){
        System.out.println("WorkDocument的构造函数");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        WorkDocument document = (WorkDocument) super.clone();
        this.mText = document.mText;
        this.mImages = (ArrayList<String>) document.mImages.clone();
        return document;
    }

    public void showDocument(){
        System.out.println("============start===========");
        System.out.println("Text: " + mText);
        System.out.println("Image List:");
        for(String s : mImages){
            System.out.println("Image name: " + s);
        }
        System.out.println("=============end============");
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImage(String mImages) {
        this.mImages.add(mImages);
    }
}
