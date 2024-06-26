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

public class Task85_exception_UserInput {

    public static void main(String[] args) {
        int result = getNumberFromConsole();
        if (result != 0)
            System.out.println(result);
    }

    public static int getNumberFromConsole() {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        try {
            number = scan.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("You added a string, only number please!");
        }
        return number;
    }
}
