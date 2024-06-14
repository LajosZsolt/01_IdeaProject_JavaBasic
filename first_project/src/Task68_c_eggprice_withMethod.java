import java.util.Scanner;

public class Task68_c_eggprice_withMethod {


    public static int[] getEggPricesFromUser() {
        int[] result = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5 ; i++) {
            scanner.nextInt();
            result[i] = scanner.nextInt();
        }
    return result;
    }


  public static double getAvarage(int[] array) {
      double sum = 0;
      for (int i = 0; i < array.length; i++) {
          sum += array[i];
      }
      return sum / array.length;
  }

//    public static void main(String[] args) {
//        int numberOfEggPrices = getEggPricesFromUser();
//        int[] eggPrices = getEggPricesFromUser(numberOfEggPrices);
//        System.out.println("A tojások átlagára= " + getAvarage(eggPrices));
    }




