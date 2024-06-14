import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task67_13_Function {

    public static Set<Integer> randomNumbers(int maxValue, int resultSize) {
        Set<Integer> result = new HashSet();
        Random random = new Random();

        while (result.size() != resultSize) {
            result.add(random.nextInt(90) + 1);
        }
        return result;
    }

        public static void main(String[] args){
            Set<Integer> numbers;
//            for (int = i ; i < 100 ; i++) {
//                numbers = randomNumbers;
//                System.out.println(numbers[i]);
//            }
        }
    }