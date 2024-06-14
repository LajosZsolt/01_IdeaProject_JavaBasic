package hu.progmatic;

public class Task34_tomb_visszafele {
    public static void main(String[] args) {

        int[] numbers = new int[21];
        int numbersIndex = 0;    // ezt azért kel bevezetni, mert a feladatban
        // nem kell a 0-dik elem, csak 1-től

        for (int i = 1; i <= 21; i++) {
            numbers[numbersIndex] = i;
            numbersIndex++;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Array element: " + numbers[i]);
        }
    }
}


