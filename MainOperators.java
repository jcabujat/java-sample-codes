package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double num1 = 20;
        double num2 = 80;
        double sumTotal = (num1 + num2) * 25;
        double remainder = sumTotal % 40;
        System.out.println(sumTotal + "\n" + remainder);
        if (remainder <= 20) System.out.println("Total was over the limit");

    }
}
