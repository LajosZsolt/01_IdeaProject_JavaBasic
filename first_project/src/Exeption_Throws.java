
import java.util.Scanner;

public class Exeption_Throws {

    public static void main(String[] args) {

        int[] exampleArray = {21, 44, 33, 77};


          try {
              int indexFromUser = getUserInput();
          }catch (NumberFormatException ex){
              System.out.println("Hey, you added text instead of number!");
          }

        System.out.println("Thanks for using our service!");
    }

    public static int getUserInput() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        try {
            index = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            System.out.println("Hey, you added text instead of number!");
        }
        return index;
    }
}

