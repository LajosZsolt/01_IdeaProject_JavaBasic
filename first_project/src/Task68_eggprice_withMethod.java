public class Task68_eggprice_withMethod {


  public static double getAvarage(int[] array) {
      double sum = 0;
      for (int i = 0; i < array.length; i++) {
          sum += array[i];
      }
      return sum / array.length;
  }

    public static void main(String[] args) {
        int[] eggPrices = {105, 90, 70, 89, 95};
        System.out.println("A tojások átlagára= " + getAvarage(eggPrices));
    }
}

