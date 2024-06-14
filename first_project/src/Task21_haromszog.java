

package hu.progmatic;

import java.util.Scanner;

//Fejlesszétek tovább a Háromszög alkalmazást (8as),
// hogy mindaddig ismételje a bekérést a felhasználótól,
// amíg nem ad neki helyes háromszög oldal adatokat.

public class Task21_haromszog {
    public static void main(String[] args) {
        System.out.println("Gives the lengths of the three sides of the triangle:");
        Scanner scanner = new Scanner(System.in);
        boolean rerun = true;

        do {
            System.out.println("Side A");
            int sideA = scanner.nextInt();
            System.out.println("Side B");
            int sideB = scanner.nextInt();
            System.out.println("Side C");
            int sideC = scanner.nextInt();
            // két oldal összegének nagyobbnak kell lennie a harmadik oldalnál.
            if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideC + sideB) > sideA) {
                System.out.println("You are a lucky person! This is a real triangle");
                System.out.println("To continue, press 'Y'");
                Scanner scanner2 = new Scanner(System.in);
                String cont = scanner2.nextLine();
                System.out.println("Your choice: " + cont);
                if  (cont.equals("Y")) {
                    rerun = true;
                }else {
                rerun = false;
                }
            } else {
                System.out.println("Wrong number, give me new numbers!");
            }
        } while (rerun);
    }
}


