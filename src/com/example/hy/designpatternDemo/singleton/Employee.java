package com.example.hy.designpatternDemo.singleton;


/**
 * 公司的普通员工
 * Created by 陈健宇 at 2018/10/1
 */
public class Employee extends Staff {

    @Override
    public void doWork() {
        System.out.println("doWork: 我是员工");
    }
}
