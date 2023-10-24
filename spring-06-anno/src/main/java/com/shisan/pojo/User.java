package com.shisan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author:shisan
 * @Date:2023/10/24 7:58
 */
// @Component相当于 <bean id = "user" class = "com.shisan.pojo.User"> 完成自动装配
@Component
@Scope("singleton") // 作用域注解singleton or prototype
public class User {
    //    public String name = "徐十三";
    @Value("徐十三") // 相当于<property name="name" value="徐十三"
    public String name;
}
