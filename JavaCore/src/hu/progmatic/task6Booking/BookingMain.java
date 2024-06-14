package hu.progmatic.task6Booking;

import java.util.*;

public class BookingMain {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        //Lista adatszerkezet
        List<Booking> bookings = new ArrayList<>();
        //booking objektum és Integer azonosító a foglaláshoz
        Map<Integer, Booking> bookingMap = new HashMap<>();

        Set<Booking> bookingSet = new HashSet<>();

        Booking[] bookingArray = new Booking[2];


        //int bookingCount = Integer.parseInt(args[0]);
        //System.out.println("bookingCount= " + bookingCount);


        for (int i = 0; i < 2; i++) {

            System.out.println("Please enter your name:");
            String name = scn.nextLine();
            System.out.println("Please enter your phone number:");

            int phone;

            try {
                phone = Integer.parseInt(scn.nextLine());
            } catch (NumberFormatException ex) {
                phone = 0;
            }

            System.out.println("Please enter your check in Date:");
            String checkInDate = scn.nextLine();
            System.out.println("Please enter your check out Date:");
            String checkOutDate = scn.nextLine();
            System.out.println("Please enter the number of guest!");
            int numberOfGuests = Integer.parseInt(scn.nextLine());


            Booking booking = new Booking(name, checkInDate, checkOutDate, numberOfGuests);
            bookings.add(booking);
            bookingMap.put(i, booking);
            bookingSet.add(booking);
            bookingArray[i] = booking;

            if (phone != 0)
                booking.setPhoneNumber(phone);

            System.out.println(booking);
        }
        System.out.println("-----------Lista--------------");
        for (int i = 0; i < bookings.size(); i++) {
            System.out.println(bookings.get(i));
        }
        System.out.println("-----------MAP--------------");
        System.out.println(bookingMap.get(0));
        System.out.println(bookingMap.get(1));


        System.out.println("-----------Set--------------");
        for (Booking b : bookingSet) {
            System.out.println(b);
        }
        System.out.println("-----------Array--------------");
        System.out.println(bookingArray[0]);
        System.out.println(bookingArray[1]);

        System.out.println("-----------Equals--------------");
        //az azonos értékű atributumok ellenőrzése, két objektum nem lehet azonos!!!
        System.out.println(bookingArray[0] == bookingArray[1]);
        System.out.println(bookingArray[0].equals(bookingArray[1]));

    }
}