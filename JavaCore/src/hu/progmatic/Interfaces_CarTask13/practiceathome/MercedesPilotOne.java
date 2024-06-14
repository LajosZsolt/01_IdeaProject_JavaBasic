package hu.progmatic.Interfaces_CarTask13.practiceathome;

public class MercedesPilotOne implements Car, Racer{
    private double acceleration;
    private String racerName;
    private String nationality;
    private String manufacurer;


    public MercedesPilotOne(String racerName, String nationality,String manufacurer){
    this.racerName=racerName;
    this.nationality=nationality;
    this.manufacurer=manufacurer;

    }


    @Override
    public void acceleration(double time) {
        acceleration = time;
    }

    @Override
    public String getCarManufacturer() {
        return manufacurer;
    }

    @Override
    public String getRacerName() {
        return racerName;
    }

    @Override
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "MercedesPilotOne{" +
                "acceleration=" + acceleration +
                ", racerName='" + racerName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", manufacurer='" + manufacurer + '\'' +
                '}';
    }
}
