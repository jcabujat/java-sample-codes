public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int digit = 0;
        int sum = 0;

        while (number > 0) {
            digit = number % 10;
            if ((digit % 2) == 0) {
                sum += digit;
            } else if (number < 10 && (number % 2 == 0)) {
                sum += number;
                break;
            }
            number /= 10;
        }
        return sum;
    }
}
