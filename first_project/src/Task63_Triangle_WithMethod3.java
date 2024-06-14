import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task63_Triangle_WithMethod3 {

    public static void main(String[] args) {

        List<Integer> sidesList = getTriangleDataFromConsole();
        boolean result = isTriangleValid(sidesList);
        showResultToTheUser(result);

        showResultToTheUser(isTriangleValid(getTriangleDataFromConsole())); // az elöző három sor egy sorban,
                                                                            // két változót kihagyva.
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {
            System.out.println("It is an editable triangle!");
        } else {
            System.out.println("This is not an editable triangle!");
        }
    }

    public static List<Integer> getTriangleDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aoldal:");
        int aoldal = scanner.nextInt();
        System.out.println("boldal:");
        int boldal = scanner.nextInt();
        System.out.println("coldal:");
        int coldal = scanner.nextInt();

        List<Integer> sidesList = Arrays.asList(aoldal, boldal, coldal); 
       /* List<Integer> sidesList = new ArrayList<>();
        sidesList.add(aoldal);
        sidesList.add(boldal);
        sidesList.add(coldal);
        */
        return sidesList;
    }

    //public static boolean isTriangleValid(int a, int b, int c) {
    public static boolean isTriangleValid(List<Integer> list) {
        boolean isValid;
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);

        isValid = (a + b) > c &&
                (a + c) > b &&
                (b + c) > a;
        return isValid;
    }
}
