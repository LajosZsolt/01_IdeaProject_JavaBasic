import java.util.Scanner;

public class Task63_Triangle_WithMethod2 {

    public static void main(String[] args) {
        int sidea = getTriangleDataFromConsole();
        int sideb = getTriangleDataFromConsole();
        int sidec = getTriangleDataFromConsole();
        boolean result = isTriangleValid(sidea,sideb,sidec);
        showResultToTheUser(result);
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {
            System.out.println("It is an editable triangle!");
        } else {
            System.out.println("This is not an editable triangle!");
        }
    }

    public static int getTriangleDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("one side:");
        int oldal = scanner.nextInt();
        return oldal;
    }

    public static boolean isTriangleValid(int a, int b, int c) {
        boolean isValid;
        isValid = (a + b) > c &&
                (a + c) > b &&
                (b + c) > a;
        return isValid;
    }
}
