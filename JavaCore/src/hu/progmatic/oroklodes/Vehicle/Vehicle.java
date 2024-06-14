package hu.progmatic.oroklodes.Vehicle;

/**
 * (Órai)Készítsétek el az alábbi, együtt elkészített diagramon láthatszó
 * osztályhierarchiát. A metódusokat is tartalmazzák az osztályok, de elég
 * akár egy System.out.println() utasítást megvalósítaniuk, amely kiírja a
 * konzolra hogy éppen mi az adott tevékenység. Pl.: dudálás() metódus kiírja,
 * hogy “A versenyautó dudál”.
 */
public class Vehicle {

    private String manufacturer;
    private String type;
    private String color;
    private int numberOfSeats;
    private boolean selfDriving;

    public Vehicle(String manufacturer, String type, String color, int numberOfSeats, boolean selfDriving) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.selfDriving = selfDriving;
    }


    public Vehicle(String manufacturer, String type) {  // lehet igy szűkítve is megalkotni a járművet
        this.manufacturer = manufacturer;               // az ősosztályban, és ha ezt hívjuk a gyerek
        this.type = type;                               // osztályban akkor csak ez a 2 konstruktort kell hívni.
    }

    public Vehicle(){}




        public void accelerate () {
            System.out.println("This vehicle accelerates...");
        }

        public void stop () {
            System.out.println("This vehicle can stop...");
        }

        public void horn () {
            System.out.println("This vehicle can horn...");
        }

        public void useTurnSignalSwitch () {
            System.out.println("This vehicle has turn signal switch ...");
        }



        public String getManufacturer () {
            return manufacturer;
        }

        public String getType () {
            return type;
        }

        public String getColor () {
            return color;
        }

        public int getNumberOfSeats () {
            return numberOfSeats;
        }

        public boolean getSelfDriving () {
            return selfDriving;
        }
    }
