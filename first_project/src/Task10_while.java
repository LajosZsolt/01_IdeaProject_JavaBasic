package hu.progmatic;

public class Task10_while {
    public static void main(String[] args) {
/*Készítsetek egy programot, amely a számok szorzatát írja ki 0-tól 10-ig.
(magukat a számokat nem, csak az összes szám szorzatát)
készítsük el while-al
készítsük el for-al */

        int result = 0;
        int number = 0;
        while (number <=10){
            result = result * number;
            number++;
            }
        System.out.println("Resoult: " + result);
        }
}


