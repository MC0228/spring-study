package com.shisan.demo04;

/**
 * @Author:shisan
 * @Date:2023/10/26 11:05
 */
public class Main {
    public static void main(String[] args) {
        Tenant tenant = new Tenant();
        Landlord landlord = new HouseOwner();

        Renter renter = (Renter) ProxyAgency.createProxy(tenant);
        Landlord rentalAgencyForLandlord = (Landlord) ProxyAgency.createProxy(landlord);

        renter.rentHouse();
        rentalAgencyForLandlord.provideHouse();

    }
}
