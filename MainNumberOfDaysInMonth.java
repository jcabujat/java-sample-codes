public class Main {

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(4,2019));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(3,2019));
    }
}
