package hu.progmatic;

//Program anyával vagy apával...
import java.util.Random;
import java.util.Scanner;

public class Zsuzsi_megoldasa_gyerekfelugyeletre {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int anyaVagyApa = randomGenerator.nextInt(2);

        String melyikSzulo =
                switch (anyaVagyApa) {
                    case 0 -> "Anya";
                    case 1 -> "Apa";
                    default -> "Egyikkel sem";
                };

        String mitCsinalunk = "";

        if (melyikSzulo.equals("Anya")) {
            int tevekenyseg = randomGenerator.nextInt(3);
            switch (tevekenyseg) {
                case 0 -> mitCsinalunk = "Palacsintát sütünk.";
                case 1 -> mitCsinalunk = "Gyurmázunk.";
                case 2 -> mitCsinalunk = "Énekelünk";
            }
        } else {
            int tevekenyseg = randomGenerator.nextInt(3);
            switch (tevekenyseg) {
                case 0 -> mitCsinalunk = "Vonatokat nézünk.";
                case 1 -> mitCsinalunk = "Játszótérre megyünk.";
                case 2 -> mitCsinalunk = "Focizunk.";
            }
        }
        System.out.println("Ezzel a szülővel leszel: " + melyikSzulo);
        System.out.println("És ez lesz a program: " + mitCsinalunk);
    }
}
