package com.clement.behavioral_pattern.mediator;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 17:57
 * @Desc
 * @Version 1.0
 */
public class Mediator {
    public void sent(String message,Student student1,Student student2){
        System.out.println( "from "+student1+"to"+student2+message);
    }
}
