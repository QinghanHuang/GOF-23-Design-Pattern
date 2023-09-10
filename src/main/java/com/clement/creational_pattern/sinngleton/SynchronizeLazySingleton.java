package com.clement.creational_pattern.sinngleton;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 22:38
 * @Desc
 * @Version 1.0
 */
public class SynchronizeLazySingleton {
    private static SynchronizeLazySingleton instance;
    private SynchronizeLazySingleton(){}
    public static synchronized SynchronizeLazySingleton getInstance(){
        if(instance==null){
            instance=new SynchronizeLazySingleton();
        }
        return instance;
    }
}
