package hu.progmatic;

public class CarMain {
    public static void main(String[] args) {
      Car ferrari = new Car("GT-1000","Red");
      Car alfaromeo = new Car("S-2311","Green");
      Car tesla = new Car("model3", "white");


      System.out.println("Ferrari objekt: " + ferrari);
      ferrari.setModel("GT-1500");
      System.out.println("Overridden ferrari model: " + ferrari.getModel());
    }
}
