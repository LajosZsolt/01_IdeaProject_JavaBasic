package Task103.PracticeAtHome;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonHW {

    private String firstname;
    private String lastname;
    private String placeOfBirth;
    private LocalDate dateOfBirth;
    private List<String> moviesList = new ArrayList<>();
    private boolean isHappy;
    private int height;
    private int weight;
    private int numberOfYearlyBlackOut;

    public PersonHW(String firstname, String lastname, String placeOfBirth, LocalDate dateOfBirth,
                    List<String> moviesList, boolean isHappy, int height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.placeOfBirth = placeOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.moviesList = moviesList;
        this.isHappy = isHappy;
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumberOfYearlyBlackOut(int numberOfYearlyBlackOut) {
        this.numberOfYearlyBlackOut = numberOfYearlyBlackOut;
    }

    @Override
    public String toString() {
        return "PersonHW{" +
                "firstname='" + firstname + '\'' +
                ", lastdname='" + lastname + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", moviesList=" + moviesList +
                ", isHappy=" + isHappy +
                ", height=" + height +
                ", weight=" + weight +
                ", numberOfYearlyBlackOut=" + numberOfYearlyBlackOut +
                '}';
    }
}
