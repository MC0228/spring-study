package com.shisan.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:shisan
 * @Date:2023/10/24 15:29
 */
@Data
public class User {
    @Value("徐十三")
    private String name;
}
