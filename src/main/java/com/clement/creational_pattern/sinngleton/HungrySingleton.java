package com.clement.creational_pattern.sinngleton;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 22:28
 * @Desc
 * @Version 1.0
 */
public class HungrySingleton {
    private static final HungrySingleton INSTANCE=new HungrySingleton();
    private HungrySingleton(){
    }
    public static HungrySingleton getInstance(){
        return  INSTANCE;
    }
}
