package com.example.hy.designpatternDemo.state;

/**
 * 电视机遥控器
 * Created by 陈健宇 at 2018/10/7
 */
public class TvController {
    //开机状态
    private final static int ON = 0;
    //关机状态
    private final static int OFF = 1;
    //现在状态
    private int mState = ON;

    public void  powerON(){
        mState = ON;
        if(mState == OFF){
            System.out.println("开机啦！");
        }
    }

    public void  powerOFF(){
        mState = OFF;
        if(mState == ON){
            System.out.println("关机啦！");
        }
    }

    public void nextChannel(){
        if(mState == ON){
            System.out.println("下一频道");
        }else if(mState == OFF){
            System.out.println("红灯提示没有开机");
        }
    }

    public void preChannel(){
        if(mState == ON){
            System.out.println("上一频道");
        }else if(mState == OFF){
            System.out.println("红灯提示没有开机");
        }
    }

    public void turnUp(){
        if(mState == ON){
            System.out.println("音量变大");
        }else if(mState == OFF){
            System.out.println("红灯提示没有开机");
        }
    }

    public void tuenDown(){
        if(mState == ON){
            System.out.println("音量变小");
        }else if(mState == OFF){
            System.out.println("红灯提示没有开机");
        }
    }
}
