package com.clement.behavioral_pattern.memento;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 13:26
 * @Desc
 * @Version 1.0
 */
public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
