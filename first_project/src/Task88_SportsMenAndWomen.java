import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Task88_SportsMenAndWomen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a name to search the sportsperson:");
        String nameToFind = scanner.nextLine();
        List<String> sportspersonNamesList = null;


        try {
            sportspersonNamesList=Files.readAllLines(Path.of("src/resources/sportsMenAndWomen.txt"));
        } catch (IOException e) {
           // e.printStackTrace();
            System.out.println("I can't find the file you request.");
        }
        try {
            if (sportspersonNamesList.contains(args[0]))
                //(sportspersonNamesList.contains(nameToFind))
                System.out.println("It’s in the file");
            else
                System.out.println("No luck");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("There is no program arguments added.");
           // e.printStackTrace();
        }
        System.out.println();
        System.out.println("The list: " + sportspersonNamesList);

    }
}
