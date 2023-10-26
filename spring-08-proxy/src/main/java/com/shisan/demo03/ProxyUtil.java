package com.shisan.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:shisan
 * @Date:2023/10/26 14:25
 */
public class ProxyUtil {
    public static MyInterface createProxy(MyInterface myInterface) {
        MyInterface myInterfaceProxy = (MyInterface) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{MyInterface.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Before method call");
                        Object invoke = method.invoke(myInterface, args);
                        System.out.println("After method call");
                        return invoke;
                    }
                }
        );
        return myInterfaceProxy;
    }
}
