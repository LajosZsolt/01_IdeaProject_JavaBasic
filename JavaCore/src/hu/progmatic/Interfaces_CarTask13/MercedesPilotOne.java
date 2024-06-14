package hu.progmatic.Interfaces_CarTask13;

public class MercedesPilotOne implements Car, Race {
    private double acceleration;
    private String name;
    private String nationlity;
    private String manufacturer;

    MercedesPilotOne(String name, String nationlity, String manufacturer) {
        this.manufacturer = manufacturer;
        this.nationlity = nationlity;
        this.name = name;
    }


    @Override
    public void acceleration(double time) {
        acceleration = time;

    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getRacerName() {
        return name;
    }

    @Override
    public String getNationality() {
        return nationlity;
    }

    @Override
    public String toString() {
        return "MercedesPilotOne{" +
                "acceleration=" + acceleration +
                ", name='" + name + '\'' +
                ", nationlity='" + nationlity + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
