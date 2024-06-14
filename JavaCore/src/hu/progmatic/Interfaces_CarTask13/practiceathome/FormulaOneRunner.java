package hu.progmatic.Interfaces_CarTask13.practiceathome;

public class FormulaOneRunner {

    public static void main(String[] args) {

        MercedesPilotOne hamilton = new MercedesPilotOne("Hamilton", "British", "Mercedes");
        hamilton.acceleration(1.6);
        System.out.println(hamilton.getRacerName());
        System.out.println(hamilton.getNationality());
        System.out.println(hamilton.getCarManufacturer());


        System.out.println(hamilton);
    }
}
