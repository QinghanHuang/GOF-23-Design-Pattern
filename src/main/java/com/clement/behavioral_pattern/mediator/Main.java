package com.clement.behavioral_pattern.mediator;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 18:04
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Student s1=new Student(mediator,"s1");
        Student s2=new Student(mediator,"s2");

        s1.sentMessage("qqq",s2);
        s2.sentMessage("ok",s1);
    }

}
