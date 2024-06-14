import java.util.InputMismatchException;
import java.util.Scanner;

/* Készítsetek egy metódust (getNumberFromConsole()), amely beolvas egy számot a konzolról,
        a nextInt() metódus segítségével. Próbáljátok ki milyen exception érkezik,
        ha futtatáskor szám helyett valami szöveget írtuk. Ha megvan az exception neve,
a/ akkor írjatok rá egy try-catch blokkot amely-ben elkapjátok ezt az exceptiont
        és kiírjátok a konzolra az alábbi üzenetet: “You added a string, only number please!”
b/ Dobjátok tovább a metódusban keletkező lehetséges exceptiont, és a hívás helyén a main-ben kapjátok el
c/(extra) mindaddig kérjen be a felhasználótól adatot, amíg számot nem ad.
*/

public class Task85_exception_UserInput_Method {


    public static void main(String[] args) {
        boolean again = false;
        do {
            try {
                again = false;
                System.out.println("ez az exception előtt fut le.");
                int result = getNumberFromConsole();
                System.out.println("ez akkor fut le, ha nincs exception.");
                if (result != 0)
                    System.out.println(result);
            } catch (InputMismatchException exception) {
                again = true;
                System.out.println("You added a string, only number please!");
            }finally {
                System.out.println("ez mindig lefut, akár try akár catch");
            }

        } while (again);
    }


    public static int getNumberFromConsole() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number (exept of 0): ");
        int number = 0;
        number = (scanner.nextInt());
        return number;
    }
}
