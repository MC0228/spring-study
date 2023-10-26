package com.shisan.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author:shisan
 * @Date:2023/10/26 16:32
 */
@Aspect  // 标注这个类是切面
public class AnnotationPointCut {
    @Before("execution(* com.shisan.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("===执行前===");
    }
}
