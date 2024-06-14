package Dates_orai_gyarkorlas;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Dates_exercise01 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();    // az akutális dátumot lementem egy változóba
        System.out.println(now);

        LocalDate firstDayOfThisYear = now.withDayOfYear(1);
        System.out.println(firstDayOfThisYear);
        System.out.println("Ez a 41.-dik nap a naptárban " + now.withDayOfYear(41)); // mely dátumra esik a ()-an lévő indexű nap


        DayOfWeek dayOfWeek = firstDayOfThisYear.getDayOfWeek();

        System.out.println("First day of this year: " + dayOfWeek);
        System.out.println("First day of next year: " + now.plusYears(1).withDayOfYear(1).getDayOfWeek());


        System.out.println("Dátum 5 nap múlva: " + now.plusDays(5) + " ami " + now.getDayOfWeek() + " nap");




    }



}
