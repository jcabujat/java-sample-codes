public class Palindrome {

    public static boolean isPalindrome (int number) {

        int lastDigit = 0;
        int reverse = 0;
        int origNumber = Math.abs(number);
        number = Math.abs(number);
        while (number > 0) {
            lastDigit = (number) % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
            if (number >= 10) {
                continue;
            } else {
                lastDigit = number;
                reverse = (reverse * 10) + lastDigit;
                break;
            }
        }
        return origNumber == reverse;
    }
}
