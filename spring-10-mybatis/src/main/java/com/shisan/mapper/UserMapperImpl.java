package com.shisan.mapper;

import com.shisan.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Author:shisan
 * @Date:2023/10/26 20:17
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> findAll() {
        return sqlSessionTemplate.getMapper(UserMapper.class).findAll();
    }

}
