package com.clement.behavioral_pattern.memento;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 13:30
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(100, 90);
        careTaker.setMemento(originator.creatMemento());

        originator.setState1(50);
        originator.setState2(60);

        System.out.println(originator);

        originator.restoreMemento(careTaker.getMemento());
        System.out.println(originator);




    }
}
