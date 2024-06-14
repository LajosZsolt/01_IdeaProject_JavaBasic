package hu.progmatic;

public class Task10_for {
    public static void main(String[] args) {
/*Készítsetek egy programot, amely a számok szorzatát írja ki 0-tól 10-ig.
(magukat a számokat nem, csak az összes szám szorzatát)
készítsük el while-al
készítsük el for-al */

        int result = 0;
        for (int number = 0; number <= 10; number++) {

            result = result * number;

        }
        System.out.println();
        System.out.println("Resoult: " + result);
    }
}

