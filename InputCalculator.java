import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (!isInt) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            } else {
                int number = scanner.nextInt();
                count++;
                sum += number;
                average = Math.round((double) sum / (double) count);
            }
            scanner.nextLine();
        }

        scanner.close();
    }
}
