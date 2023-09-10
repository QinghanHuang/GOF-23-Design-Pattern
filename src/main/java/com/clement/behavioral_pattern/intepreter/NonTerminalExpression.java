package com.clement.behavioral_pattern.intepreter;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 13:55
 * @Desc
 * @Version 1.0
 */
public class NonTerminalExpression extends AbstractExpression {

    @Override
    public void execute(String allKeys) {
        System.out.println("Execute all keys by calling terminal Expression!");

    }
}
