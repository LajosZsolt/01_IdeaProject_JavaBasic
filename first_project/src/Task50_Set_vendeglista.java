
//Írjatok egy programot, amely egy Set-ben eltárolja majd “visszaolvassa” a felhasználónak azt az
// 5 kedvenc filmjét, amit bekértünk tőle a konzol segítségével.
// (Külön ciklus készüljön a beolvasásra és mentésre és külön egy az eredmény kiírására)

import java.util.*;

public class Task50_Set_vendeglista {
    public static void main(String[] args) {

        Set<String> guests = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        int numberOfGuests;

        System.out.println("Add meg a vendégek számát!");
        numberOfGuests = Integer.parseInt(scanner.nextLine());

        while (guests.size() < numberOfGuests) {
            System.out.println("Új vendég neve: ");
            String newGuest = scanner.nextLine();
            if (guests.contains(newGuest)) {
                System.out.println("Őt már meghívtad!");
            }
            guests.add(newGuest);
        }
        System.out.println("A meghívottak listája: ");
        for (String guest : guests) {
            System.out.println(guest);
        }
        System.out.println(guests);
    }
}
