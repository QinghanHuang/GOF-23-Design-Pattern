package com.clement.behavioral_pattern.command;

/**
 * @Author Qinghan Huang
 * @Date 28/08/2023 16:15
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Controls controls = new Controls();
        TurnOnAcCommand turnOnAcCommand = new TurnOnAcCommand(new AirCondition());
        controls.call(turnOnAcCommand);

        TurnOffFanCommand turnOffFanCommand = new TurnOffFanCommand(new Fan());
        controls.call(turnOffFanCommand);
    }
}
