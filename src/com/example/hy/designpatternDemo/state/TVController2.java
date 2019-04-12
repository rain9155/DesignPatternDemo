package com.example.hy.designpatternDemo.state;

/**
 * 电视遥控器，即Context角色
 * Created by 陈健宇 at 2018/10/7
 */
public class TVController2 implements Controller {

    private TvState mState;

    public void setmState(TvState mState) {
        this.mState = mState;
    }

    @Override
    public void powerON() {
        setmState(new PowerONState());
        System.out.println("开机啦！");
    }

    @Override
    public void powerOFF() {
        setmState(new PowerOFFState());
        System.out.println("关机啦！");
    }

    public void nextChannel(){
        mState.nextChannel();
    }

    public void preChannel(){
        mState.preChannel();
    }

    public void turnUp(){
        mState.turnUp();
    }

    public void tuenDown() {
        mState.tuenDown();
    }
}
