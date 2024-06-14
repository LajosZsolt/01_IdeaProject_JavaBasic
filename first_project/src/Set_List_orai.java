//Készítsetek programot, amely kiírja azokat a számokat, amiket a legutolsó 300 lottó ötöslottó (1-90)
// nyerőszámok között nem szerepel. A számokat nyugodtan tegyük egy listába a programunkban az
// List<Integer> winnerNumbers = Arrays.asList(31, 87, 6, 47, ...); módon. A számok pedig a következők:


import java.util.*;

public class Set_List_orai {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        List<Integer> numbersList = new ArrayList<>();
        Set<Integer> numbersShortList = new HashSet<>();
        Random random = new Random();


        for (int i = 1; i <= 20; i++) {
            int number = random.nextInt(15);
            numbers.add(number);
            numbersList.add(number);
            if (!numbersShortList.contains(number))
                numbersShortList.add(number);
        }

        System.out.println("Set, ismétlés nélkül:");
        System.out.println(numbers);
        System.out.println("Array, ismétlésekkel:");
        System.out.println(numbersList);
        System.out.println("Az Array lista ismétlés nélkül: ");
        System.out.println(numbersShortList);















        HashMap<String, String> capitalCities = new HashMap<>();
// Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        for (Map.Entry mapElement : capitalCities.entrySet()) {
            System.out.println(mapElement.getKey() + " fővárosa " + mapElement.getValue());
        }




    }
}