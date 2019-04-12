package com.example.hy.designpatternDemo.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式
 * Created by 陈健宇 at 2018/10/1
 */
public class SingletonManager{

    private static Map<String, Object> objMap = new HashMap<>();

    private SingletonManager(){}

    public static void registerService(String key, SingletonManager instance){
        if(!objMap.containsKey(key)){
            objMap.put(key, instance);
        }
    }

    public static Object getService(String key){
        return objMap.get(key);
    }
}
