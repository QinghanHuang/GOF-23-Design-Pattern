package com.clement.structure_pattern.proxy.static_proxy;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 15:30
 * @Desc
 * @Version 1.0
 */
public class StarImpl implements Star{
    @Override
    public void sing() {
        System.out.println("Star Singing");
    }

    @Override
    public void acting() {
        System.out.println("Star acts in a movie");

    }
}
