package com.company;

public class Main {

    public static void main(String[] args) {
        double amount = 10000;
        for (double i = 2; i <= 8; i++) {
            double interest = calculateInterest(amount, i);
            System.out.println("$" + (int) amount + " at " + i + "% interest is equal to $" + (int) interest);
        }

        for (int i = 8; i >= 2; i--) {
            double interest = calculateInterest(amount, i);
            System.out.println("$" + (int) amount + " at " + i + "% interest is equal to $" +
                    String.format("%.2f", interest)); /* string format to print up to 2 decimal places*/
        }
    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }
}
