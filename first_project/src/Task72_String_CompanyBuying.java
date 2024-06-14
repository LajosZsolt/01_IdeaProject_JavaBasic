import com.sun.jdi.Value;

import java.util.*;
public class Task72_String_CompanyBuying {
    static List<String> loggedComapnies = new ArrayList<>();
    /**
     * Adott egy List amiben az adott hónapban felvásárolt cégeket rögzítjük.
     * Összegezzük, hogy összesen hány céget vásároltak fel a fenti úriemberek.
     */
    public static void main(String[] args) {
        List<String> loggedCompanies = Arrays.asList(
                "Zuckerberg,4", "Steve,4", "Bill,1", "Bill,2", "Zuckerberg,4", "Bill,2",
                "Zuckerberg,1", "Zuckerberg,3", "Zuckerberg,1", "Zuckerberg,1", "Steve,4",
                "Bill,2", "Zuckerberg,3", "Bill,2", "Zuckerberg,4", "Steve,1",
                "Bill,3", "Steve,2", "Steve,2", "Bill,11", "Zuckerberg,4",
                "Bill,4", "Steve,4", "Bill,2", "Bill,3", "Zuckerberg,3",
                "Steve,4", "Zuckerberg,4", "Bill,2", "Zuckerberg,3"
        );
              System.out.println("Total count: " + getCompaniesCount(loggedCompanies));
        System.out.println(getCompaniesCountPerPerson(loggedCompanies));
    }
    /**
     * This method add the numbers in the list
     * @param List list of companies and their count
     * @return total count of the Companies
     */
    public static int getCompaniesCount(List<String> List) {
        int number = 0;
        for (String element : List) {
            // String[] array = element.split(",");
            // String numberAsString = array[1];
           String numberAsString = element.split(",")[1];
           // number = number + Integer.parseInt(numberAsString);
            number += Integer.parseInt(numberAsString);
        }
            return number;
    }

    public static Map<String, Integer> getCompaniesCountPerPerson(List<String> List) {
        Map<String, Integer> companiesCountPerPersonMap = new HashMap<>();

        for (String element : List) {
            String[] array = element.split(","); // felbontjuk a lista elemeit a vessző mentén, és egy tömbe rakjuk.
        if (!companiesCountPerPersonMap.containsKey(array[0]))  // ha a tömbe első eleme nincs még benne a Map key-ben,
                    companiesCountPerPersonMap.put(array[0],Integer.parseInt(array[1]));  //akkor hozzáadjuk az első elem a key a második a value
          else companiesCountPerPersonMap.put(array[0],(companiesCountPerPersonMap.get(array[0])+ Integer.parseInt(array[1])));
                // ha már tartalmazza a tömb első elemét a map key, akkor felülírja a key-t, és hozzádaja value-t a meglévő értékhez
           // System.out.println(companiesCountPerPersonMap);
      }
           // System.out.println(companiesCountPerPersonMap);


        return companiesCountPerPersonMap;
    }

}