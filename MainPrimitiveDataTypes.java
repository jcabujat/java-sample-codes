package com.company;

public class Main {

    public static void main(String[] args) {
        /* 1 byte = 8 bits;
           minimum value = - 2^(n-1)
           where n =no.of bits;
           max value = 2^(n-1) - 1 */
        byte minByte = -128; /* 1 byte or 8 bits*/
        short minShort = -32768; /* 2 bytes or 16 bits*/
        int minInt = -2_147_483_648; /* 4 bytes or 32 bits*/
        long minLong = -9_223_372_036_854_775_808L;  /* 8 bytes or 64 bits */
        float minFloat = -3.4e-038f;   /* up to 6-7 decimal digits; 4 bytes */
        double minDouble = -1.7e-038d; /* up to 15 decimal digits; 8 bytes */
        boolean myBoolean = true; /* true or false */
        char myChar1 = 'v'; /* regular char; 1 byte only */
        char myChar2 = '\u00A9'; /* unicode char for copyright symbol */
        char myChar3 = '\u00AE';/* unicode char for registered symbol */
        System.out.println("Byte  : " + minByte);
        System.out.println("Short : " + minShort);
        System.out.println("Int   : " + minInt);
        System.out.println("Long  : " + minLong);
        System.out.println("Float : " + minFloat);
        System.out.println("Double: " + minDouble);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Reg Char: " + myChar1);
        System.out.println("Unicode char: " + myChar2);
        System.out.println("Registered symbol: " +myChar3);
    }
}
