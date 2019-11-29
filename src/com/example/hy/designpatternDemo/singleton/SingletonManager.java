package com.example.hy.designpatternDemo.singleton;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式
 * Created by 陈健宇 at 2018/10/1
 */
public class SingletonManager{

    private static Map<String, Object> mServices = new HashMap<>();

    private SingletonManager(){}

    public static void registerService(String key, Object instance){
        if(!mServices.containsKey(key)){
            mServices.put(key, instance);
        }
    }

    public static Object getService(String key){
        return mServices.get(key);
    }
}
