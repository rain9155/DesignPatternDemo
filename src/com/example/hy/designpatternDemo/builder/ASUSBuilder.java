package com.example.hy.designpatternDemo.builder;

/**
 * 具体的Builder类，构造ASUS电脑
 * Created by 陈健宇 at 2018/10/4
 */
public class ASUSBuilder extends Builder2 {

    private Computer mComputer = new ASUSbook();

    @Override
    public Builder2 buildBroad(String broad) {
        mComputer.setmBroad(broad);
        return this;
    }

    @Override
    public Builder2 buildDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder2 buildOS() {
        mComputer.setmOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
