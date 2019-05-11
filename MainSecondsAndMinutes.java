package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        int minutes = 60;
        int seconds = -1;
        String duration = getDurationString(minutes,seconds);
        System.out.println(duration);

        seconds = 7200;
        duration = getDurationString(seconds);
        System.out.println(duration);
	// write your code here
    }

    public static String getDurationString (int minutes,int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
