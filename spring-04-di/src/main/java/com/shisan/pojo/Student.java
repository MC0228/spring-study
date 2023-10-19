package com.shisan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * @Author:shisan
 * @Date:2023/10/19 14:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String, String> card;
    private Set<String> games;
    private String wife;
    private Properties info;

    /*
     * Student(name=徐十三, address=Address(address=河南信阳),
     * books=[《数据结构》, 《计算机组成原理》, 《计算机网络》, 《操作心态》],
     * hobbies=[singing, jump, rapping, basketball], card={eat=吃排骨, sleep=睡大觉},
     * games=[王者荣耀, 部落冲突, 金铲铲], wife=null,
     * info={学号=022300200240, 性别=男, 班级=20级软件工程2班})
     */
}
