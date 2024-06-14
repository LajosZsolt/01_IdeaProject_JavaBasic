
//Írjatok egy tippelő játék programot. Töltsünk fel egy Set-et 3 darab random számmal.
// A számok 0 és 10 között lehetnek (0-val, de 10-el nem).
// A felhasználótól kérjünk be számokat hasonlóan 0 és 10 között és vizsgáljuk meg
// benne van-e a Set-ben. Amennyiben igen, vegyük ki belőle. Ha kiürült a Set,
// mert kivettünk belőle minden elemet, akkor vége a játéknak.
//Számoljuk, hogy hányszor kellett tippelnie a felhasználónak, majd írjuk ki:
// “Gratulálunk, X kör kellett a sikerhez”.
//Ha eltalált egy számot a felhasználó a játék során, akkor írja ki a program,
// hogy “Talált, még X szám, amit meg kell keresned”.

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Task52_Set_tippelo {
    public static void main(String[] args) {

        Set<Integer> computerNumbers = new HashSet<>();

        Random random = new Random();


        while (computerNumbers.size() != 3) {
            int number = random.nextInt(10);
            System.out.println(number);
            computerNumbers.add(number);
        }
        System.out.println(computerNumbers);
        int round = 0;

        while (!computerNumbers.isEmpty()) {
            System.out.println("Give me your tip: ");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            round++;
           // System.out.println("Your tipp is: " + userInput);
            if (computerNumbers.contains(userInput)) {
                computerNumbers.remove(userInput);
                System.out.println("Ok you found one! " + computerNumbers.size() + " more to hit!");
            }
        }

        System.out.println("You finished, you typed " + round + " times!");

    }
}
