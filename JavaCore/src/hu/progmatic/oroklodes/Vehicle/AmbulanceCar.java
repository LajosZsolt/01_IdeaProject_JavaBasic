package hu.progmatic.oroklodes.Vehicle;

public class AmbulanceCar extends Vehicle {
    private String distinctiveSign;


    public AmbulanceCar(String manufacturer, String type, String color,
                        int numberOfSeats, boolean selfDriving, String distinctiveSign) {
        super(manufacturer, type, color, numberOfSeats, selfDriving);
        this.distinctiveSign = distinctiveSign;
    }

    public String getDistinctiveSign() {
        return distinctiveSign;
    }

    public void sirens(){
        System.out.println("The ambulance sierns....");
    }

    public void entersHospital(){
        System.out.println("The Ambulance cars enters into the hospital. ");
    }
}
