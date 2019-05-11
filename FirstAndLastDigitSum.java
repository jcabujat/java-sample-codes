public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number * 2;
        }
        int lastDigit = number % 10;
        while (number >= 0) {
            number /= 10;
            if (number < 10) {
                int firstDigit = number;
                break;
            }
        }
        return lastDigit + number;
    }
}
