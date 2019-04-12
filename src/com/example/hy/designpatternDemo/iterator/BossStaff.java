package com.example.hy.designpatternDemo.iterator;

/**
 * 老板，即ConcreteHandler角色
 * Created by 陈健宇 at 2018/10/8
 */
public class BossStaff extends Staff {
    @Override
    public int getHandlerLever() {
        return 3;
    }

    @Override
    public void handle(Contract contract) {
        System.out.println("老板签名了合同！");
    }
}
