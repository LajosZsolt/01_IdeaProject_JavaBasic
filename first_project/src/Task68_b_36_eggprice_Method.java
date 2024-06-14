import java.util.Scanner;

public class Task68_b_36_eggprice_Method {
    public static void main(String[] args) {



        double avgEggPrice = 0;

        double eggPriceSum;
        int eggPricePieces = eggPricePieces();
        eggPriceSum = eggPricesSum(eggPricesArray(eggPricePieces));
        avgEggPrice = eggPriceSum/ eggPricePieces;

                   System.out.println("A tojások átlagára= " + avgEggPrice);
    }
    public static int eggPricePieces () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add how many egg prices do you want to store: ");
        int eggPricePieces = scanner.nextInt();
       return eggPricePieces;
    }
    public static int[] eggPricesArray(int lengthOfArray){
        int[] eggPrices = new int[lengthOfArray];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < eggPrices.length; i++) {
            System.out.println("Adja meg a tojás árát: ");
            eggPrices[i] = scanner.nextInt();
        }
        return eggPrices;
    }
    public static double eggPricesSum (int[] eggPrices){
        double eggSum = 0;
        for (int i = 0; i < eggPrices.length; i++) {
            eggSum = eggPrices[i] + eggSum;
        }
        return eggSum;
    }

    public static int eggPricesArrayLength (int[] eggPrices){
    int length = eggPrices.length;
    return length;

    }



}

