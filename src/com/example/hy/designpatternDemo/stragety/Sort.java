package com.example.hy.designpatternDemo.stragety;

/**
 * 抽象的排序接口，即抽象策略角色
 * Created by 陈健宇 at 2018/10/6
 */
public interface Sort{
     <T> void sort(T[] a);
}
