package com.example.hy.designpatternDemo.adapter;

/**
 * Created by 陈健宇 at 2019/2/24
 */
public class Test {
    public static void main(String[] args){
        PhoneAdapter phoneAdapter = new PhoneAdapter(new Volt220());
        System.out.println("输出电压：" + phoneAdapter.getVolt5());
    }
}
