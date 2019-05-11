package com.company;

public class Main {

    public static void main(String[] args) {
        int lowerLimit = 55;
        int upperLimit = 80;
        int primeCount = 0;
        for (int i = lowerLimit; i < upperLimit; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCount++;
            }
            if (primeCount >= 3) {
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
