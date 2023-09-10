package com.clement.behavioral_pattern.chains;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:45
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        TechInterview techInterview = new TechInterview();
        HrInterview hrInterview = new HrInterview();
        techInterview.successor=hrInterview;

        techInterview.interview();
    }
}
