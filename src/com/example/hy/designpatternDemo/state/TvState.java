package com.example.hy.designpatternDemo.state;

/**
 * 电视状态接口，定义了状态下的行为，即State角色
 * Created by 陈健宇 at 2018/10/7
 */
public interface TvState {
     void nextChannel();
     void preChannel();
     void turnUp();
     void tuenDown();
}
