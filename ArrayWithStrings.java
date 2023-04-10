public class ArrayWithStrings {
    public static void main(String[] args) {
        System.out.println();

        String[] saiyans = new String[10];

        saiyans[0] = "Goku";
        saiyans[1] = "Vegeta";
        saiyans[2] = "Gohan";
        saiyans[3] = "Trunks";
        saiyans[4] = "Goten";
        saiyans[5] = "Broly";
        saiyans[6] = "Bardock";
        saiyans[7] = "Raditz";
        saiyans[8] = "Nappa";
        saiyans[9] = "Kale";

        System.out.println("The saiyans are: ");

        for (int i = 0; i < saiyans.length; i++) {
            System.out.println(saiyans[i]);
        }

        System.out.println();
    }
}
