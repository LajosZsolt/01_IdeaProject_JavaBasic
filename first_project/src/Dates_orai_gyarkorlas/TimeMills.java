package Dates_orai_gyarkorlas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimeMills {


    public static void main(String[] args) {
        long milliseconds = System.currentTimeMillis(); // UTC idő GMT+0
        System.out.println(milliseconds + " milliseconds");

        int seconds = (int) (milliseconds / 1000) % 60 ;
        int minutes = (int) ((milliseconds / (1000*60)) % 60);
        int hours   = (int) ((milliseconds / (1000*60*60)) % 24);

        System.out.println(hours + ":" + minutes + ":" + seconds);

       LocalTime date =
                LocalTime.ofInstant(Instant.ofEpochMilli(milliseconds), ZoneId.systemDefault());

        System.out.println(date);


    }


}
