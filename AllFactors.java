public class AllFactors {

    public static void printFactors (int number) {
        if (number <= 0) {
            System.out.println("Invalid Value");
        }
        int remainder = 1;
        for (int i = 1; i <= number; i++) {
            remainder = number % i;
            if (remainder == 0) {
                System.out.println(i);
            }
        }
    }
}
