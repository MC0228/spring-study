# Spring-Study

## 1.简介

spring理念：使现有的技术更加容易使用，本身是一个大杂烩。

- SSH：Struct2 + Spring + Hibernate
- SSM： SpringMVC + Spring + Mybatis

相关依赖：

  ```
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.2.5.RELEASE</version>
    </dependency>
    
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.2.3.RELEASE</version>
    </dependency>

```

- spring是一个开源的免费的容器
- spring是一个轻量级的，非入侵式的。
- 控制反转（IOC），面向切面编程（AOP）
- 支持事务处理，对框架整合的支持

总结：spring是一个轻量级的控制反转和面向切面编程的框架。

## 2.IOC理论

1. UserDao
2. UserDaoImpl
3. UserService
4. UserServiceImpl

在之前，用户的需求可能会影响到原来的代码。使用一个set.

```

public void setUserDao(UserDao userDao){
    this.userDao = userDao;
}
```

- 之前的是主动创建对象，控制权在程序员手上。
- 使用set注入之后，是被动接收对象。

## 3.Hello Spring

- pojo中

```
package com.shisan.pojo;

import lombok.Data;

/**
 * @Author:shisan
 * @Date:2023/10/18 20:45
 */
@Data
public class Student {
    private String name;
}
```

- bean.xml配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--使用Spring来创建对象，这些都成为bean
     类型 变量名 = new 变量();
      id = 变量名
      class = new 的对象：
      property 相当于给对象的属性设置一个值

    -->
    <bean id="student" class="com.shisan.pojo.Student">
        <property name="name" value="十三"/>
    </bean>
</beans>

```

- StudentApplication类

```java
package com.shisan;

import com.shisan.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:shisan
 * @Date:2023/10/18 20:53
 */
public class StudentApplication {
    public static void main(String[] args) {
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 我们的对象都在spring中管理了
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
```

bean = 对象 id= 变量名 class = new的对象 property相当于给对象中的属性设值

**核心用set注入**

## 4.IOC创建对象的方式

1.使用无参构造创建对象，默认

```xml

<bean id="user" class="com.shisan.pojo.User">
    <property name="name" value="十三"/>
</bean>
```

2.使用有参构造

- 下标赋值

```xml
<!--第一种使用下标赋值-->
<bean id="user" class="com.shisan.pojo.User">
    <constructor-arg index="0" value="徐十三学Spring"/>
</bean>
```

- 类型赋值（不建议使用）

```xml
<!--第二种通过类型赋值 （不建议使用）-->
<bean id="user" class="com.shisan.pojo.User">
    <constructor-arg type="java.lang.String" value="徐磊"/>
</bean>
```

- 参数名赋值

```xml
<!--第三种使用参数名赋值-->
<bean id="user" class="com.shisan.pojo.User">
    <constructor-arg name="name" value="十三"/>
</bean>
```

总结：在配置文件加载的时候，容器中管理的对象就已经初始化了！！！

## 5.Spring配置

- 别名：

```xml
<!--别名，如果添加了别名，我们可以使用别名获取对象-->
<alias name="user" alias="user2"/>
```

- Bean的配置信息

1. id ：bean 的唯一标识没就是相当于学的对象名
2. class ： bean 对象所对应的全限定名： 包名 + 类名
3. name ： 也就是别名，而且name可以给取多个别名

```xml
<!--bean的配置-->
<bean id="user" class="com.shisan.pojo.User" name="user1 user2 user3 user4">
    <constructor-arg name="name" value="十三"/>
</bean>
```

- import

一般用于团队开发，它可以将多个配置文件，导入合并为一个 在applicationContext.xml中
![img.png](img.png)
  ```xml

<import resource="beans.xml"/>
  ```