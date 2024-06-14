package hu.progmatic;

import java.util.Scanner;


public class Task7a {
    public static void main(String[] args) {
        System.out.println("Hello what day of the week is it, Monday is the first: ");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();

        if (dayOfWeek == 4 || dayOfWeek == 5 || dayOfWeek == 6) {
                System.out.println("Italos nap van, ide a ciromos sört de gyorsan");
        } else if (dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 3 || dayOfWeek == 7) {
            System.out.println("Ez nem a Te napod, majd talán holnap!");
        } else {
            System.out.println("Wrong number, it must be between 1 and 7!");
        }
    }
}
