import java.util.Scanner;

public class Task36_eggprice_b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add how many egg prices do you want to store: ");
        int eggPricePieces = scanner.nextInt();
        double[] eggPrices = new double[eggPricePieces];
        double eggSum = 0;


        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("Adja meg a tojás árát: ");
            eggPrices[i] = scanner.nextDouble();

        }

        for (int i = 0 ; i < eggPrices.length; i++) {
            eggSum = eggSum + eggPrices[i];
        }
        double result = eggSum / eggPrices.length;
        System.out.println("A tojások átlagára= " + result);
    }
}

