package com.clement.structure_pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 15:41
 * @Desc
 * @Version 1.0
 */
public class proxyHandler implements InvocationHandler {
    private Object object;

    public proxyHandler(Object object) {
        this.object = object;
    }
    @Override
    //调用动态生成的代理对象,实际会执行的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        //method代表实际被执行的方法, 通过反射执行
        //关键代码 使用invoke 调用这个方法
        Object res = method.invoke(object, args);
        return res;
    }
}
