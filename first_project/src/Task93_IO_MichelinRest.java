import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task93_IO_MichelinRest {

    public static void main(String[] args) {
               List<String> restaurantVotesList ;
        try {
            restaurantVotesList = Files.readAllLines(Path.of("src/resources/restaurants.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        HashMap<String, Integer> restaurantVoteResoultsMap = new HashMap<>();

        int sumOfRestaurants = 0;


        for (String restaurant : restaurantVotesList) {
            if (restaurantVoteResoultsMap.containsKey(restaurant)) {
                int originaVote = restaurantVoteResoultsMap.get(restaurant);
                restaurantVoteResoultsMap.put(restaurant, originaVote + 1);  // felülírom a szavazatszámot,
            } else {                                                         // minden előfordulással a listán.
                restaurantVoteResoultsMap.put(restaurant, 1);
            }
        }


        System.out.println("Original List: ");
        for (Map.Entry mapElement : restaurantVoteResoultsMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue() + " szavazat");
            sumOfRestaurants += (int) mapElement.getValue();
        }
        restaurantVoteResoultsMap.remove("Essencia");

        Map.Entry<String, Integer> maxVote = null;

        System.out.println(restaurantVoteResoultsMap);

        for (Map.Entry<String, Integer> vote : restaurantVoteResoultsMap.entrySet()) {
            if (maxVote == null || vote.getValue().compareTo(maxVote.getValue()) > 0) {
                maxVote = vote;
            }
        }
        System.out.println();
        System.out.println(maxVote.getKey() + " got the maximum votes " + "(" + maxVote.getValue() + ")");
        System.out.println("");
        System.out.println(maxVote);


        int newStandVotes = (restaurantVoteResoultsMap.get("Stand")) + 11;
        restaurantVoteResoultsMap.put("Stand", newStandVotes);


        System.out.println();
        System.out.println("Modified list: " + restaurantVoteResoultsMap);

        for (Map.Entry<String, Integer> vote : restaurantVoteResoultsMap.entrySet()) {
            if (maxVote == null || vote.getValue().compareTo(maxVote.getValue()) > 0) {
                maxVote = vote;
            }
        }
        System.out.println();
        System.out.println(maxVote.getKey() + " got the maximum votes " + "(" + maxVote.getValue() + ")");
        System.out.println("");


        System.out.println();
        System.out.println("Number of restaurants: " + restaurantVoteResoultsMap.size());
        System.out.println("Number of all vote, from original List: " + restaurantVotesList.size());

        int sumOfVotes = 0;
        for (Map.Entry mapElement : restaurantVoteResoultsMap.entrySet()) {
            sumOfVotes += (int) mapElement.getValue();
        }
        System.out.println("Number of all vote, from Map: " + sumOfVotes);

    }


}