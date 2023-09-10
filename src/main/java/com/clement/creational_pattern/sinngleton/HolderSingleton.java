package com.clement.creational_pattern.sinngleton;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 23:07
 * @Desc
 * @Version 1.0
 */
public class HolderSingleton {
    private HolderSingleton(){}
    public static class Holder{
        private static final HolderSingleton instance=new HolderSingleton();
    }
    public static HolderSingleton getInstance(){
        return Holder.instance;
    }
}
