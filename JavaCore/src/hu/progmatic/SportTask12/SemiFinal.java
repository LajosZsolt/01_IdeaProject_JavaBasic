package hu.progmatic.SportTask12;

public class SemiFinal implements Events, Sports {
    private String location;
    private String eventName;
    private String awayTeam;
    private String homeTeam;
    private String sportType;

    public SemiFinal(String location, String sportType
    ,String eventName) {
        this.location = location;
        this.sportType = sportType;
    }

    @Override
    public void setEventName() {
      //  eventName = "WorldCup semi final";
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setHomeTeam(String name) {
        homeTeam=name;
    }

    @Override
    public void setAwayTeam(String name) {
        awayTeam=name;
    }

    @Override
    public String getSportType() {
        sportType = "Football";
        return sportType;
    }

    @Override
    public String toString() {
        return "SemiFinal{" +
                "location='" + location + '\'' +
                ", eventName='" + eventName + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
