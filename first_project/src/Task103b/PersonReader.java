package Task103b;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class PersonReader {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scanner.nextLine();

        System.out.println("Last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Place of birth: ");
        String placeOfBirth = scanner.nextLine();

        System.out.println("Time of birth (YYYY-MM-DD): ");
        String timeOfBirth = scanner.nextLine();

        System.out.println("Favorite movies(separated by ','): ");
        String moviesInput = scanner.nextLine();

        System.out.println("Is Happy(Y/N): ");
        String happyInput = scanner.nextLine();

        System.out.println("Height: ");
        String height = scanner.nextLine();

        System.out.println("Weight(Optional): ");
        String weight = scanner.nextLine();

        System.out.println("Number of Yearly BlackOut (Optional): ");
        String blackOutInput = scanner.nextLine();

        List<String> userInputList = Arrays.asList(firstName, lastName, placeOfBirth, timeOfBirth, moviesInput, happyInput, height);

        System.out.println(userInputList);
    }
//    public static String getUserInputList(List<String> inputs) {
//        return getUserInputList();
//    }
//
}
