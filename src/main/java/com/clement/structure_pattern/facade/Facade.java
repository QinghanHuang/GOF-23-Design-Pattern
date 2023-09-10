package com.clement.structure_pattern.facade;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 18:41
 * @Desc
 * @Version 1.0
 */
public class Facade {
    SubSystemA A=new SubSystemA();
    SubSystemB B=new SubSystemB();
    SubSystemC C=new SubSystemC();

    public void runAggregate(){
        A.run();
        B.run();
        C.run();
    }
}
