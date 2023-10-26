package com.shisan.demo03;

/**
 * @Author:shisan
 * @Date:2023/10/26 10:47
 */
public class Main {
    public static void main(String[] args) {
        MyRealObject realObject = new MyRealObject();
        MyInterface proxy = ProxyUtil.createProxy(realObject);
        proxy.doSomething();

    }
}
