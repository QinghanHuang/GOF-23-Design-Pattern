package com.clement.structure_pattern.composite;

import java.util.List;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:57
 * @Desc
 * @Version 1.0
 */

public abstract  class Company extends Organization {
    List<Organization> subOrg;

    public Company(String name) {
        super(name);
    }
    public abstract void add(Organization organization);
    public abstract void remove(Organization organization);

    public void display(int depth){
        for(int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
        for(Organization org:subOrg){
            org.display(depth+2);
        }
    }

}
