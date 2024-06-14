package hu.progmatic;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task40_hazibuli_vendelista {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> guestList = new ArrayList<>();


        for (int i = 1; i <= 11; i++) {
            System.out.print("Add your 11 guests and press ENTER ");
            System.out.println("(already invited " + guestList.size() +" persons): ");
            String userInput = scanner.nextLine();
            if (guestList.contains(userInput)) {
                System.out.println("This name is already on the list, give me another one");
                i--;
            } else {
                guestList.add(userInput);
            }
        }
            System.out.println("List saved: ");
            for (String guest : guestList) {
                System.out.print(guest + " ");
            }

    }
}