package com.shisan.config;

import com.shisan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:shisan
 * @Date:2023/10/24 15:30
 */
// 这个也是Spring容器托管，注册到容器中，本身也是一个@component
// @Configuration代表这是一个配置类，相当于bean.xml
@Configuration
@ComponentScan("com.shisan.pojo")
public class UserConfig {
    /*
     * 注册一个bean，等价于xml中的bean标签
     * 方法的名字，等价于bean标签中的id
     * 返回值，等价于bean中的class
     * */
    @Bean
    public User user() {
        return new User();  // 要注入到容器中的对象
    }
}
