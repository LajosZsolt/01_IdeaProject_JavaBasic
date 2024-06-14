package hu.progmatic;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("Gives the lengths of the three sides of the triangle:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy egész számot:");
        int szamom = scanner.nextInt();

while (szamom <= 20) {
    System.out.print(szamom);
    System.out.print(" ");
    szamom++;
}
        System.out.println("END");
    }

}
