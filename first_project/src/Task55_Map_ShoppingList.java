import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task55_Map_ShoppingList {

    public static void main(String[] args) {
        System.out.println("Shoppinglist!");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> shoppingList = new HashMap<>();
        String product;
        int amount;
        int counter = 0;
        boolean cont = true;
        int sumOfAmounts = 0;
        int intAmounts = 0;
// while ciklusban, a lista folyamatos bekérése, amíg a cont (boolean) változó, true értéken van.
        while (cont) {
            System.out.println("Give me product:" + "(Already " + shoppingList.size() + " items on your list!)");
            product = scanner.nextLine();
            System.out.println("Give me the amount of product: ");
            amount = Integer.parseInt(scanner.nextLine());
// Megjegyzés, hogy ha már létező értékhez (Key) új mennyiséget rögzítünk a listára!
            if (shoppingList.containsKey(product))
                System.out.println("The quantity of this item has been modified!");
            shoppingList.put(product, amount);
            counter++; //számláló, hogy a lista 3 tagja után mindig megkérdezze a folytatást.
            if (counter>3){
                System.out.println("Would you like to continue the list? (Y or N)");
                String userCont = scanner.nextLine();
                if (!userCont.equals("Y"))
                    cont = false;
            }
        }
        for (Map.Entry mapElement: shoppingList.entrySet()) {
            sumOfAmounts = sumOfAmounts + (int) mapElement.getValue();
        }
        for (String numb : shoppingList.keySet()) {
            intAmounts += shoppingList.get(numb);
        }

        System.out.println("Count of products: " + shoppingList.size());
        System.out.println("Sum of all Amounts: " + sumOfAmounts);
        System.out.println("Sum of all Amounts(Méri): " + intAmounts);


        System.out.println(shoppingList);
        for (Map.Entry mapElement : shoppingList.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }




    }
}