package com.clement.behavioral_pattern.visitor;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 20:48
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        Love love = new Love();

        ManVisitor manVisitor = new ManVisitor();
        WomenVisitor womenVisitor = new WomenVisitor();
        love.accept(manVisitor);
        work.accept(womenVisitor);
    }
}
