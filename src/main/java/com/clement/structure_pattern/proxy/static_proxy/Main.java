package com.clement.structure_pattern.proxy.static_proxy;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 15:31
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new StarImpl());
        proxy.acting();
        proxy.sing();
    }
}
