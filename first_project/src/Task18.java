package hu.progmatic;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
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
        System.out.println("Hi this is a calculator:");
        Scanner scanner = new Scanner(System.in);
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
        }System.out.println(number1 + " " + operator + " " + number2 + " = " + resoult);




    }
}

