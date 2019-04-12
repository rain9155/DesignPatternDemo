package com.example.hy.designpatternDemo.iterator;

/**
 * 组长，即ConcreteHandler角色
 * Created by 陈健宇 at 2018/10/8
 */
public class GroupStaff extends Staff {

    @Override
    public int getHandlerLever() {
        return 1;
    }

    @Override
    public void handle(Contract contract) {
        System.out.println("组长签名了合同！");
    }

}
