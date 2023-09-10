package com.clement.structure_pattern.flyweight;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 22:03
 * @Desc
 * @Version 1.0
 */
public class ConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int data) {
        System.out.println("Manipulate data:"+data);
    }
}
