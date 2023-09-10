package com.clement.structure_pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 17:05
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        CglibProxyHandler cglibProxyHandler = new CglibProxyHandler(new SubjectImpl());

        Enhancer enhancer = new Enhancer();   //增强器，一会就需要依靠增强器来为我们生成动态代理对象
        enhancer.setSuperclass(SubjectImpl.class);    //直接选择我们需要代理的类型，直接不需要接口或是抽象类，SuperClass作为代理类的父类存在，这样我们就可以按照指定类型的方式去操作代理类了
        enhancer.setCallback(cglibProxyHandler);  //设定我们刚刚编写好的代理逻辑

        SubjectImpl proxy = (SubjectImpl) enhancer.create();   //直接创建代理类

        proxy.test();   //调用代理类的test方法
    }
}
