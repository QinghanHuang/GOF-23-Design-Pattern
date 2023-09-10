package com.clement.behavioral_pattern.visitor;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 20:32
 * @Desc
 * @Version 1.0
 */
public interface Element {
    void accept(Visitor visitor);
}
