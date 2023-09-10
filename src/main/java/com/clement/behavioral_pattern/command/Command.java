package com.clement.behavioral_pattern.command;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 16:17
 * @Desc
 * @Version 1.0
 */
public abstract class Command {
    protected final DeviceReceiver receiver;
    public Command(DeviceReceiver receiver) {
        this.receiver = receiver;
    }
    public abstract void execute();

}
