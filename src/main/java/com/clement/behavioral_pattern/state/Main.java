package com.clement.behavioral_pattern.state;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 15:23
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work(new ReadyWorkState(), false);
        work.work();
        work.work();
        work.work();
    }
}
