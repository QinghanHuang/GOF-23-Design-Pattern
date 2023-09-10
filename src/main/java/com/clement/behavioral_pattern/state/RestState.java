package com.clement.behavioral_pattern.state;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 15:14
 * @Desc
 * @Version 1.0
 */
public class RestState extends State{
    @Override
    public void handle(Work work) {
        System.out.println("Work is done,now Resting!");
        work.setCurState(new ReadyWorkState());
    }
}
