package com.example.hy.designpatternDemo.factory;

/**
 * 通过反射获取具体的实例，具体的工厂类
 * Created by 陈健宇 at 2018/10/5
 */
public class ConcreteCarFactory2 extends CarFactory2 {

    @Override
    public <T extends Car> T createCar(Class<T> car) {
        Car c = null;
        try {
            c = (T) Class.forName(car.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) c;
    }

}
