package com.clement.structure_pattern.brige;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:28
 * @Desc
 * @Version 1.0
 */
public class Apple extends Phone{
    @Override
    public void run() {
        System.out.println("Apple run software");
        software.run();
    }
}
