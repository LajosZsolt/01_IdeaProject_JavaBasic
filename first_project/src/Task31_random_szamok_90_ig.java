package hu.progmatic;

import java.util.Random;

public class Task31_random_szamok_90_ig {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[5];

        for (int i=0; i < randomNumbers.length; i++){
            randomNumbers[i] = random.nextInt(90)+1;
        }
        for (int i=0; i < randomNumbers.length; i++){
            System.out.print(randomNumbers[i] + " ");
            randomNumbers[i] = random.nextInt(90)+1;
        }
    }
}