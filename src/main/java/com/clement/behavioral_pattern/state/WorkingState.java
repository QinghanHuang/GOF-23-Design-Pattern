package com.clement.behavioral_pattern.state;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 15:14
 * @Desc
 * @Version 1.0
 */
public class WorkingState extends State{
    @Override
    public void handle(Work work) {
        System.out.println("Get a new work,Keep working");
        work.setWorkFinished(true);
        work.setCurState(new RestState());
    }
}
