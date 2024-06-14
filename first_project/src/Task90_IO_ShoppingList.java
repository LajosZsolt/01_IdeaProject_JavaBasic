import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class Task90_IO_ShoppingList {
    /**
     * Készítsétek el a classic bevásárlólista alkalmazást egyszerűsített változatát,
     * amely beolvas a konzolról tételek és darabszámokat (pl.: “tej 3db”).
     * Ezen tételeket el egy String elemű listában. Készítsünk egy metódust,
     * amely a paraméterül kapott String-et kiírja egy shoppinglist.txt-be.
     * (Tehát a listát át kell alakítani, összefűzni egy hosszú Stringgé egy elválasztó karakter,
     * pl vessző használatával)
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Shopping content: ");
            String item = scan.nextLine();
            shoppingList.add(item);
        } while (shoppingList.size() != 3);

        String content = "";
        for (String shoppingItem : shoppingList) {
            content += shoppingItem + System.lineSeparator();
        }
        writeShoppingListToFile(content);
    }

    public static void writeShoppingListToFile(String item) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please add the name of the file: ");
        String fileName = scan.nextLine();

        System.out.println("I will save the following list, to the "+fileName+ ".txt file: " + System.lineSeparator() + item);
        try {
            new File("src/resources/savedfiles").mkdirs(); // új mappa létrehozása
            Files.writeString(Paths.get("src/resources/savedfiles/"+ fileName +".txt"), item);
            System.out.println("File saved!");
        } catch (IOException e) {
            System.out.println("Could not save the following file: " + e.getMessage()); //+ az exepction hibaüzetnet
        }

    }


}

