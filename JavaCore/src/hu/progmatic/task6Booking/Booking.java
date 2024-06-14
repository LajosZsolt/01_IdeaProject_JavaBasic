/**
 * Hotel nyilvántartás. A nyilvántartás képes a vendég adatokat beolvasni
 * és letárolni, majd megjeleníteni őket. Kötelezően tárolja milyen
 * névre szólt a foglalás, az érkezés és a távozás időpontját valamint,
 * hogy hány főre foglaltak szállást. Opcionálisan pedig lehessen letárolni
 * a foglaláshoz tartozó telefonszámot. Legyen limitálva,
 * hogy hány foglalást tud kezelni a program.
 Hozz létre egy Booking osztályt, amely tartalmazza a foglalás adatait.
 Írj metódusokat az osztály változók értékeinek megadására illetve
 lekérdezésére. Ezen felül hasznos lehet egy toString metódus a
 letárolt adatainak a megjelenítésére.
*/

 package hu.progmatic.task6Booking;

public class Booking {
    private String name;
    private int phoneNumber;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;

    public Booking(String name, String checkInDate, String checkOutDate, int numberOfGuests) {
        this.name = name;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                "\nPhoneNumber: " + phoneNumber +
                "\nCheck In Date: " + checkInDate +
                "\nCheck Out Date: " + checkOutDate +
                "\nNumber Of Guests: " + numberOfGuests + "\n";
                }
}
