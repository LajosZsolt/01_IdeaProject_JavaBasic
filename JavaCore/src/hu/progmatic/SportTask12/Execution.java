package hu.progmatic.SportTask12;

public class Execution {

    public static void main(String[] args) {
        SemiFinal semiFinal = new SemiFinal("Katar","Football", "WorldCup semifinal");
        semiFinal.setEventName();
        semiFinal.setHomeTeam("Franciaország");
        semiFinal.setAwayTeam("Marokko");

        System.out.println(semiFinal);


    }
}
