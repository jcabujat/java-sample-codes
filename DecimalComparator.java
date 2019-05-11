public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Convert = (int) (num1 * 1000);
        int num2Convert = (int) (num2 * 1000);
        System.out.println(num1Convert + " " + num2Convert);
        return (num1Convert == num2Convert);
    }
}
