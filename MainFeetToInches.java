package com.company;

public class Main {

    public static void main(String[] args) {
        double feet = 9;
        double inches = 2;
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters < 0) {
            System.out.println("Invalid feet or inches parameter");
        }

        inches = 100;
        centimeters = calcFeetAndInchesToCentimeters(inches);
        if (centimeters < 0) {
            System.out.println("Invalid inches parameter");
        }

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches >= 12) {
            return -1;
        }
        double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
        System.out.println(feet + " ft. " + inches + " in. = " + centimeters + " cm.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = inches / 12;
        double remainder = (int)(inches % 12);
        System.out.println(inches + " in. = " + feet + " ft. " + inches + " in.");
        double centimeters = calcFeetAndInchesToCentimeters(feet, remainder);
        return centimeters;
    }
}
