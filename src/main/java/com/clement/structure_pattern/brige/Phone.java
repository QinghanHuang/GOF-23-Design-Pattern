package com.clement.structure_pattern.brige;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:26
 * @Desc
 * @Version 1.0
 */
public abstract class Phone {
    Software software;
    public void setSoftware(Software software){
        this.software=software;
    }
    public abstract void run();
}
