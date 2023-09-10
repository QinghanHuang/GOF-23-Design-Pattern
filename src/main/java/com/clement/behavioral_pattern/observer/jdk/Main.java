package com.clement.behavioral_pattern.observer.jdk;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:47
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        //add observer
        subject.addObserver(new Observer());
        subject.modify();
        subject.modify();
    }
}
