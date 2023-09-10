package com.clement.structure_pattern.flyweight;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 22:08
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight x = flyweightFactory.getFlyweight("X");
        Flyweight y = flyweightFactory.getFlyweight("Y");
        Flyweight x1 = flyweightFactory.getFlyweight("X");
        System.out.println( x == y);
        System.out.println( x == x1);
    }
}
