package com.clement.creational_pattern.sinngleton;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 22:34
 * @Desc
 * @Version 1.0
 */
public class BaseLazySingleton {
    private static BaseLazySingleton instance;
    private BaseLazySingleton(){}
    public static BaseLazySingleton getInstance(){
        if(instance==null){
            instance=new BaseLazySingleton();
        }
        return instance;
    }
}
