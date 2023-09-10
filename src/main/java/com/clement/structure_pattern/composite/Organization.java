package com.clement.structure_pattern.composite;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:51
 * @Desc
 * @Version 1.0
 */
public abstract class Organization {
    String name;

    public Organization(String name) {
        this.name = name;
    }
    public abstract void runDuty();
    public abstract void display(int depth);
}
