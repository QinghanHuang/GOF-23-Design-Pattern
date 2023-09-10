package com.clement.behavioral_pattern.chains;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:43
 * @Desc
 * @Version 1.0
 */
public class HrInterview extends InterviewHandler{
    @Override
    public void interview() {
        System.out.println("Hr Interview! ");
        if(successor!=null){
            successor.interview();
        }
    }
}
