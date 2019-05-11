package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(5623));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int lastDigit = number % 10;
        int nextNumber = number / 10;
        int sum = lastDigit;
        do {
            lastDigit = nextNumber % 10;
            nextNumber = nextNumber / 10;
            sum += lastDigit;
        } while (nextNumber > 0);

        return sum;
    }
}
