package com.example.hy.designpatternDemo.decorator;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args){
        //我买了一台手机
        Phone phone = new MIPhone();
        //我给手机买一些配件
        PhoneDecorator phoneDecorator = new PhoneDecorator(phone);
        phoneDecorator.operate();
    }

}
