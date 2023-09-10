package com.clement.behavioral_pattern.observer.jdk;

import java.util.Observable;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:42
 * @Desc
 * @Version 1.0
 */
public class Observer implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer noticed the change with arg"+ arg);
    }
}
