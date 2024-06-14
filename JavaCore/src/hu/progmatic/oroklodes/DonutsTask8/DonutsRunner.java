package hu.progmatic.oroklodes.DonutsTask8;

public class DonutsRunner {
    public static void main(String[] args) {

        ClassicDonutsParent classicDonutsParent = new ClassicDonutsParent("Round", "Medium",
                "Vanilla", "Classic", "Powdered sugar");
        classicDonutsParent.runningOut();
        classicDonutsParent.tasteExperience();

        System.out.println(classicDonutsParent);

        System.out.println("---------------------------------------");
        ChocolateDonuts chocolateDonuts = new ChocolateDonuts(true, "Round", "Large",
                "Chocolate", "Cacao", "Chocolate");

        System.out.println(chocolateDonuts);

        classicDonutsParent.runningOut();
        classicDonutsParent.tasteExperience();
        chocolateDonuts.chocolateFillingPreparation();

        System.out.println("---------------------------------------");
        MarmaladeDonuts marmaladeDonuts = new MarmaladeDonuts(15, "Oval", "Medium", "Jam",
                "Classic", "Powdered sugar");

        MarmaladeDonuts marmaladeDonuts1 = new MarmaladeDonuts(15);

        System.out.println(marmaladeDonuts);
        System.out.println();
        System.out.println(marmaladeDonuts1);



    }
}
