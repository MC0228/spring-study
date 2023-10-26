package com.shisan.service;

/**
 * @Author:shisan
 * @Date:2023/10/26 15:00
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户信息");
    }

    @Override
    public void find() {
        System.out.println("查询用户");
    }
}
