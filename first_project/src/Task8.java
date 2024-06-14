package hu.progmatic;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Gives the lengths of the three sides of the triangle:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Side A");
        int sideA = scanner.nextInt();
        System.out.println("Side B");
        int sideB = scanner.nextInt();
        System.out.println("Side C");
        int sideC = scanner.nextInt();

        // két oldal összegének nagyobbnak kell lennie a harmadik oldalnál.

        if ((sideA+sideB) > sideC && (sideA+sideC) > sideB && (sideC+sideB) > sideA) {
                System.out.println("You are a lucky person! This is a real triangle");
        } else {
            System.out.println("It is not good, return to the app, and try again, please!");
        }
    }
}
