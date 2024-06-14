package Dates_orai_gyarkorlas;

import java.time.LocalDate;
import java.util.Scanner;

public class Task102_practiceAtHome_v2 {

    public static void main(String[] args) {

        LocalDate birthday;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add your birthday (YYYY-MM-DD), " +
                "I will tell you what days it will fall on in the next 5 years.");
        birthday = LocalDate.parse(scanner.nextLine());
        System.out.println("Your birthday " + birthday + " , was on " + birthday.getDayOfWeek());
        LocalDate birthdaynow = LocalDate.of(LocalDate.now().getYear(), birthday.getMonth(), birthday.getDayOfMonth());
        System.out.print(birthdaynow);
        System.out.println(" - " + birthdaynow.getDayOfWeek());


        for (int i = 1; i < 6 ; i++){
            System.out.print(2023+i + " - ");
            System.out.println(birthdaynow.plusYears(i).getDayOfWeek());
        }

    }
}
