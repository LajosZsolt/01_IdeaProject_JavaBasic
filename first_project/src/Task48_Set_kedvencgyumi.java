import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task48_Set_kedvencgyumi {

    public static void main(String[] args) {
        System.out.println("Kedvenc 7 Gyümölcsöm Listája!");
        Set<String> favoriteFruits = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (favoriteFruits.size() < 7) {
            System.out.println("Adja meg a kedvenc gyümölcsét: " + "(" + favoriteFruits.size() + " / " + "7)");
            String userInput = scanner.nextLine();
            favoriteFruits.add(userInput);
        }
        System.out.println(favoriteFruits);

    }
}
