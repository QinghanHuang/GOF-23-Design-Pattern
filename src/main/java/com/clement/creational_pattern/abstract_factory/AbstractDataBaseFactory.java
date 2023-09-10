package com.clement.creational_pattern.abstract_factory;

/**
 * @Author Qinghan Huang
 * @Date 24/08/2023 21:43
 * @Desc
 * @Version 1.0
 */
public abstract class AbstractDataBaseFactory {
    public abstract AbstractDataBaseUser getDatabaseUser();
    public abstract AbstractDataBaseDepartment getDatabaseDepartment();

}
class SqlFactory extends AbstractDataBaseFactory{

    @Override
    public AbstractDataBaseUser getDatabaseUser() {
        return new SqlUser();
    }

    @Override
    public AbstractDataBaseDepartment getDatabaseDepartment() {
        return new SqlDepartment();
    }
}
class OracleFactory extends AbstractDataBaseFactory{

    @Override
    public AbstractDataBaseUser getDatabaseUser() {
        return new OracleUser();
    }

    @Override
    public AbstractDataBaseDepartment getDatabaseDepartment() {
        return new OracleDepartment();
    }
}

