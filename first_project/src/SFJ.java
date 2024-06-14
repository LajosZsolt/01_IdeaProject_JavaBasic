package hu.progmatic;

import java.util.Random;

public class SFJ {
    public static void main(String[] args) {
        int a = 84;
        int b = 9;
        int maradek = a % b;
        System.out.println("Az osztás eredménye: " + a / b);
        System.out.println("Az osztás maradéka: " + maradek);

        int maxNumber = 2000;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(maxNumber);

        int remainder = randomNumber % 2;
        if (remainder == 0) {
            System.out.println(randomNumber + " is even!");
        } else {
            System.out.println(randomNumber + " is odd!");
        }
    }
}

