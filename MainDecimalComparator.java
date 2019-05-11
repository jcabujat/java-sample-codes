public class Main {

    public static void main(String[] args) {
        double num1 = 3.1757;
        double num2 = 3.1756;
        boolean isSameUpTo3Decimal = DecimalComparator.areEqualByThreeDecimalPlaces(num1, num2);
        if (isSameUpTo3Decimal) {
            System.out.println(num1 + " and " + num2 + " are the same up to 3 decimal places");
        } else{
            System.out.println(num1 + " and " + num2 + " are not the same");
        }
    }
}
