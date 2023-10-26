package com.shisan.demo03;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:shisan
 * @Date:2023/10/26 10:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyProxy implements InvocationHandler {
    private MyInterface myInterface;

    public MyInterface createProxy() {
        return (MyInterface) Proxy.newProxyInstance(MyInterface.class.getClassLoader(),
                new Class<?>[]{MyInterface.class},
                this)
                ;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method call");
        Object invoke = method.invoke(myInterface, args);
        System.out.println("After method call");
        return invoke;
    }
}
