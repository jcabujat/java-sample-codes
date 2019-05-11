public class MinutesToYearsAndDayCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / (24 * 60 * 365);
        long days = (minutes / (24 * 60)) % 365;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
