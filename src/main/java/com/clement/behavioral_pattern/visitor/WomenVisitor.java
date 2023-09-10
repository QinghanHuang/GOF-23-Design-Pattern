package com.clement.behavioral_pattern.visitor;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 20:47
 * @Desc
 * @Version 1.0
 */
public class WomenVisitor implements Visitor{
    @Override
    public void visit(Love love) {
        System.out.println("Women feel the Love");
    }

    @Override
    public void visit(Work work) {
        System.out.println("Women enjoy the Work");
    }
}
