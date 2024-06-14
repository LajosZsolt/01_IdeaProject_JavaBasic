package Task103b;
//Készítsetek programot, mely képes arra, hogy a console-ról Stringként beolvassa az adataitokat
// és letárolja egy Task102_practiceAtHome nevű DOJO osztályban azokat. Minimum keresztnév, vezetéknév,
// születési hely, (String-ként) és születési idő (LocalDate-ként), valamint kedvenc filmek listája
// (List<String>-ként), boldog-e (boolean), testmagasság (int-ként) kerüljön letárolásra private
// osztályváltozók segítségével. Ezen, példányosításkor kötelezően megadandó attribútumok
// pedig konstruktor segítségével kapjanak értéket. E mellett adjatok hozzá legalább
// 2 tetszőleges opcionális attribútumot az osztályhoz, melyet példányosítást követően a setter
// metódusokkal (ha akarunk), be lehet állítani. Készítsetek egy toString metódust is,
// mely visszaadja az összes beállított tulajdonságot, és írassátok ki vele a konzolra a lementett adatokat.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstname;
    private String surname;
    private String placeOfBirth;
    private LocalDate dateOfBirth;
    private List<String> favoriteMovies = new ArrayList<>();
    private boolean isHappy;
    private int height;
    private int weight;
    private int numberOfYearlyBlackOut;

    public Person(String firstname, String surname, String placeOfBirth,
                  LocalDate dateOfBirth, List<String> favoriteMovies, boolean isHappy,
                  int height) {
        this.firstname = firstname;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.favoriteMovies = favoriteMovies;
        this.isHappy = isHappy;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Task102_practiceAtHome{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", favoriteMovies=" + favoriteMovies +
                ", isHappy=" + isHappy +
                ", height=" + height +
                ", weight=" + weight +
                ", numberOfYearlyBlackOut=" + numberOfYearlyBlackOut +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfYearlyBlackOut() {
        return numberOfYearlyBlackOut;
    }

    public void setNumberOfYearlyBlackOut(int numberOfYearlyBlackOut) {
        this.numberOfYearlyBlackOut = numberOfYearlyBlackOut;
    }
}
