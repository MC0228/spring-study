package com.shisan.mapper;

import com.shisan.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author:shisan
 * @Date:2023/10/26 20:17
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    @Override
    public List<User> findAll() {
        User user = new User();
        user.setName("张三");
        user.setPassword("zhang123");
        getSqlSession().getMapper(UserMapper.class).add(user);
        getSqlSession().getMapper(UserMapper.class).deleteById(user.getId());
        return getSqlSession().getMapper(UserMapper.class).findAll();
    }

    @Override
    public void add(User user) {
        getSqlSession().getMapper(UserMapper.class).add(user);
    }

    @Override
    public void deleteById(Integer id) {
        getSqlSession().getMapper(UserMapper.class).deleteById(id);
    }

}
