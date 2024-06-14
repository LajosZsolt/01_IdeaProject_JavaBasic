package hu.progmatic;

public class Task35_valid_age {
    public static void main(String[] args) {

        int[] numbers = {5, -3, 0, 21, 55, 18, 32, 255, 42};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] <= 120) {
                System.out.println(numbers[i]);
            }
        }
    }
}

