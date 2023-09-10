package com.clement.structure_pattern.brige;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 17:32
 * @Desc
 * @Version 1.0
 */
public class Huawei extends Phone{
    @Override
    public void run() {
        System.out.println("Huawei run software");
        software.run();
    }
}

