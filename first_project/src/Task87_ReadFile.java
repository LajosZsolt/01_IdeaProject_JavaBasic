import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task87_ReadFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a name to search.");
        String nameToFind = scanner.nextLine();
        List<String> namesList = null;


        try {
            namesList=Files.readAllLines(Path.of("src/resources/names.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("I can't find the file thet you request.");
        }

        if(namesList.contains(nameToFind))
            System.out.println("Hurray I found the name " + nameToFind + " in the list.");
        else
            System.out.println("The name was not in the list!");
        System.out.println();
        System.out.println("File data: " + namesList);


    }
}
