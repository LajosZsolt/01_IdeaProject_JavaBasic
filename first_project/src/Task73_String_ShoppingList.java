import java.util.*;


public class Task73_String_ShoppingList {
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
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> shoppingList = new HashMap();
        System.out.println("Add items and values in the item-value format and press ENTER)" +
                " If you type X then execution ends");

        String userInput = scanner.nextLine();
        String [] userInputAsArray = userInput.split("-");
        String item = userInputAsArray[0];
        String value = userInputAsArray[1];
        int valueInt = Integer.parseInt(value);
        shoppingList.put(item,valueInt);

        System.out.println(shoppingList);
    }
}
