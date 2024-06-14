package hu.progmatic;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task41_szamlaosszegzo {
    public static void main(String[] args) {
        System.out.println("Give me the value of your bills and I will add them!");
        Scanner scanner = new Scanner(System.in);
        List<Integer> billsLists = new ArrayList<>();

        System.out.println("Electricity: ");
        int userInput = scanner.nextInt();
        billsLists.add(userInput);

        System.out.println("Gas: ");
        userInput = scanner.nextInt();
        billsLists.add(userInput);

        System.out.println("Water: ");
        userInput = scanner.nextInt();
        billsLists.add(userInput);


        System.out.println("Your bills: " + billsLists);
        int total = 0;
        for (int bill : billsLists) {
            total += bill;
        }

        int totalFor = 0;
        for (int i=0;  i < billsLists.size(); i++) {
            totalFor += billsLists.get(i);
        }

        System.out.println("Your total is: " + total);
        System.out.println("Your total is: " + totalFor);
    }
}