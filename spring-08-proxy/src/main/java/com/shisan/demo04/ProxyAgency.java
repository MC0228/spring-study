package com.shisan.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:shisan
 * @Date:2023/10/26 14:15
 */
public class ProxyAgency {
    public static Object createProxy(Object client) {
        return Proxy.newProxyInstance(
                client.getClass().getClassLoader(),
                client.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("中介：开始处理房租交易。");
                        Object result = method.invoke(client, args);
                        System.out.println("中介：房租交易完成。");
                        return result;
                    }
                }
        );
    }
}
