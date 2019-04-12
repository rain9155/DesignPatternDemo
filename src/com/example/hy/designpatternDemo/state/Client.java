package com.example.hy.designpatternDemo.state;

/**
 * 测试代码
 * Created by 陈健宇 at 2018/10/7
 */
public class Client {

    public static void main(String[] args){
        TVController2 tvController = new TVController2();
        //设置电视开机状态
        tvController.powerON();
        tvController.nextChannel();//下一个频道
        tvController.tuenDown();//调低音量
        //设置电视关机状态
        tvController.powerOFF();
        tvController.nextChannel();//下一个频道
        tvController.tuenDown();//调低音量
    }

}
