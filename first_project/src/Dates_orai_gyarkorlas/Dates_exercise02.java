package Dates_orai_gyarkorlas;

import java.time.LocalDate;

public class Dates_exercise02 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1992-05-22");
        System.out.println("1992-05-22 was " + date.getDayOfWeek() + " " + date.getDayOfMonth() +" "+ date.getMonthValue());
        LocalDate date2 = LocalDate.of(1996, 5, 15);
        System.out.println("1996-05-15 was " + date2.getDayOfWeek());


    }



}
