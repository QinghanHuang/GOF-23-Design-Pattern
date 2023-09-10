package com.clement.creational_pattern.protype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 23:26
 * @Desc
 * @Version 1.0
 */
public class ShallowTest {
    public static void main(String[] args) {
        A a = new A();

        A a1=a.clone();

        a1.list.add(1);
        a1.name="qqq";

        System.out.println(a.name);
        System.out.println(a.list);

        System.out.println(a1.name);
        System.out.println(a1.list);



    }
}
class A implements Cloneable{
    String name="123";
    List<Integer> list=new ArrayList<>();

    @Override
    public A clone() {
        try {
            A clone = (A) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
