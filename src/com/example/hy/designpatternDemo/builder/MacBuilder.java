package com.example.hy.designpatternDemo.builder;

/**
 * 具体的Builder类，构造苹果电脑
 * Created by 陈健宇 at 2018/10/4
 */
public class MacBuilder extends Builder {

    private Computer mComputer = new Macbook();

    @Override
    public void buildBroad(String broad) {
        mComputer.setmBroad(broad);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setmOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
