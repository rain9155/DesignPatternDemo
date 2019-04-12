package com.example.hy.designpatternDemo.iterator;

/**
 * 经理，即ConcreteHandler角色
 * Created by 陈健宇 at 2018/10/8
 */
public class ManagerStaff extends Staff {
    @Override
    public int getHandlerLever() {
        return 2;
    }

    @Override
    public void handle(Contract contract) {
        System.out.println("经理签名了合同！");
    }
}
