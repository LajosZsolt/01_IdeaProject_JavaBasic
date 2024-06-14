package hu.progmatic.task6Booking.Practice;

public class Booking {

    private String name;
    private int phoneNumber;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;

    public Booking(String name2, String checkInDate, String checkOutDate, int numberOfGuests) {
        this.name = name2;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    public Booking(){
    }

    public Booking(String name, String checkInDate){
    }

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    @Override
    public String toString() {
        return "Name= " + name + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Check in date: " + checkInDate + "\n" +
                "Check out date: " + checkOutDate + "\n" +
                "Number of guests: " + numberOfGuests + "\n";
    }
}
