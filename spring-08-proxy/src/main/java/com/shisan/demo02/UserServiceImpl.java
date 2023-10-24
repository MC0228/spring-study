package com.shisan.demo02;

import lombok.Data;

/**
 * @Author:shisan
 * @Date:2023/10/24 17:15
 */

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("新增一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改一个用户");
    }

    @Override
    public void find() {
        System.out.println("查询一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }
}
