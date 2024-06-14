import java.util.*;

public class Task58_MichelinRest {

    public static void main(String[] args) {


        List<String> restaurantVotesList = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour");
        HashMap<String, Integer> restaurantVoteResoultsMap = new HashMap<>();
        int sumOfRestaurants = 0;



        for (String restaurant : restaurantVotesList) {
            if (restaurantVoteResoultsMap.containsKey(restaurant)) {
                int originaVote = restaurantVoteResoultsMap.get(restaurant);
                restaurantVoteResoultsMap.put(restaurant, originaVote + 1);  // felülírom a szavazatszámot
            } else {
                restaurantVoteResoultsMap.put(restaurant, 1);
            }
        }


        System.out.println("Original List: ");
        for (Map.Entry mapElement : restaurantVoteResoultsMap.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue() + " szavazat");
            sumOfRestaurants += (int) mapElement.getValue();
        }
        restaurantVoteResoultsMap.remove("Essencia");

        Map.Entry<String,Integer> maxVote = null;

        System.out.println(restaurantVoteResoultsMap);

        for (Map.Entry<String,Integer> vote:restaurantVoteResoultsMap.entrySet())
        {
            if (maxVote == null || vote.getValue().compareTo(maxVote.getValue()) > 0) {
                maxVote = vote;
            }
        }
        System.out.println();
        System.out.println( maxVote.getKey() + " got the maximum votes " + "(" +maxVote.getValue() + ")");
        System.out.println("");
        System.out.println(maxVote);

        System.out.println("get the Stand from the map: " + restaurantVoteResoultsMap.get("Stand"));

        int newStandVotes = restaurantVoteResoultsMap.get("Stand") + 11;
        restaurantVoteResoultsMap.put("Stand", newStandVotes);


        System.out.println();
        System.out.println("Modified list: " + restaurantVoteResoultsMap);

        for (Map.Entry<String,Integer> vote:restaurantVoteResoultsMap.entrySet())
            {
                if (maxVote == null || vote.getValue().compareTo(maxVote.getValue()) > 0) {
                    maxVote = vote;
                }
            }
        System.out.println();
        System.out.println( maxVote.getKey() + " got the maximum votes " + "(" +maxVote.getValue() + ")");
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