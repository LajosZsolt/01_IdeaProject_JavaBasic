public class Task68_36_eggprice_Method {
    public static void main(String[] args) {

        double avgEggPrice = 0;
        avgEggPrice = eggPricesSum(eggPricesArray())/eggPricesArrayLength(eggPricesArray());
        System.out.println("A tojások átlagára= " + avgEggPrice);


    }

    public static int[] eggPricesArray(){
        int[] eggPrices = {105, 90, 70, 89, 95};
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

