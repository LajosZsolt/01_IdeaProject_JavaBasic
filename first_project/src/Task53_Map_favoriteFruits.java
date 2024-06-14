import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task53_Map_favoriteFruits {

    public static void main(String[] args) {

        HashMap<String, Integer> favoriteFruits = new HashMap<>();

        favoriteFruits.put("melon", 2);
        favoriteFruits.put("apple", 1);
        favoriteFruits.put("banana", 2);
        favoriteFruits.put("mango", 1);
        favoriteFruits.put("raspberry", 3);
        favoriteFruits.put("orange", 2);
        favoriteFruits.put("strawberry", 3);
        favoriteFruits.put("melon", 3);

        System.out.println(favoriteFruits);

        for (Map.Entry mapElement : favoriteFruits.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }

    }


}
