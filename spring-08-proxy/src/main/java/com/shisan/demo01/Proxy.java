package com.shisan.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author:shisan
 * @Date:2023/10/24 16:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proxy implements Rent {
    private Host host;

    @Override
    public void rent() {
        host.rent();
        before();
        seeing();
        after();
    }

    public void before() {
        System.out.println("中介带你看房子");
    }

    public void seeing() {
        System.out.println("中介带你签合同");

    }

    public void after() {
        System.out.println("中介收租赁金");
    }

}
