package com.shisan.demo04;

/**
 * @Author:shisan
 * @Date:2023/10/26 10:57
 */
// 租户类
public class Tenant implements Renter {
    @Override
    public void rentHouse() {
        System.out.println("租户：我需要一套公寓.");
    }
}
