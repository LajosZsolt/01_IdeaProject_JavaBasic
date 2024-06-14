package Dates_orai_gyarkorlas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task102_Csaba {

    public static void main(String[] args) {


        LocalDateTime birthDay = LocalDateTime.parse("1975-10-30T03:00");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime birthDayOtherYears = LocalDateTime.of(2023, birthDay.getMonth(),
                birthDay.getDayOfMonth(), birthDay.getHour(), birthDay.getMinute());
        System.out.println(birthDayOtherYears);


        for (int i = 1; i < 6; i++) {
            System.out.println(birthDayOtherYears.getDayOfWeek());
            birthDayOtherYears = birthDayOtherYears.plusYears(i);
        }
    }
}