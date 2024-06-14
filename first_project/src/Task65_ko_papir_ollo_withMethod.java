import java.util.Random;
import java.util.Scanner;

public class Task65_ko_papir_ollo_withMethod {

    public static void main(String[] args) {
// (Órai) Írjunk kő-papír-olló játékot. A program minden indítás után válasszon
// egy random eszközt, majd vesse össze a felhasználó által megadott eszközzel.
// Miután kiértékelte, hogy ki nyert írja ki, hogy mi volt nála és hogy ki nyerte
// a játékot. Figyeljünk rá, hogy a játékos csak a kő, papír, olló eszközöket választhassa.
// Ellenkező esetben írjunk ki egy figyelmeztető üzenetet.

        String userHand = getUserHandValueFromConsole();
        int randomNumber = getRandomNumber();
        String computerHand = getRandomComputerHand(randomNumber);
        fight(userHand, computerHand);
    }

    public static String getUserHandValueFromConsole() {
        String userHand;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess one! Rock / Paper / Scissors: ");
        userHand = scanner.nextLine();
        if (!userHand.equalsIgnoreCase("Rock") &&
                !userHand.equalsIgnoreCase("Paper") &&
                !userHand.equalsIgnoreCase("Scissors")) {
            return "Invalid input!";
        } else {
            return userHand;
        }
    }

    public static int getRandomNumber() {
        Random random = new Random();
        int randomNumberInMethod = random.nextInt(3);
        return randomNumberInMethod;
    }

    public static String getRandomComputerHand(int computerGuess) {
        String computerHandInMethod;
//        Random randomGenerator = new Random();
//        int computerGuess = randomGenerator.nextInt(3);
        switch (computerGuess) {
            case 0 -> computerHandInMethod = "Rock";
            case 1 -> computerHandInMethod = "Paper";
            case 2 -> computerHandInMethod = "Scissors";
            default -> computerHandInMethod = "Invalid";
        }
        //System.out.println("Computer guess: " + computerHand);  //csak ellenőrzésre
        return computerHandInMethod;
    }

    public static void fight(String userHand, String computerHand) {
        if (userHand.equals("Invalid input!")) {
            System.out.println(userHand);
        } else if (userHand.equalsIgnoreCase(computerHand)) {
            System.out.println("Computer guess: " + computerHand);
            System.out.println("Draw !");
        } else if ((userHand.equalsIgnoreCase("Rock") && computerHand.equals("Scissors")) ||
                (userHand.equalsIgnoreCase("Paper") && computerHand.equals("Rock")) ||
                (userHand.equalsIgnoreCase("Scissors") && computerHand.equals("Paper"))) {
            System.out.println("Computer guess: " + computerHand);
            System.out.println("You win !");
        } else {
            System.out.println("Computer guess: " + computerHand);
            System.out.println("Computer win !");
        }
    }
}

