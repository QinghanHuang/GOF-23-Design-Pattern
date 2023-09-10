package com.clement.structure_pattern.brige;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:34
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Huawei huawei = new Huawei();

        apple.setSoftware(new Game());
        apple.run();
        apple.setSoftware(new Map());
        apple.run();

        huawei.setSoftware(new Game());
        huawei.run();
        huawei.setSoftware(new Map());
        huawei.run();
    }
}
