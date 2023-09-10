package com.clement.structure_pattern.decorator;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 14:12
 * @Desc
 * @Version 1.0
 */
public class Component implements Function{
    public void operation(){
        System.out.println("The original function");
    }
}
