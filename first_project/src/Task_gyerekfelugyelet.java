
import java.util.Random;

public class Task_gyerekfelugyelet {
    public static void main(String[] args) {
        System.out.println("What is your program today?");
        String chooseParent = null;
        Random randomGenerator = new Random();
        int computerChoose = randomGenerator.nextInt(2);
        switch (computerChoose) {
            case 0 -> chooseParent = "Mother";
            case 1 -> chooseParent = "Father";
        }
        String motherProgram = null;
        int randomProgram2 = randomGenerator.nextInt(2);
        switch (randomProgram2) {
            case 0 -> motherProgram = "Shopping with ";
            case 1 -> motherProgram = "Cooking with ";
        }
        String fatherProgram = null;
        int randomProgram3 = randomGenerator.nextInt(2);
        switch (randomProgram3) {
            case 0 -> fatherProgram = "Repair anythings with ";
            case 1 -> fatherProgram = "Play LEGO with ";
        }
        System.out.println("You are lucky, you will be together with your: " + chooseParent);
        if (chooseParent.equals("Mother")) {
            System.out.println(motherProgram + chooseParent);
        } else if (chooseParent.equals("Father")) {
            System.out.println(fatherProgram + chooseParent);
        } else {
            System.out.println("You are free!!!");
        }
    }
}

