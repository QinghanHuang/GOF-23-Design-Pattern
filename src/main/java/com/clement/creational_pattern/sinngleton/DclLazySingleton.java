package com.clement.creational_pattern.sinngleton;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 22:56
 * @Desc
 * @Version 1.0
 */
public class DclLazySingleton {

    private static volatile DclLazySingleton instance;

    private DclLazySingleton() {
    }

    public static DclLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DclLazySingleton.class) {
                if (instance == null) {
                    instance = new DclLazySingleton();
                }
            }
        }
        return instance;
    }
}
