public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        int digitCount = getDigitCount(number);

        for (int i = 1; i <= digitCount; i++) {
            int digit = reverseNumber % 10;
            reverseNumber = reverseNumber / 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        if (Math.abs(number) < 10) {
            return number;
        }
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = Math.abs(number);
        }
        int reverseDigit = 0;
        int reverseNumber = 0;

        while (number > 0) {
            reverseDigit = (number) % 10;
            reverseNumber = (reverseNumber * 10) + reverseDigit;
            number /= 10;
            if (number >= 10) {
                continue;
            } else {
                reverseDigit = number;
                reverseNumber = (reverseNumber * 10) + reverseDigit;
                break;
            }
        }
        if (isNegative) {
            reverseNumber *= -1;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int reverseDigit = 0;
        int digitCount = 0;

        while (number >= 0) {
            if (number >= 10) {
                reverseDigit = (number) % 10;
                number /= 10;
                digitCount++;
            } else {
                reverseDigit = number;
                digitCount++;
                break;
            }
        }
        return digitCount;
    }
}
