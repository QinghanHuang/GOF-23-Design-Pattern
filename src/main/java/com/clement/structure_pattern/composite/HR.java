package com.clement.structure_pattern.composite;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 18:03
 * @Desc
 * @Version 1.0
 */
public class HR extends Department{
    public HR(String name) {
        super(name);
    }

    @Override
    public void runDuty() {
        System.out.println(name +"Run HR DUty");
    }
}
