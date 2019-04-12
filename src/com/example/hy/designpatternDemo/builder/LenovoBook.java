package com.example.hy.designpatternDemo.builder;

/**
 * 联想电脑，把Builder与产品类封装在一起
 * Created by 陈健宇 at 2018/10/4
 */
public class LenovoBook extends Computer {

    private LenovoBook(Builder builder){
        setmOS();
        setmBroad(builder.broad);
        setmDisplay(builder.display);
    }

    @Override
    public void setmOS() {
        mOS = "Windows 10 家庭中文版";
    }

    public static class Builder extends Builder2{

        String broad;
        String display;

        @Override
        public Builder2 buildBroad(String broad) {
            this.broad = broad;
            return this;
        }

        @Override
        public Builder2 buildDisplay(String display) {
            this.display = display;
            return this;
        }

        @Override
        public Builder2 buildOS() {
            return this;
        }

        @Override
        public Computer create() {
            return new LenovoBook(this);
        }
    }
}
