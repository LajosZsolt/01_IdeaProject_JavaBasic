package hu.progmatic;

import java.util.Scanner;

public class Task24_szlogenek {
    public static void main(String[] args) {
// Készítsetek szlogen automatát, amely a felhasználó által beolvasott márkára
// visszaadja a felhasználónak az adott márka szlogenjét.
//switch-case adatszerkezettel oldjátok meg
//induljon újra automatikusan a program mindaddig, amíg a márka helyett
// “exit”-et nem ír a felhasználó
//a szlogen visszaadása után kérdezzük meg a felhasználót, hogy kíváncsi-e új szlogenre.
// Yes/No. Yes esetén mindig újraindul a program, No esetén szép napot kívánunk neki
// és kilépünk.

        boolean rerun = true;

        while (rerun){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a Brand (or type 'exit' to exit): ");
        String brand = scanner.nextLine();

            switch (brand) {
                case "Guiness" -> System.out.println("Guiness, legjobb neked");
                case "Pilsner" -> System.out.println("Az eredeti nehezen felülmulható");
                case "Dreher" -> System.out.println("Annyi a világ, amennyit beletöltesz");
                case "Halls" -> System.out.println("Az orrodat is tisztítja");
                case "Gösser" -> System.out.println("Gut Besser Gösser");
                case "Dunkin Donuts" -> System.out.println("America runs on dunkin");
                case "Nespresso" -> System.out.println("What else");
                case "Opel" -> System.out.println("Sosem kop el");
                case "L'oreal" -> System.out.println("Mert megérdemlem");
                case "Disneyland" -> System.out.println("The happiest place on Earth");
                case "exit" -> System.out.println("Bye bye!");
                default -> System.out.println("Not existing brand. Try a new one!");
            }
            if (brand.equals("exit"))
            rerun = false;
        }
    }
}

