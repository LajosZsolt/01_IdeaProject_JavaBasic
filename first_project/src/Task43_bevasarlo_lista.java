package hu.progmatic;

//Írjatok egy bevásárló lista programot. Amely nem csinál mást, mint a felhasználótól beolvasott elemeket elmenti
// egy List-be és a végén ki is írja a felhasználó számára az elmentett elemeket.
//        fix 7 elemű legyen a lista, pontosan 7 elemet lehessen hozzáadni
//        ne legyen limitálva, hogy mennyi elemet adhat a felhasználó. Ha a felhasználó az “x” karaktert ír lista
//        elemként, akkor szakítsa meg a beolvasást és folytatódjon a program futása.
//        oldjuk meg, hogy csak akkor adja hozzá a listához a felhasználó által beírt elemet ha még nincs benne.
//        Ha már benne van, akkor írjuk ki, hogy  “Ez az elem már hozzáadásra került!”.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task43_bevasarlo_lista {
    public static void main(String[] args) {
        System.out.println("Shopping list.");
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();


        for (int i = 1; i <= 7; i++) {
            System.out.println("Add your shopping list's item: ");
            String userInput = scanner.nextLine();
            if (shoppingList.contains(userInput)) {
                System.out.println("This item already added!");
                i--;
            } else {
                shoppingList.add(userInput);
            }
            //System.out.println("Your shopping list: " + shoppingList);
        }
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }
}
