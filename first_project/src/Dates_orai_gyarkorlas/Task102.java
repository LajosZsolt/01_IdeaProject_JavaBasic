package Dates_orai_gyarkorlas;

import java.time.LocalDateTime;

public class Task102 {

    public static void main(String[] args) {

        LocalDateTime myBirthday = LocalDateTime.of(1975, 10, 30, 03, 00);
        //System.out.println(myBirthday);
        for (int i = 1; i < 6; i++) {
            System.out.println(myBirthday.plusYears(47+i));

        }
    }
}
