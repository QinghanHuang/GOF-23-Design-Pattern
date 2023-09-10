package com.clement.structure_pattern.composite;

import java.util.ArrayList;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 18:06
 * @Desc
 * @Version 1.0
 */
public class ConcreteCompany extends Company {
    public ConcreteCompany(String name) {
        super(name);
        subOrg=new ArrayList<>();
    }

    @Override
    public void runDuty() {
        System.out.println(name+"Run Company Duty");

    }

    @Override
    public void add(Organization organization) {
        System.out.println(this.name+" add "+ organization.name);
        subOrg.add(organization);

    }

    @Override
    public void remove(Organization organization) {
        System.out.println(this.name+" remove "+ organization.name);
        subOrg.remove(organization);
    }
}
