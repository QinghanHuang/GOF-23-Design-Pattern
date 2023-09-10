package com.clement.creational_pattern.abstract_factory;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 21:58
 * @Desc
 * @Version 1.0
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        SqlFactory sqlFactory = new SqlFactory();
        OracleFactory oracleFactory = new OracleFactory();

        sqlFactory.getDatabaseUser().insertUser(1);
        sqlFactory.getDatabaseUser().getUser();
        sqlFactory.getDatabaseDepartment().insertDepartment(2);
        sqlFactory.getDatabaseDepartment().getDepartment();
    }
}
