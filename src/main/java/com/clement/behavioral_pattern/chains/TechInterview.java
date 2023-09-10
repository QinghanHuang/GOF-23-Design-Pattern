package com.clement.behavioral_pattern.chains;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:43
 * @Desc
 * @Version 1.0
 */
public class TechInterview extends InterviewHandler{
    @Override
    public void interview() {
        System.out.println("Do technical Interview! ");
        if(successor!=null){
            successor.interview();
        }
    }
}
