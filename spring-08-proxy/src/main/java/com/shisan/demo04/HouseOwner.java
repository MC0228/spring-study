package com.shisan.demo04;

/**
 * @Author:shisan
 * @Date:2023/10/26 10:58
 */
// 房东类
public class HouseOwner implements Landlord {
    @Override
    public void provideHouse() {
        System.out.println("房东：我有一套公寓出租。");
    }
}
