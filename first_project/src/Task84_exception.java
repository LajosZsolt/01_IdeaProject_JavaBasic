
import java.util.Scanner;
//(Órai) Készítsünk programot, amely kiírja a “There is no program arguments.”
// ha nem talál hozzáadott program argumenteket. Készítsünk egy metódust
// printArgConsole()), amelyik kiírja az első paraméter tartalmát a konzolra.
//Kapjuk el a lehetséges keletkező exceptiont a metódusban
//Dobjuk tovább a lehetséges exceptiont és kapjuk el azt a main metódusban
public class Task84_exception {

    public static void main(String[] args) {
        printArgConsole(args);
    }

    public static void printArgConsole(String[] args){
        try {
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("There is no program arguments.");
        }
    }
}
