package com.clement.behavioral_pattern.command;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 16:34
 * @Desc
 * @Version 1.0
 */
public class Fan implements DeviceReceiver {
    public Fan() {
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On Fan");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off Fan");
    }
}
