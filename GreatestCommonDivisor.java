public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first,int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int upperLimit =0;
        upperLimit = first > second ? first : second;
        int remainder1 = 1;
        int remainder2 = 1;
        for (int i = upperLimit; i >=0 ; i--) {
            if (i <= first) {
                remainder1 = first % i;
            }
            if (i <= second) {
                remainder2 = second % i;
            }
            if (remainder1 == 0 && remainder2 == 0) {
                return i;
            }
        }
        return -1;
    }
}
