package Dates_orai_gyarkorlas;
//Készítsetek egy programot amely kiírja az aktuális napot
// és még 10 darab napot, melyek az ezt követő hónapban vannak.
// (Tehát minden egyes kiírt nap pontosan egy hónappal későbbi
// az előző dátumnál)


import java.time.LocalDate;

public class Task98_ {

    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        for (int i = 1; i <= 10; i++) {
            System.out.println(dateNow.plusMonths(i));
        }
    }
}
