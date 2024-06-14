import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Task94_Calculator_LogSaveToFile {
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
//    A task64 megoldása alapján bővítsétek ki a számológép működését,
//    hogy amit a felhasználó számol és annak eredménye kerüljön elmentésre egy naplófájlként.
//    (calculator.log) néven


    public static void main(String[] args) {
        int num1 = getNumberFromUser();
        String operator = getOperatorFromUser();
        int num2 = getNumberFromUser();
        double result = getCalculationResult(operator, num1, num2);
        showResultToTheUser(result);
        //readResultToFile(result+""); // ez a kevésbé szép megoldás, doubel+üres karakter=String
        readResultToFile(String.valueOf(result));

    }


    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static String getOperatorFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the operator: (+ - * / pumped)");
        String operator = scan.nextLine();
        return operator;
    }

    public static double getCalculationResult(String operator, int number1, int number2) {
        double resoult = 0;
//        if (operator.equals("+")) {
//            resoult = number1 + number2;
//        } else if (operator.equals("-")) {
//            resoult = number1 - number2;
//        } else if (operator.equals("*")) {
//            resoult = number1 * number2;
//        } else if (operator.equals("/")) {
//            resoult = number1 / number2;
//        } else if (operator.equals("pumped")) {
//            resoult = (number1 * number1 * number1 * number2 * number2 * number2);
//        } else {
//            System.out.println("Invalid operator!");
//        }
        switch (operator) {
            case "+" -> resoult = number1 + number2;
            case "-" -> resoult = number1 - number2;
            case "*" -> resoult = number1 * number2;
            case "/" -> resoult = number1 / number2;
            case "pumped" -> resoult = (number1 * number1 * number1 * number2 * number2 * number2);
            default -> System.out.println("Invalid operator, please re-run!");
        }
        return resoult;
    }

    public static void showResultToTheUser(double result) {
        System.out.println("Result = " + result);
    }

    public static void readResultToFile(String log) {
        try {
            Files.writeString(Path.of("src/resources/calculator.log"), log);
        } catch (IOException e) {
            System.out.println("Can not read to the file for some reason. " + e.getMessage());
        }
    }
}

