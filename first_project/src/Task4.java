package hu.progmatic;
import java.util.Random;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        String computerChoose;
        System.out.println("Hi there! I wanna play with you!");
        System.out.println("Please give me head/toss:");
        Scanner scanner = new Scanner(System.in);
        String userChoose = scanner.nextLine();


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(2);

        if (randomNumber == 0) {
            computerChoose = "head";
        } else {
            computerChoose = "toss";
        }

        if (userChoose.equals(computerChoose)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
