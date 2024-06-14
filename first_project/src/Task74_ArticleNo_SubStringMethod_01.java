import java.util.Scanner;

public class Task74_ArticleNo_SubStringMethod_01 {
//Írjunk programot, amely a beolvasott cikkszám (fixen 6 karakter hosszú),
// majd közvetlen utána lévő darabszám beviteli értéket fel tudja dolgozni,
// és össze tudja adni őket, hogy összesen hány termék van.
// Figyelünk oda, hogy 0-s darabszám nem lehet, illetve az egyszerűség kedvéért
// maximum 9 lehet a darabszám. Egy példa tétel: 1376367

    public static void main(String[] args) {
        System.out.println("Total count: " + getTotalCount());
    }

    public static int getTotalCount(){
        Scanner scanner = new Scanner(System.in);
        String input;
        int result = 0;
        do {
            System.out.println("Add the id with count: (7 length) and you can stop with 'X'");
            input = scanner.nextLine();
            if (!input.equalsIgnoreCase("X")) {
                String countAsString = input.substring(6);
                int countAsInt = Integer.parseInt(countAsString);
                if (countAsInt == 0) {
                    System.out.println("Count is 0!");
                } else {
                    result = result + countAsInt;
                    System.out.println(countAsInt);
                }
            }
        }while (!input.equalsIgnoreCase("X")) ;
        return result;
    }
}
