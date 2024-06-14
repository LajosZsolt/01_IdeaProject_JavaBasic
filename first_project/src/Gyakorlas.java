

import java.util.Random;
import java.util.Scanner;

public class Gyakorlas {
    public static void main(String[] args) {
        int maxNumber = 2000;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(maxNumber);
        int remainder = randomNumber / 2;
        if (remainder == 0) {
            System.out.println(randomNumber + " is even!");
        } else {
            System.out.println(randomNumber + " is odd!");
        }

//        int inputAge = yourAge();
//        boolean kiscica = isThisAdult(inputAge);
//        printIsAdult(kiscica);
        printIsAdult(isThisAdult(yourAge()));

        printGoodby();
    }

    public static void printGoodby() {
        System.out.println("Hello! Have a nice day. Good bye!");
    }

    public static int yourAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg hány éves: ");
        int age = scanner.nextInt();
        System.out.println();
        return age;
    }

    public static boolean isThisAdult(int age) {
        boolean isAdult;
        if (age >= 18)
            isAdult = true;
        else
            isAdult = false;
        return isAdult;
    }

    public static void printIsAdult(boolean adult) {
        if (adult)
            System.out.println("Elmultál 18 éves beléphetsz!");
        else
            System.out.println("Nem vagy még 18 éves, nem léphetsz be!");
    }


}
