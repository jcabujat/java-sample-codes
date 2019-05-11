package com.company;

public class Main {

    public static void main(String[] args) {

        char letter = 'E';
        switch (letter) {
            case 'A':
                System.out.println("Letter " + letter + " found");
                break;

            case 'B':
                System.out.println("Letter " + letter + " found");
                break;

            case 'C':
                System.out.println("Letter " + letter + " found");
                break;

            case 'D':
                System.out.println("Letter " + letter + " found");
                break;

            case 'E':
                System.out.println("Letter " + letter + " found");
                break;

            default:
                System.out.println("Letter not found");
                break;

        }

        String month = "februarY";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Not part of Q1");
                break;
        }
    }
}
