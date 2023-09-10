package com.clement.behavioral_pattern.intepreter;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 13:45
 * @Desc
 * @Version 1.0
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void execute(String singleKey) {
        System.out.println("Execute every single key in context");
    }
}
