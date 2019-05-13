package com.BillsBurger;

import java.util.Scanner;

public class Validate {

    public static boolean validateInput(int input, int maxLimit) {
        if ((input < 0) || (input > maxLimit)) {
            System.out.println("Invalid Order. \n Do you want to select again? (Y/N):");
            Scanner yesOrNo = new Scanner(System.in);
            String yesNo = yesOrNo.nextLine();
            yesNo.toLowerCase();
            switch (yesNo) {
                case "y":
                    return false;
                case "n":
                    System.exit(0);
                default:
                    System.out.println("Select Y or N only");
                    validateInput(input, maxLimit);
            }
        }
        return true;
    }
}
