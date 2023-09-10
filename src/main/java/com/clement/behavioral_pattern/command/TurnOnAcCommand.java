package com.clement.behavioral_pattern.command;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 16:36
 * @Desc
 * @Version 1.0
 */
public class TurnOnAcCommand extends Command{
    public TurnOnAcCommand(DeviceReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }

}
