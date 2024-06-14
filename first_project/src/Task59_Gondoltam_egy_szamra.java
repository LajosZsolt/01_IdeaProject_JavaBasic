import java.util.Random;
import java.util.Scanner;

public class Task59_Gondoltam_egy_szamra {
    public static void main(String[] args) {
        int computerNumber;
        boolean cont = true;

        while (cont) {
            Random random = new Random();
            computerNumber = random.nextInt(10) + 1;
            System.out.println(computerNumber);
            byte rounds = 1;
            boolean founded = false;
            System.out.println("Számkitaláló!");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Tippelj, egy számot 1-10 között, 5 lehetőséged van!");
            while (!founded && rounds <= 6) {
                byte userInput = scanner.nextByte();
                rounds++;
                if (userInput == computerNumber) {
                    founded = true;
                    System.out.println("Gratulálok kitaláltad ( " + (rounds - 1) + ". próbálkozásra, a ) " + userInput + "-ra gondoltam");
                } else if (userInput <= 0 || userInput > 10) {
                    System.out.println("Tippelj újra, csak 1-10 közötti számot adhatsz meg!");
                    rounds--;
                } else if (rounds == 6) {
                    System.out.println("Sajnálom ez volt az 5-dik prógálkozásod nem sikerült, én a(z) " + computerNumber + "-ra gondoltam, ennek a fordulónak vége!");
                    founded = true;
                } else {
                    System.out.println("Nem talált, tippelj úrjra most jön a " + rounds + ". próbálkozásod az 5-ből");
                }
            }
            System.out.println("Szeretne egy újabb játékot? (Y/N)?");
            scanner.nextLine();
            String userCont = scanner.nextLine();
            if (userCont.equals("Y")) {
                cont = true;
            } else {
                System.out.println("Köszönöm a játékot, viszlát!");
                cont = false;
            }
        }
    }
}
