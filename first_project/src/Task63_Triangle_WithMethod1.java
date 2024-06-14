import java.util.Scanner;

public class Task63_Triangle_WithMethod1 {
    static int aoldal = 0;
    static int boldal = 0;
    static int coldal = 0;

    public static void main(String[] args) {
        getTriangleDataFromConsole();
        boolean result = isTriangleValid(aoldal, boldal, coldal);
        showResultToTheUser(result);
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {
            System.out.println("It is an editable triangle!");
        } else {
            System.out.println("This is not an editable triangle!");
        }
    }

    public static void getTriangleDataFromConsole( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aoldal:");
        aoldal = scanner.nextInt();
        System.out.println("boldal:");
        boldal = scanner.nextInt();
        System.out.println("coldal:");
        coldal = scanner.nextInt();
    }

    public static boolean isTriangleValid(int a, int b, int c) {
            boolean isValid;
            isValid = (a + b) > c &&
                    (a + c) > b &&
                    (b + c) > a;
            return isValid;
    }
}
