package com.example.hy.designpatternDemo.iterator;

/**
 * 抽象的合同类，即AbstractRequest角色
 * Created by 陈健宇 at 2018/10/8
 */
public abstract class Contract {
    public abstract String getContext();//获得合同具体内容
    public abstract int getContractLever();//获得合同处理级别
}
