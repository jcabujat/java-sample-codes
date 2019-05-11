public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % (megaBytes * 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}

