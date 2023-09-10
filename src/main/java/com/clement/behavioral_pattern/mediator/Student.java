package com.clement.behavioral_pattern.mediator;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 17:57
 * @Desc
 * @Version 1.0
 */
public class Student {
    private final Mediator mediator;
    private final String name;

    public Student(Mediator mediator,String name) {
        this.mediator = mediator;
        this.name=name;
    }
    public void sentMessage(String message,Student to){
        this.mediator.sent(message,this,to);
    }

    @Override
    public String toString() {
        return name;
    }
}
