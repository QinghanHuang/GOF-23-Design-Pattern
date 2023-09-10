package com.clement.behavioral_pattern.observer.jdk;


import java.util.Date;
import java.util.Observable;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 17:37
 * @Desc
 * @Version 1.0
 */
public class Subject extends Observable {
    public void modify(){
        System.out.println("Subject has changed!");
        this.setChanged();
        this.notifyObservers(new Date());
    }
}
