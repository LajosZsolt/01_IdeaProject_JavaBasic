package hu.progmatic;

import java.util.Scanner;


public class Task33_MyFavoriteCar {
    public static void main(String[] args) {
        System.out.println("My Favorite Car!");
        String[] carsArray = {"Honda", "VolksWagen ", "Tesla", "Audi", "BMW", "Nissan", "Hyundai", "Tesla"};

        String myFavoriteCar = "Tesla";

        for (int i = 0; i < carsArray.length; i++) {
            if (carsArray[i].equals(myFavoriteCar)) {
                System.out.println(carsArray[i] + " a kedvenc autómárkám.");
                break; //ezzel megszakítom a ciklust, amikor már nem kell tovább futattatni.
            }
            System.out.println("check: " + i + " array element");
        }

    }
}