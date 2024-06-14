package hu.progmatic.task6Booking.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingMain {

    public static void main(String[] args) {

        int bookingCount = Integer.parseInt(args[0]);
        List<Booking> bookingsList = new ArrayList<>();

        for (int i = 0; i < bookingCount; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();

            System.out.println("Please enter your phone number:");
            int phoneNumber;
            try {
                phoneNumber = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                phoneNumber = 0;
            }

            System.out.println("Your check in date:");
            String checkInDate = scanner.nextLine();

            System.out.println("Your check out date:");
            String checkOutDate = scanner.nextLine();

            System.out.println("The number of guests:");
            int numberOfGuests;
            try {
                numberOfGuests = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException ex){
                numberOfGuests = 1;
            }

            Booking booking = new Booking(name, checkInDate, checkOutDate, numberOfGuests);
            bookingsList.add(booking);

            if (phoneNumber != 0)
                booking.setPhoneNumber(phoneNumber);

           // System.out.println(booking);

        }
        System.out.println(bookingsList);
    }
}
