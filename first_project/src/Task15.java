package hu.progmatic;

import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
// Dobókocka algoritmus
        System.out.println("Hi there! I wanna play with you!");
        System.out.println("1 st player name: ");
        Scanner scanner1 = new Scanner(System.in);
        String player1 = scanner1.nextLine();
        System.out.println("2nd player name: ");
        Scanner scanner2 = new Scanner(System.in);
        String player2 = scanner2.nextLine();
        int player1Total = 0, player2Total = 0;
        Random randomGenerator = new Random();
        for (int i = 0; i <= 3; i++) {
            int player1RandomNumber = randomGenerator.nextInt(6) + 1;
            int player2RandomNumber = randomGenerator.nextInt(6) + 1;
            if (i < 3) {
                player1Total = player1Total + player1RandomNumber;
                player2Total = player2Total + player2RandomNumber;
            } else {
                player1Total = player1Total + (player1RandomNumber * 2);
                player2Total = player2Total + (player2RandomNumber * 2);
            }
        }
        System.out.print(player1);
        System.out.print(" " + player1Total + "  /  ");
        System.out.print(player2);
        System.out.println(" " + player2Total);

        if (player1Total > player2Total) {
            System.out.println(player1 + " won");
        } else if (player1Total < player2Total) {
            System.out.println(player2 + " won");
        } else {
            System.out.println("Equal!");
        }
    }
}

