package com.clement.creational_pattern.abstract_factory;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 21:46
 * @Desc
 * @Version 1.0
 */
public abstract class AbstractDataBaseUser {
    public abstract void insertUser(int data);
    public abstract int getUser();
}
class SqlUser extends AbstractDataBaseUser{
    @Override
    public void insertUser(int data) {
        System.out.println("SQL insert User");
    }

    @Override
    public int getUser() {
        System.out.println("SQL get User");
        return 0;
    }
}class OracleUser extends AbstractDataBaseUser{

    @Override
    public void insertUser(int data) {
        System.out.println("Oracle insert User");

    }

    @Override
    public int getUser() {
        System.out.println("Oracle get User");
        return 0;
    }
}
