package hu.progmatic.oroklodes.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle("Honda", "Civic", "Blue", 2,
                false);
        RacingCar racingCar = new RacingCar("Ferrari", "Formula1", "red",
                1, false, true, true);

        AmbulanceCar ambulanceCar = new AmbulanceCar("Mercedes", "Ambulance Type",
                "Yellow", 4, false, "Light and Sound");

        System.out.println("--------Vehicle---------");
    vehicle.accelerate();
    vehicle.horn();
    vehicle.stop();
    vehicle.useTurnSignalSwitch();

        System.out.println("--------Racing Car---------");
    racingCar.accelerate();
    racingCar.horn();
    racingCar.stop();
    racingCar.useTurnSignalSwitch();
    racingCar.races();

        System.out.println("--------Ambulance---------");
    ambulanceCar.accelerate();
    ambulanceCar.horn();
    ambulanceCar.stop();
    ambulanceCar.useTurnSignalSwitch();
    ambulanceCar.sirens();
    ambulanceCar.entersHospital();



    }


}
