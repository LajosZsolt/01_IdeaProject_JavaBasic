import java.util.Scanner;

public class Task63_Triangle_WithMethod2_2 {

    public static void main(String[] args) {
        int[] sidesArraysOther = getTriangleDataFromConsole();
        //  boolean result = isTriangleValid(sidesArraysOther[0], sidesArraysOther[1], sidesArraysOther[2]);
        boolean result = isTriangleValid(sidesArraysOther);
        showResultToTheUser(result);
    }

    public static void showResultToTheUser(boolean result) {
        if (result) {
            System.out.println("It is an editable triangle!");
        } else {
            System.out.println("This is not an editable triangle!");
        }
    }
    public static int[] getTriangleDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("aoldal:");
        int aoldal = scanner.nextInt();
        System.out.println("boldal:");
        int boldal = scanner.nextInt();
        System.out.println("coldal:");
        int coldal = scanner.nextInt();
        int[] sidesArrays = {aoldal, boldal, coldal};
//        int[] sidesArrays = new int[3];
//        for(int i = 0; i < 3 ; i++ ){
//            System.out.println("oldal:");
//            int oldal = scanner.nextInt();
//            sidesArrays[i] = oldal;
//        }
        return sidesArrays;
    }

    //public static boolean isTriangleValid(int a, int b, int c) {
    public static boolean isTriangleValid(int[] array) {
        boolean isValid;
        int a = array[0];
        int b = array[1];
        int c = array[2];

        isValid = (a + b) > c &&
                (a + c) > b &&
                (b + c) > a;
        return isValid;
    }
}
