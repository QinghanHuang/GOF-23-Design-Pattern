package com.clement.structure_pattern.composite;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 18:00
 * @Desc
 * @Version 1.0
 */
public abstract class Department extends Organization {

    public Department(String name) {
        super(name);
    }
    public void display(int depth){
        for(int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
    }
}
