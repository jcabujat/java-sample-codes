package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "Hello Jonathan!";
        String newString = myString + "\nYou're looking good! :)"; /* \n means new line*/
        String addString = myString + newString;
        String uniString = myString + "\u00AE registered";
        int myInt = 10;
        String myNum = "50";
        String intString = myInt + myNum; /* playing with int and String; String can accept int values*/
        System.out.println("This is a string");
        System.out.println(myString);
        System.out.println(newString);
        System.out.println(addString);
        System.out.println(uniString);
        System.out.println(intString);
    }
}
