package com.example.hy.designpatternDemo.builder;

/**
 * 测试代码
 * Created by 陈健宇 at 2018/10/4
 */
public class Test {

    public static void main(String[] args){

       LenovoBook lenovoBook = (LenovoBook) new LenovoBook.Builder()
               .buildOS()
               .buildBroad("联想主板")
               .buildDisplay("联想显示器")
               .create();

       System.out.println("Computer Info: " + lenovoBook.toString());

//        Builder2 builder2 = new ASUSBuilder();
//        ASUSbook asusbook = (ASUSbook) builder2
//                .buildBroad("AMDB350socketAM4")
//                .buildDisplay("AOC 显示器")
//                .buildOS()
//                .create();
//        System.out.println("Computer Info: " + asusbook.toString());
//        Builder builder = new MacBuilder();
//        Director director = new Director(builder);
//        director.construct("英特尔主板", "Retina 显示器");
//        System.out.println("Computer Info: " + builder.create().toString());
    }
}
