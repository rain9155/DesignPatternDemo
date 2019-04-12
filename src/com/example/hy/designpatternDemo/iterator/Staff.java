package com.example.hy.designpatternDemo.iterator;

/**
 * 抽象的员工，即AbstractHandler角色
 * Created by 陈健宇 at 2018/10/8
 */
public abstract class Staff {

    protected Staff nextHandler;//上一级领导处理者

    //处理转发的逻辑
    public final void handleRequest(Contract contract){
        if(contract.getContractLever() <= getHandlerLever()){
            handle(contract);
        }else {
            if(nextHandler != null){
                nextHandler.handleRequest(contract);
            }
        }
    }

    public abstract int getHandlerLever();//自身能处理请求的级别
    public abstract void handle(Contract contract);//具体的处理过程
}
