package com.clement.structure_pattern.proxy.static_proxy;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 15:29
 * @Desc
 * @Version 1.0
 */
public class Proxy implements Star {
    private Star star;

    public Proxy(Star star) {
        this.star = star;
    }

    @Override
    public void sing() {
        star.sing();

    }

    @Override
    public void acting() {
        star.acting();
    }
}
