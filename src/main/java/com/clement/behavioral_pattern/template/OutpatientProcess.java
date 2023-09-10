package com.clement.behavioral_pattern.template;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:17
 * @Desc
 * @Version 1.0
 */
public class OutpatientProcess extends DiagnoseProcessTemplate {
    @Override
    protected void register() {
        System.out.println("Register as an outpatient.");
    }

    @Override
    protected void doMedicalExam() {
        System.out.println("Receive medical examination as an outpatient.");
    }

    @Override
    protected boolean needsPrescription() {
        return true;
    }

    @Override
    protected void prescribeMedicine() {
        System.out.println("Prescribe medicine for the outpatient.");
    }
}
