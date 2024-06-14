package hu.progmatic;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
// Készítsetek egy életkor ellenőrző programot,
// amely bekéri a felhasználótól a használni kívánt életkort,
// majd ellenőrzi, hogy negatív számot (vagy 0-t) adott-e meg.
// Ismételjük mindaddig a bekérés utasítását, amíg helyes életkort
// nem adott meg a felhasználó.
//használjunk while ciklust az implementációhoz
//használjunk do while ciklust az implementációhoz


        System.out.println("Hi how years old are you:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        while (age <= 0) {
            System.out.println("Wrong number, give me one another number!");
            System.out.println("Age: ");
            age = scanner.nextInt();
        }

        System.out.println("Nice! Your age is: " + age);

        //do while
        System.out.println("DO - Hi how years old are you:");
        System.out.println("Age: ");
        int ageDo = scanner.nextInt();
        System.out.println(age);

        do {
            System.out.println("DO - Wrong number, give me one another number!");
            System.out.println("DO - Age: ");
            ageDo = scanner.nextInt();
        } while (ageDo <= 0);

        System.out.println("DO - Nice! Your age is: " + ageDo);
    }
}

