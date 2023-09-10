package com.clement.behavioral_pattern.visitor;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 20:46
 * @Desc
 * @Version 1.0
 */
public class Work implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
