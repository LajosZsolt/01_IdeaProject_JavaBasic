package Dates_orai_gyarkorlas;

import java.time.LocalTime;

public class Time_exercise01 {

    public static void main(String[] args) {


        LocalTime lunchStart = LocalTime.parse("12:00");
        System.out.println("Lunch start at: " + lunchStart);
        LocalTime lunchEnd = LocalTime.of(13, 0);
        System.out.println("Lunch end at: " + lunchEnd + "\n");
        LocalTime now = LocalTime.now();
        System.out.println("Time now: " + now);

        if (!lunchStart.isAfter(now) && now.isBefore(lunchEnd)) {
            System.out.println("Lunch time");
        } else {
            System.out.println("It's not lunch time");
        }


    }
}
