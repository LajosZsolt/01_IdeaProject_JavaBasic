package Task103.PracticeAtHome;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PersonReaderHW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstname = scanner.nextLine();

        System.out.println("Last  name: ");
        String lastname = scanner.nextLine();

        System.out.println("Place of birth: ");
        String placeOfBirt = scanner.nextLine();

        LocalDate dateOfBirth = null;
        try {
            System.out.println("Time of birth (YYYY-MM-DD): ");
            dateOfBirth = LocalDate.parse(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("It is not valid date, use the YYYY-MM-DD format!");
        }

        System.out.println("Favorite movies(separate by ',' ): ");
        String moviesInput = scanner.nextLine();
        List<String> moviesList = Arrays.asList(moviesInput.split(","));

        boolean isHappy;
        System.out.println("Is Happy (Y/N): ");
        String happyInput = scanner.nextLine();
        if (happyInput.equalsIgnoreCase("Y"))
            isHappy = true;
        else
            isHappy = false;

        System.out.println("Height: ");
        int height = Integer.parseInt(scanner.nextLine());


        System.out.println("Weight (optional): ");
        int weight;
        try {
            weight = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            weight = 0;
        }


        System.out.println("Number of Yearly Black Out days: ");
        String blackOutInput = scanner.nextLine();
        int numberOfYearlyBlackOut;
        if (!blackOutInput.equals("")) {
            numberOfYearlyBlackOut = Integer.parseInt(blackOutInput);
        } else {
            numberOfYearlyBlackOut = 0;
        }


            PersonHW inputPersonHW = new PersonHW(firstname, lastname, placeOfBirt, dateOfBirth, moviesList, isHappy, height);

        if (weight != 0) {
            inputPersonHW.setWeight(weight);
        }
        if (numberOfYearlyBlackOut != 0) {
            inputPersonHW.setNumberOfYearlyBlackOut(numberOfYearlyBlackOut);
        }

        System.out.println(inputPersonHW);

    }
}
