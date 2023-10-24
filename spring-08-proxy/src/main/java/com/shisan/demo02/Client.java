package com.shisan.demo02;

/**
 * @Author:shisan
 * @Date:2023/10/24 17:14
 */
public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(new UserServiceImpl());
        userServiceProxy.add();
    }
}
