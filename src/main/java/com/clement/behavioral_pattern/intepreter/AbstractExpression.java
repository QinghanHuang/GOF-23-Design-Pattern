package com.clement.behavioral_pattern.intepreter;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 13:42
 * @Desc
 * @Version 1.0
 */
public abstract class AbstractExpression {
    public void interpret(Context context){
        System.out.println("this is input: "+context.input);
        System.out.println("this is output after interpreting: "+ context.output);
    };
    public abstract void execute(String key);
}
