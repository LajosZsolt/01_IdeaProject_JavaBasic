package hu.progmatic;

import java.util.Random;
import java.util.Scanner;

public class Task16_ko_papir_ollo_a_b {
    public static void main(String[] args) {
// (Órai) Írjunk kő-papír-olló játékot. A program minden indítás után válasszon
// egy random eszközt, majd vesse össze a felhasználó által megadott eszközzel.
// Miután kiértékelte, hogy ki nyert írja ki, hogy mi volt nála és hogy ki nyerte
// a játékot. Figyeljünk rá, hogy a játékos csak a kő, papír, olló eszközöket választhassa.
// Ellenkező esetben írjunk ki egy figyelmeztető üzenetet.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess one! Rock / Paper / Siccors : ");
        String userHand = scanner.nextLine();

        String computerHand = null;
        Random randomGenerator = new Random();
        int computerGuess = randomGenerator.nextInt(2);

        switch (computerGuess) {
            case 0 -> computerHand = "Rock";
            case 1 -> computerHand = "Paper";
            case 2 -> computerHand = "Scissors";
        }
        System.out.println("Computer guess: " + computerHand);

        if (userHand.equals(computerHand)) {
            System.out.println("Draw !");
        } else if ( (userHand.equals("Rock") && computerHand.equals("Siccors")) ||
                (userHand.equals("Paper") && computerHand.equals("Rock")) ||
                (userHand.equals("Siccors") && computerHand.equals("Paper")) ){
            System.out.println("You win !");
        } else {
            System.out.println("Computer win !");
        }
    }
}

