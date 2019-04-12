package com.example.hy.designpatternDemo.decorator;

/**
 * 表示装饰手机，即装饰者角色
 */
public class PhoneDecorator extends Phone{

    private Phone mPhone;//保持一个对被装饰者的引用

    public PhoneDecorator(Phone phone){
        this.mPhone = phone;
    }

    @Override
    public void operate() {
        operateA();
        mPhone.operate();//调用Phone类中的operate方法
        operateB();
    }

    private void operateA(){
        System.out.println("装上手机套");
    }

    private void operateB(){
        System.out.println("贴膜");
    }
}
