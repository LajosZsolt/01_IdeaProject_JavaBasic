package hu.progmatic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task37_Lists {
    public static void main(String[] args) {
        List<String> randomNames = new ArrayList<>();
        List<Integer> randomNums = new ArrayList<>();
        List<Double> randomDoubleNums = new ArrayList<>();
        List<Boolean> randomBooleans = new ArrayList<>();

        randomNames.add("Viktor");
        randomNames.add("Elek");
        randomNames.add("Béla");
        randomNames.add("Sanyi");
        randomNums.add(5);
        randomDoubleNums.add(2.1);
        randomBooleans.add(false);

        List<String> names = Arrays.asList("Viktor", "József", "Benedek");
        List<Integer> years = Arrays.asList(1990, 1987, 2002, 1992);

        System.out.println(randomNums);
        System.out.println(randomNames);
        System.out.println(randomNames.get(2));
        System.out.println(years);

        System.out.println(randomNames.size());                 // eredménye egy egész szám lesz
        System.out.println(randomNames.isEmpty());              // eredménye true vagy false lesz
        randomNames.remove(3);              // végrehajtja
        System.out.println(randomNames.contains("Sanyi"));  // eredménye true vagy false lesz
        randomNames.add("Sanyi");
        System.out.println(randomNames);

        List<Integer> numsList = new ArrayList<>();
        for (int i = 100; i <= 111; i++) {
            numsList.add(i);
        }
        System.out.println(numsList);

        List<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Melon");
        favoriteFruits.add("Chelly");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Strawberry");
        favoriteFruits.add("Raspberry");


        System.out.println(favoriteFruits);
        System.out.println();
        System.out.println("with foreach: ");

        for (String fruit : favoriteFruits) {
            System.out.println(fruit);
        }
        System.out.println();
        System.out.println("with for: ");

        for (int i = 0; i < favoriteFruits.size(); i++)
            System.out.println(favoriteFruits.get(i));

    }
}