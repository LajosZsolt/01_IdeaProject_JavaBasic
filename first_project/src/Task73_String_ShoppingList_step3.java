import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Task73_String_ShoppingList_step3 {
    /**
     * Készítsetek egy alkalmazást, amely egy bevásárló lista.
     * Az elemeket be tudja olvasni az alábbi formában:
     * tétel-db vagyis, kenyér-2 vagy sör-6.
     * <p>
     * Az így beolvasott elemeket feldarabolja a - jel mentén és elmenti egy shoppingList nevű Map-be.
     * Az első fele, a kötőjel előtti rész legyen a kulcs, a második rész pedig a darabszám.
     * System.out.println()-el írjátok ki a képernyőre a map tartalmát.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Add items and values in the item-value format and press ENTER)" +
                " If you type X then execution ends");

        System.out.println(getShoppingListAsMap());
    }

    public static Map<String, Integer> getShoppingListAsMap() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> shoppingList = new HashMap();
        String userInput;
        do {
            System.out.println("your item: ");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("X")) {
                String[] userInputAsArray = userInput.split("-");
                String item = userInputAsArray[0];
                String value = userInputAsArray[1];
                int valueInt = Integer.parseInt(value);
                shoppingList.put(item, valueInt);
            }
        } while (!userInput.equalsIgnoreCase("X"));
        return shoppingList;
    }

}
