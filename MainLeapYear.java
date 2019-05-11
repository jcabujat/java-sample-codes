public class Main {

    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear = LeapYear.isLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
