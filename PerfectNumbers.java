public class PerfectNumbers {

    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        int remainder = 1;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            remainder = number % i;
            if (remainder == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
