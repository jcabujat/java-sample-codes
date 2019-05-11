package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer customer = new VipCustomer("Jonathan Cabujat",150000, "jonathancabujat@gmail.com");
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());
    }
}
