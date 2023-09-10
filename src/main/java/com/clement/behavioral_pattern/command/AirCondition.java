package com.clement.behavioral_pattern.command;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 16:18
 * @Desc
 * @Version 1.0
 */
public class AirCondition implements DeviceReceiver {
    @Override
    public void turnOn() {
        System.out.println("Turn ON AC");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off AC");
    }
}
