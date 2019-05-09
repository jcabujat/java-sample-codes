public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        int totalBig = bigCount * 5;
        if ((totalBig + smallCount) >= goal) {
            int bigRemain = totalBig % goal;
            if (bigRemain == 0) {
                return true;
            } else {
                int smallNeeded = 5 - bigRemain;
                return (smallCount >= smallNeeded);
            }
        } else {
            return false;
        }
    }
}
