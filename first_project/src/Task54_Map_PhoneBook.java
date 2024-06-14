import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task54_Map_PhoneBook {

    public static void main(String[] args) {
        System.out.println("Phonebook");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Long> phoneBook = new HashMap<>();
        String inputName;
        long inputNumber;


        for (int i = 0; i < 5; i++) {
            System.out.println("Adja meg nevet: ");
            inputName = scanner.nextLine();
            System.out.println("Adja meg a telefonszámot: ");
            inputNumber = Long.parseLong(scanner.nextLine());

            if (phoneBook.containsKey(inputName))
            System.out.println("A telefonszám módosítva lett!");

            if (phoneBook.containsValue(inputNumber))
            System.out.println("A telefonszám már rögzítve van egy névhez!");

            phoneBook.put(inputName, inputNumber);

        }
        System.out.println(phoneBook);
        for (Map.Entry mapElement : phoneBook.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
        }

        // while ciklussal
//        int counter = 0;
//
//        do {
//            System.out.println("Adja meg nevet: ");
//            inputName = scanner.nextLine();
//
//            System.out.println("Adja meg a telefonszámot: ");
//            inputNumber = Long.parseLong(scanner.nextLine());
//            phoneBook.put(inputName, inputNumber);
//            counter++;
//        } while (counter < 5); // vagy változó nélkül a (phoneBook.size() < 5)
//
//        System.out.println(phoneBook);
//        for (Map.Entry mapElement : phoneBook.entrySet()) {
//            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
//        }
    }
}