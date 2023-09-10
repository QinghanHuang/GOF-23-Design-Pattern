package com.clement.structure_pattern.proxy.jdk_proxy;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 15:40
 * @Desc
 * @Version 1.0
 */
public class SubjectImpl implements Subject{
    @Override
    public void test() {
        System.out.println("The method from Subject");
    }
}
