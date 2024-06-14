package hu.progmatic;

import java.util.Scanner;


public class Task25_het_napjai {
    public static void main(String[] args) {
        System.out.println("Hello what day of the week is it, Monday is the first: ");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 4, 5, 6 -> System.out.println("Italos nap van, ide a ciromos sört de gyorsan");
            case 1, 2, 3, 7 -> System.out.println("Ez nem a Te napod, majd talán holnap!");
            default -> System.out.println("Wrong number, it must be between 1 and 7!");
        }

    }
}
