package Dates_orai_gyarkorlas;
//Készítsetek egy alkalmazást, amely a konzolról bekért dátumot leellenőrzi és
// ha érvényes, valid dátum akkor írj ki hogy “Valid datetime.”,
// egyébként pedig hogy “Invalid datetime.”

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task101 {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a date: ");
        String inputDate = scanner.nextLine();



        try {
            LocalDateTime date = LocalDateTime.parse(inputDate);
            System.out.println("OK valid datetime!");
        }catch (DateTimeParseException dateTimeParseException ){
            System.out.println("No, it is not a valid datetime");
        }




    }
}
