package com.clement.behavioral_pattern.template;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:18
 * @Desc
 * @Version 1.0
 */
public class InpatientProcess extends DiagnoseProcessTemplate {
    @Override
    protected void register() {
        System.out.println("Register as an inpatient.");
    }

    @Override
    protected void doMedicalExam() {
        System.out.println("Receive detailed medical examination as an inpatient.");
    }

    @Override
    protected boolean needsPrescription() {
        return false;
    }

    @Override
    protected void prescribeMedicine() {
        // Inpatients don't need prescription in this example
    }
}
