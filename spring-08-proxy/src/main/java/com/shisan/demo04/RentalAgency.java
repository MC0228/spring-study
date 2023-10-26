package com.shisan.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:shisan
 * @Date:2023/10/26 11:00
 */
// 中介类
public class RentalAgency implements InvocationHandler {
    private Object client;

    // 构造器
    public RentalAgency(Object client) {
        this.client = client;
    }

    public static Object createProxy(Object client) {
        return Proxy.newProxyInstance(
                client.getClass().getClassLoader(),
                client.getClass().getInterfaces(),
                new RentalAgency(client));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中介：开始处理房租交易。");
        Object result = method.invoke(client, args);
        System.out.println("中介：房租交易完成。");
        return result;
    }
}
