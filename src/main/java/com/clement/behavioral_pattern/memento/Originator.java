package com.clement.behavioral_pattern.memento;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 13:23
 * @Desc
 * @Version 1.0
 */
public class Originator {
    private int state1;
    private int state2;

    public void setState1(int state1) {
        this.state1 = state1;
    }

    public void setState2(int state2) {
        this.state2 = state2;
    }

    public Originator(int state1, int state2) {
        this.state1 = state1;
        this.state2 = state2;
    }
    public Memento creatMemento(){
        return new Memento(state1,state2);
    }

    public void restoreMemento(Memento memento){
        state1=memento.getState1();
        state2=memento.getState2();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state1=" + state1 +
                ", state2=" + state2 +
                '}';
    }
}
