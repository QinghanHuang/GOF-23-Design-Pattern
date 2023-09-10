package com.clement.behavioral_pattern.command;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 16:45
 * @Desc
 * @Version 1.0
 */
public class TurnOffFanCommand extends Command{

    public TurnOffFanCommand(DeviceReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.turnOff();

    }
}
