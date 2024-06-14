import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_orai_gyak {

    public static void main(String[] args) {

        // Salary store
        Map<String, Integer> salaryStore = new HashMap<>();
        List<String> salaryWith600k = new ArrayList<>();

        salaryStore.put("Viktor", 600000);
        salaryStore.put("Zsolt", 200000);
        salaryStore.put("Győző", 900000);
        salaryStore.put("Győző", 950000);

        System.out.println(salaryStore);
        System.out.println(salaryStore.get("Győző"));  //visszadja a kulcsohoz tartozó értéket.

        for (Map.Entry mapElement : salaryStore.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            if (mapElement.getValue().equals(600000))
                System.out.println("megvan: " + mapElement.getKey());

        }

    }
}

