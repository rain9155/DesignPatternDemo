package com.example.hy.designpatternDemo.iterator;

/**
 * 具体的合同类，即ConcreteRequest角色
 * Created by 陈健宇 at 2018/10/8
 */
public class ConcreteContract extends Contract {

    @Override
    public String getContext() {
        return "这是一份关于房产合作的合同";
    }

    @Override
    public int getContractLever() {
        return 3;
    }
}
