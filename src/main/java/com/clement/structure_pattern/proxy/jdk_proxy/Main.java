package com.clement.structure_pattern.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 16:24
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //获得proxyHandler
        proxyHandler proxyHandler = new proxyHandler(new SubjectImpl());
        //获得proxyInstance ,也就是代理对象的实例通过Proxy.newProxyInstance() 方法
        //参数(1.类加载器 2.类的接口 4.proxyHandler )
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(SubjectImpl.class.getClassLoader(), SubjectImpl.class.getInterfaces(), proxyHandler);
        //调用proxyInstance 与subject同样的方法
        proxyInstance.test();
    }
}
