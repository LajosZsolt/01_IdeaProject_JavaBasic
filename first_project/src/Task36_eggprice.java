package hu.progmatic;

public class Task36_eggprice {
    public static void main(String[] args) {

        int[] eggPrices = {105, 90, 70, 89, 95};
        double eggSum = 0;

        for (int i = 0; i < eggPrices.length; i++) {
            eggSum = eggPrices[i] + eggSum;
        }
        double result = eggSum / eggPrices.length;
        System.out.println("A tojások átlagára= " + result);
    }
}

