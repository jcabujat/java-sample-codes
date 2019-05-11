package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean firstInput = true;
        while (true) {
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                if (firstInput) {
                    min = number;
                    max = number;
                    firstInput = false;
                }
                if (number < min) {
                    min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid Number");
                System.out.println("Minimum number = " + min);
                System.out.println("Maximum number = " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
