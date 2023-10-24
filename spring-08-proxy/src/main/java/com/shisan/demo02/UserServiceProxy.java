package com.shisan.demo02;

import lombok.Data;

/**
 * @Author:shisan
 * @Date:2023/10/24 17:17
 */
@Data
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void find() {
        log("find");
        userService.find();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    public void log(String msg) {
        System.out.println("[Debug]: " + msg + "了一个用户");
    }
}
