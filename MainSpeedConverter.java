public class Main {

    public static void main(String[] args) {
        double kph = 10.25;
        long mph = SpeedConverter.toMilesPerHour(kph);
        SpeedConverter.printConversion(kph);
    }
}
