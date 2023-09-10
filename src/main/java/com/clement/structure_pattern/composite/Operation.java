package com.clement.structure_pattern.composite;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 18:04
 * @Desc
 * @Version 1.0
 */
public class Operation extends Department{

    public Operation(String name) {
        super(name);
    }

    @Override
    public void runDuty() {
        System.out.println(name+" Run Operation Duty");

    }
}
