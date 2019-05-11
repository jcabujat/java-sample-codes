public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int j = 1; j <= number; j++) {
                int columnNo = number - i + 1;
                if ((i == 1) || (i == number) || (j == 1) || (j == number) ||
                        (i == j) || (j == columnNo)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }

    }
}
