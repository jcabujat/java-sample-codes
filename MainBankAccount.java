package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1899123456);
        bankAccount.setCustomerName("Jonathan Cabujat");
        bankAccount.setBalance(90000);
        bankAccount.setEmail("jonathancabujat@gmail.com");
        bankAccount.setPhoneNumber("09284435511");
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.getPhoneNumber());
        bankAccount.depositFunds(10000);
        bankAccount.withdrawFunds(110000);
        bankAccount.withdrawFunds(20000);
    }
}
