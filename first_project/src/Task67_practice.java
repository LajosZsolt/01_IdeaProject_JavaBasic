import java.util.*;

public class Task67_practice {


    public static void main(String[] args) {
        Set<Integer> numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Set from 0 - : ");
        int numberOfSet = scanner.nextInt();
        System.out.println("Number of winners from 0 - : ");
        int numberOfWinners = scanner.nextInt();

        int repeat = 10;
        System.out.println("The" + repeat + " set of random numbers: ");
        for (int i = 0; i < repeat; i++) {
            numbers = randomNumbers(numberOfSet,numberOfWinners);
            System.out.println(numbers);
        }
    }

    public static Set<Integer> randomNumbers(int setOfNumber, int numberOfWinner) {
        Set<Integer> result = new HashSet();
        Random random = new Random();

        while (result.size() != numberOfWinner) {
            result.add(random.nextInt(setOfNumber) + 1);
        }
        return result;
    }
}