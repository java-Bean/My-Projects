public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int keyToMeg = kiloBytes / 1024;
        int keyToMegRemainder = kiloBytes % 1024;

        if (kiloBytes < 0) {

            System.out.println("Invalid Value");

        } else {

            System.out.println(kiloBytes + " KB = " + keyToMeg
                    + " MB and " + keyToMegRemainder + " KB");

        }

    }
}
