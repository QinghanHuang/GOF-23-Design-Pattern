package com.clement.structure_pattern.decorator;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 14:24
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Component());
        decorator.operation();

        Decorator decorator1=new Decorator(decorator);

        decorator1.operation();
    }
}
