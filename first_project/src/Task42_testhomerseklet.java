package hu.progmatic;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task42_testhomerseklet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> bodyTemperatureList = new ArrayList<>();
        double summOfData = 0;
        int feverDays = 0;
        System.out.println("How many days did you recorded your temperature: ");
        int daysInputNumber = scanner.nextInt();
        System.out.println("How many time did you recorded your temperature a day:");
        int timesInputADay = scanner.nextInt();
        int timesOfRecordedData = timesInputADay * daysInputNumber;

        for (int i = 1; i <= timesOfRecordedData; i++) {
            System.out.println("Add your temperature in the last " + daysInputNumber + " days (" + timesInputADay + " times every day) press ENTER (already recorded: " + bodyTemperatureList.size() + ". temp data.)");
            Double tempInput = scanner.nextDouble();
            if (tempInput < 35.1 || tempInput > 42) {
                System.out.println("Wrong data, give me another one");
                i--;
            } else {
                bodyTemperatureList.add(tempInput);
                summOfData += tempInput;
                if (tempInput >= 38.0)
                    feverDays++;
            }
        }
        System.out.println("List saved!");
        System.out.println();
        System.out.println("Your avarage body temperature: " + (summOfData / bodyTemperatureList.size()));
        System.out.println("You have fever: " + feverDays + " times in the last " + daysInputNumber + " days!");
        System.out.println(bodyTemperatureList);
    }
}