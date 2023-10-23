package com.shisan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author:shisan
 * @Date:2023/10/23 15:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    @Autowired
    @Qualifier(value = "dog22")
    private Dog dog;
    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;
    private String name;
}
