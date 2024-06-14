package hu.progmatic.Interfaces_CarTask13;

public class FormulaOneRunner {
    public static void main(String[] args) {



      MercedesPilotOne hamilton = new MercedesPilotOne("Hamilton", "Brit", "Mercedes");
      hamilton.acceleration(1.9);


        System.out.println(hamilton.getRacerName());
        System.out.println(hamilton.getNationality());
        System.out.println(hamilton.getManufacturer());
        System.out.println(hamilton);

      }
}
