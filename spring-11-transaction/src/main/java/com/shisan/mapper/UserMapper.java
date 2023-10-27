package com.shisan.mapper;

import com.shisan.pojo.User;

import java.util.List;

/**
 * @Author:shisan
 * @Date:2023/10/26 17:31
 */
public interface UserMapper {
    List<User> findAll();

    void add(User user);

    void deleteById(Integer id);
}
