package com.clement.behavioral_pattern.template;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 14:19
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        new OutpatientProcess().diagnose();
        new InpatientProcess().diagnose();
    }
}
