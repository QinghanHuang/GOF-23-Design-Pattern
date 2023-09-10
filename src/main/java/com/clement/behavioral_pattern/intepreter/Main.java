package com.clement.behavioral_pattern.intepreter;

import com.clement.structure_pattern.flyweight.ConcreteFlyweight;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 13:57
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.input="123";
        context.output="abc";
        NonTerminalExpression nonTerminalExpression = new NonTerminalExpression();
        nonTerminalExpression.interpret(context);
        nonTerminalExpression.execute(context.output);

    }
}
