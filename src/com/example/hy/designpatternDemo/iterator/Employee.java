package com.example.hy.designpatternDemo.iterator;

/**
 * 请求发起者
 * Created by 陈健宇 at 2018/10/8
 */
public class Employee {

    public static void main(String[] args){
        //构造各个节点对象
        GroupStaff groupStaff = new GroupStaff();
        ManagerStaff managerStaff = new ManagerStaff();
        BossStaff bossStaff = new BossStaff();
        //构成一条链
        groupStaff.nextHandler = managerStaff;
        managerStaff.nextHandler = bossStaff;
        //发起请求
        Contract contract = new ConcreteContract();
        groupStaff.handleRequest(contract);
    }

}
