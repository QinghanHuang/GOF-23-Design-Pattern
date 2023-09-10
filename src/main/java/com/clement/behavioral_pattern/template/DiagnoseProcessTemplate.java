package com.clement.behavioral_pattern.template;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:12
 * @Desc
 * @Version 1.0
 */
public abstract class DiagnoseProcessTemplate {
    public final void diagnose() {
        register();
        doMedicalExam();
        if (needsPrescription()) {
            prescribeMedicine();
        }
        payBill();
    }

    // 抽象方法，不同的子类可能实现不同的步骤
    protected abstract void register();

    protected abstract void doMedicalExam();

    protected abstract boolean needsPrescription();

    protected abstract void prescribeMedicine();

    // 共同步骤
    private void payBill() {
        System.out.println("Pay the medical bill.");
    }
}

