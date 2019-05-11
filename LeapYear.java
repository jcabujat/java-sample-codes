public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        double remainderFrom4 = year % (Math.round(year / 4) * 4);
        double remainderFrom100 = year % (Math.round(year / 100) * 100);
        double remainderFrom400 = year % (Math.round(year / 400) * 400);
        if (remainderFrom4 == 0) {
            if (remainderFrom100 == 0) {
                return remainderFrom400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
