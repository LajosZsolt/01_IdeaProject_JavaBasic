package Dates_orai_gyarkorlas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_exercixe03 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);





    }
}
