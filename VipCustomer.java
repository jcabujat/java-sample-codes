package com.company;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("FirstName LastName",10000,"email@address.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName,creditLimit,"email@address.com");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
