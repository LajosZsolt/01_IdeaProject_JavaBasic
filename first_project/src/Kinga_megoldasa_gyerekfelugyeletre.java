package hu.progmatic;

//Program anyával vagy apával...
import java.util.Random;
import java.util.Scanner;

public class Kinga_megoldasa_gyerekfelugyeletre{
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomProgram = randomGenerator.nextInt(6);
        System.out.println("Írj be egy számot, és megmondom, ki vigyázzon ma a gyerekre!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String dailyProgramMom = "";
        String dailyProgramDad = "";

        switch (randomProgram){
            case 0 -> dailyProgramMom = "Menjük Disneylandbe!";
            case 1 -> dailyProgramDad = "Csináljunk agyagedényt!";
            case 2 -> dailyProgramMom = "Süssünk sütit!";
            case 3 -> dailyProgramDad = "Irány a játszóház!";
            case 4 -> dailyProgramMom = "Fessünk együtt!";
            case 5 -> dailyProgramDad = "Építsünk lego robotot!";
        }

        if (num % 2 == 0){
            System.out.println("Ma apa vigyázz a gyerkőcre! Kalandra fel: " + dailyProgramDad);
        } else System.out.println("Ma anya vigyázz a gyerkőcre! Kalandra fel: " + dailyProgramMom);

    }
}