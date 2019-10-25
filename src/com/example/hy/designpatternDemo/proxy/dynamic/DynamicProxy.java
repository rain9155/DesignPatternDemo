package com.example.hy.designpatternDemo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * Created by 陈健宇 at 2019/2/23
 */
public class DynamicProxy implements InvocationHandler {

    private Object mObject;//具体被代理类的引用

    public DynamicProxy(Object object){
        this.mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类对象的方法
        Object result = method.invoke(mObject, args);
        return result;
    }
}
