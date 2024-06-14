package hu.progmatic;

public class Task32_parosszamok_100ig {
    public static void main(String[] args) {

        int[] evenNumbers = new int[51];
        //int e = 2;

        for (int i = 1; i < 51; i++) {
            evenNumbers[i] = i + i;
            //e = e + 2;
        }
        System.out.println("List even numbers up to 100: ");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        int[] evenNumbers2 = new int[100];


        for (int d = 0; d < 50; d++) {
            if (d % 2 == 0) {
                evenNumbers2[d] = d;
            }
        }
        System.out.println();

        System.out.println("List even numbers up to 100: ");
        for (int d = 0; d < evenNumbers2.length ; d++) {
            System.out.print(evenNumbers[d] + " ");
        }

    }
}