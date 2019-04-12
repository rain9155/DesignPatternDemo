package com.example.hy.designpatternDemo.builder;

/**
 * Director类，负责构造Computer
 * Created by 陈健宇 at 2018/10/4
 */
public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    /**
     * 构建对象
     * @param broad
     * @param display
     */
    public void construct(String broad, String display){
        mBuilder.buildBroad(broad);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
