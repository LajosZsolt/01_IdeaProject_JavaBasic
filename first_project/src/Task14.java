package hu.progmatic;

import java.util.Random;

public class Task14 {
        public static void main(String[] args) {
// EuroJackpot
        /*Az Eurojackpot játékban az „A” mezőn 50 számból 5-t, a
         „B” mezőn pedig 12 számból 2-t kell megjelölni.
         Akkor nyersz a heti két alkalommal megrendezett sorsoláson,
         ha az „A” és „B” mezőben elért találataid száma legalább 3.
        */

        // A mező
        Random randomGenerator = new Random();
        int number1 = randomGenerator.nextInt(50) + 1;
        int number2 = randomGenerator.nextInt(50) + 1;
        int number3 = randomGenerator.nextInt(50) + 1;
        int number4 = randomGenerator.nextInt(50) + 1;
        int number5 = randomGenerator.nextInt(50) + 1;

        while (number1 == number2) {
            number2 = randomGenerator.nextInt(50) + 1;
        }
        while (number3 == number1 || number3 == number2) {
            number3 = randomGenerator.nextInt(50) + 1;
        }
        while (number4 == number1 || number4 == number2 || number4 == number3) {
            number4 = randomGenerator.nextInt(50) + 1;
        }
        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = randomGenerator.nextInt(50) + 1;
        }
        System.out.println("Eurojackpot - A mező nyertes számai:");
        System.out.print(number1 + " ");
        System.out.print(number2 + " ");
        System.out.print(number3 + " ");
        System.out.print(number4 + " ");
        System.out.print(number5 + " ");

        // B mező
        Random randomGeneratorB = new Random();
        int numberb1 = randomGeneratorB.nextInt(12) + 1;
        int numberb2 = randomGeneratorB.nextInt(12) + 1;
        while (numberb1 == numberb2) {
            numberb2 = randomGeneratorB.nextInt(12) + 1;
        }
        System.out.println();
        System.out.println("B mező nyertes számai:");
        System.out.print(numberb1 + " ");
        System.out.println(numberb2);
        System.out.println();

// hatoslottó
// A hatoslottó lényege, hogy 45 szám közül eltaláljuk azt a 6 szerencséset,
// amelyet a Szerencsejáték Zrt.

        Random randomGenerator6 = new Random();
        int number1_6 = randomGenerator6.nextInt(45) + 1;
        int number2_6 = randomGenerator6.nextInt(45) + 1;
        int number3_6 = randomGenerator6.nextInt(45) + 1;
        int number4_6 = randomGenerator6.nextInt(45) + 1;
        int number5_6 = randomGenerator6.nextInt(45) + 1;
        int number6_6 = randomGenerator6.nextInt(45) + 1;

        while (number1_6 == number2_6) {
            number2_6 = randomGenerator6.nextInt(45) + 1;
        }
        while (number3_6 == number1_6 || number3_6 == number2_6) {
            number3 = randomGenerator6.nextInt(45) + 1;
        }
        while (number4_6 == number1_6 || number4_6 == number2_6 || number4_6 == number3_6) {
            number4_6 = randomGenerator6.nextInt(45) + 1;
        }
        while (number5_6 == number1_6 || number5_6 == number2_6 || number5_6 == number3_6 || number5_6 == number4_6) {
            number5_6 = randomGenerator6.nextInt(45) + 1;
        }
        while (number6_6 == number1_6 || number6_6 == number2_6 || number6_6 == number3_6 || number6_6 == number4_6 || number6_6 == number5_6) {
            number5_6 = randomGenerator6.nextInt(45) + 1;
        }

        System.out.println("Hatoslottó nyertes számai:");
        System.out.print(number1_6 + " ");
        System.out.print(number2_6 + " ");
        System.out.print(number3_6 + " ");
        System.out.print(number4_6 + " ");
        System.out.print(number5_6 + " ");
        System.out.print(number6_6 + " ");
    }
}