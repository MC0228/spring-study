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
