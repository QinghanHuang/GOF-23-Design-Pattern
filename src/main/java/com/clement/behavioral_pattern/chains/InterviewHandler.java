package com.clement.behavioral_pattern.chains;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:39
 * @Desc
 * @Version 1.0
 */
public abstract class InterviewHandler {
    InterviewHandler successor;
    public abstract void interview();

}
