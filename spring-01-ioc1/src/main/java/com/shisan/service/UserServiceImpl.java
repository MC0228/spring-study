package com.shisan.service;

import com.shisan.dao.UserDao;

/**
 * @Author:shisan
 * @Date:2023/10/18 20:22
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    // 利用set进行动态实现值的注入！！！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }

}
