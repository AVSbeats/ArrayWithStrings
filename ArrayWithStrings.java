public class ArrayWithStrings {
    public static void main(String[] args) {

        String[] saiyans = new String[5];

        saiyans[0] = "Goku";
        saiyans[1] = "Vegeta";
        saiyans[2] = "Gohan";
        saiyans[3] = "Trunks";
        saiyans[4] = "Goten";

        System.out.println("The saiyans are: ");

        for (int i = 0; i < saiyans.length; i++) {
            System.out.println(saiyans[i]);
        }
    }
}
