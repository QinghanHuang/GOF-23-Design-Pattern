package com.clement.behavioral_pattern.command;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 16:46
 * @Desc
 * @Version 1.0
 */
public class Controls {

    public void call(Command command){
        command.execute();
    }
}
