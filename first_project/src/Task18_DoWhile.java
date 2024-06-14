package hu.progmatic;

import java.time.Year;
import java.util.Scanner;
// Készítsetek programot, amely a program indításakor bekér két számot,
// valamint egy operátort. Majd írja ki konzolra a végeredményt.
// A számológép tudjon összeadni, kivonni, szorozni, osztani.
// A megoldást töltsétek fel a progmaticjrta group alatti repository-tokba.
//Opcionális: “pumpedelni”, ami a számok köbének szorzata.
//Opcionális2: miután kiírta az eredményt kérdezze meg,
// hogy a felhasználó szeretne-e további számításokat végezni.
// Y/N-val, (azaz Yes/No-val) lehet válaszolni. Y esetén természetesen
// újraindul a fenti folyamat. N esetén pedig az illedelmes számológép megköszöni,
// hogy szolgálhatta felhasználóját. Dobókocka algoritmus

public class Task18_DoWhile {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Scanner rerun = new Scanner(System.in);
        String decision = "Y";

        do {
            System.out.println("Hi this is a calculator:");

            System.out.println("Enter the 1 st number: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter the 2nd number:: ");
            int number2 = scanner.nextInt();
            System.out.println("Enter the signal of the requested calculation operation(+ - / pumped): ");
            Scanner scanner2 = new Scanner(System.in);
            String operator = scanner2.nextLine();
            int resoult = 0;
            if (operator.equals("+")) {
                resoult = number1 + number2;
            } else if (operator.equals("-")) {
                resoult = number1 - number2;
            } else if (operator.equals("*")) {
                resoult = number1 * number2;
            } else if (operator.equals("/")) {
                resoult = number1 / number2;
            } else if (operator.equals("pumped")) {
                resoult = (number1 * number1 * number1 * number2 * number2 * number2);
            } else {
                System.out.println("Invalid operator!");
            }
            System.out.println(number1 + " " + operator + " " + number2 + " = " + resoult);
            System.out.println();

            System.out.println("Press Y to continue!");

        } while (decision.equals("Y"));
        System.out.println("Bye Bye ...");
    }
}

