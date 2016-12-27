package com.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Litao-pc on 2016/11/16.
 * <pp>
 * 日志类
 */


class Log implements InvocationHandler {
    void before() {
        System.out.println("before");
    }

    void after() {
        System.out.println("after");
    }

    private Object target;

    public Object bind(Object obj) {
        target = obj;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        before();
        Object obj = method.invoke(this.target, objects);
        after();
        return obj;
    }
}
