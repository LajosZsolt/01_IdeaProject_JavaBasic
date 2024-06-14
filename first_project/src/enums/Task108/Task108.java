package enums.Task108;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * (Órai) Készítsünk egy alkalmazást, mely az aktuális napról eldönti, hogy az italos nap-e vagy sem.
 * A napok vizsgálatához használjunk switch-case-t.
 */
public class Task108 {


    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        DayOfWeek actualDay = now.getDayOfWeek();


        switch (actualDay) {
            case MONDAY, TUESDAY, WEDNESDAY, SUNDAY -> System.out.println(CanWeDrink.NOLUCK + ":)");
            default -> System.out.println("Yeah " + CanWeDrink.DRINKDAY);
        }


    }

    enum CanWeDrink {
        NOLUCK, DRINKDAY
    }


}
