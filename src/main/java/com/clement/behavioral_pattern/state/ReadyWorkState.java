package com.clement.behavioral_pattern.state;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 15:21
 * @Desc
 * @Version 1.0
 */
public class ReadyWorkState extends State{
    @Override
    public void handle(Work work) {
        System.out.println("Now ready to get a new work");
        work.setWorkFinished(false);
        work.setCurState(new WorkingState());
    }
}
