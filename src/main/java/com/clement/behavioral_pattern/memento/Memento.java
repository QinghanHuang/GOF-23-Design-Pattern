package com.clement.behavioral_pattern.memento;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 13:26
 * @Desc
 * @Version 1.0
 */
public class Memento {

    private int state1;
    private int state2;

    public Memento(int state1, int state2) {
        this.state1 = state1;
        this.state2 = state2;
    }
    public int getState1() {
        return state1;
    }

    public int getState2() {
        return state2;
    }

}
