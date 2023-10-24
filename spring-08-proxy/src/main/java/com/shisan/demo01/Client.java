package com.shisan.demo01;

/**
 * @Author:shisan
 * @Date:2023/10/24 16:46
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
