public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int largestPrime = 0;
        for (int i = 1; i <= number; i++) {
            boolean isPrime = true;
            if (i == 1) {
                isPrime = false;
            }
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if ((number % i == 0) && (isPrime)) {
                largestPrime = i;
            }
        }

        return largestPrime;
    }

}
