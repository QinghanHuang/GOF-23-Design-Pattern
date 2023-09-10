package com.clement.creational_pattern.abstract_factory;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 21:52
 * @Desc
 * @Version 1.0
 */
public abstract class AbstractDataBaseDepartment {
    public abstract void insertDepartment(int data);
    public abstract int getDepartment();
}
class SqlDepartment extends AbstractDataBaseDepartment{
    @Override
    public void insertDepartment(int data) {
        System.out.println("SQL insert Department");
    }

    @Override
    public int getDepartment() {
        System.out.println("SQL get Department");
        return 0;
    }
}class OracleDepartment extends AbstractDataBaseDepartment{

    @Override
    public void insertDepartment(int data) {
        System.out.println("Oracle insert Department");

    }

    @Override
    public int getDepartment() {
        System.out.println("Oracle get Department");
        return 0;
    }
}
