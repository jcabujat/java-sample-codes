package com.JonathanCabujat;

public class Series {

    public static long nSum(int n) {
        return ((n/2)*(n+1));
    }

    public static long factorial(int n) {
        int fact = 1;
        for (int i=1;i<=n;i++) {
            fact *= i;
        }
        return fact;
    }

    public static void fibonacci (int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);
        for (int i=2;i<=n;i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
