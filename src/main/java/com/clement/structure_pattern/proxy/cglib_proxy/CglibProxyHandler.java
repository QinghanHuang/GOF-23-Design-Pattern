package com.clement.structure_pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author Qinghan Huang
 * @Date 30/08/2023 17:01
 * @Desc
 * @Version 1.0
 */
public class CglibProxyHandler implements MethodInterceptor {
    private final Object target;

    public CglibProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass());
        Object res = method.invoke(target, objects);
        return res;
    }
}
