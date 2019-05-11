package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validCount = 1;
        int totalSum = 0;
        while (validCount <= 10) {
            System.out.println("Enter number #"+validCount+":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                validCount += 1;
                totalSum +=number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The total sum of the numbers is "+totalSum);
        scanner.close();
    }
}
