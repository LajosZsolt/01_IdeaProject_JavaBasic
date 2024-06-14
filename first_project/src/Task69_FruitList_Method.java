import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task69_FruitList_Method {


    public static void main(String[] args) {
        getFavoriteFruits();
        printListSeparator();
        printListWithPrintln();
        printListSeparator();
        printListWithForeach();
        printListSeparator();
        printListWithFor();
        printListSeparator();
        printListWithWhile();
        printListSeparator();
        printListWithDoWhile();
    }

    public static List<String> getFavoriteFruits() {
        List<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Melon");
        favoriteFruits.add("Chelly");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Strawberry");
        favoriteFruits.add("Raspberry");
        return favoriteFruits;
    }

    public static void printListWithPrintln() {
        System.out.println("With println: " + getFavoriteFruits());
    }

    public static void printListWithForeach() {
        System.out.println("With foreach:");
        for (String fruit : getFavoriteFruits()) {
            System.out.println(fruit);
        }
    }

    public static void printListWithFor() {
        System.out.println("With for:");
        for (int i = 0; i < getFavoriteFruits().size(); i++) {
            System.out.println(getFavoriteFruits().get(i));
        }
    }

    public static void printListWithWhile() {
        System.out.println("With while:");
        int i = 0;
        while (i < getFavoriteFruits().size()) {
            System.out.println(getFavoriteFruits().get(i));
            i++;
        }
    }

    public static void printListWithDoWhile() {
        System.out.println("With do-while:");
        int i = 0;
        do {
            System.out.println(getFavoriteFruits().get(i));
            i++;
        } while (i < getFavoriteFruits().size());
    }

    public static void printListSeparator() {
        System.out.println("----------------------------");
    }

}