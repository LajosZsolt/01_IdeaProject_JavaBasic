package hu.progmatic.oroklodes.Vehicle;

public class RacingCar extends Vehicle {

    private boolean crossBracing;
    private boolean extinguishingSystem;


    public RacingCar(String manufacturer, String type, String color, int numberOfSeats, boolean selfDriving,
                     boolean crossBracing, boolean extinguishingSystem) {
       super(manufacturer, type, color, numberOfSeats, selfDriving);
    //    super(manufacturer, type);
        this.crossBracing = crossBracing;
        this.extinguishingSystem = extinguishingSystem;
    }

    public boolean getCrossBracing() {
        return crossBracing;
    }

    public boolean getExtinguishingSystem() {
        return extinguishingSystem;
    }

    public void races() {
        System.out.println("The racing car races ...");
    }


}
