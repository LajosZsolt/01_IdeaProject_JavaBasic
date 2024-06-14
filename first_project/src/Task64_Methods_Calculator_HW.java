import java.util.Scanner;

public class Task64_Methods_Calculator_HW {
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
    public static void main(String[] args) {
        System.out.println("Hi this is a calculator, give me two numbers, and an operator.");
        double numa = getNumberFromUser2();
        String operator2 = getOperatorFromUser2();
        double numb = getNumberFromUser2();
//        double result2 = getCalculationResult2(operator2, numa, numb);
//        showResultToTheUser2(result2);
        showResultToTheUser2(getCalculationResult2(operator2, numa, numb));
    }
    public static double getNumberFromUser2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double cica = scanner.nextDouble();
        return cica;
    }
    public static String getOperatorFromUser2() {
        System.out.println("\"Enter the signal of the requested calculation operation(+ - / pumped): ");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        return operator;
    }

    public static double getCalculationResult2(String nyar, double virag, double mehecske) {
        double finomMez = 0;
        switch (nyar) {
            case "+" -> finomMez = virag + mehecske;
            case "-" -> finomMez = virag - mehecske;
            case "*" -> finomMez = virag * mehecske;
            case "/" -> finomMez = virag / mehecske;
            case "pumped" -> finomMez = (virag * virag * virag * mehecske * mehecske * mehecske);
            default -> System.out.println("Invalid operator, please re-run!");
        }
        return finomMez;
    }

    public static void showResultToTheUser2(double akarmi) {
        System.out.println("The result is: " + akarmi);
    }

}