package hu.progmatic;

public class Task12_For {
    public static void main(String[] args) {
        // összesen 8 üvegünk van
        System.out.println("5 zöld üvegünk van, aminek darabja 10 Ft");
        System.out.println("3 barna üvegünk van, aminek darabja 30 Ft");

        int amountGreenBottle = 0;
        int amountBraunBottle = 0;

        for (int greenBottle = 1; greenBottle <= 5; greenBottle++) {
            amountGreenBottle = 10 + amountGreenBottle;
        }

        for (int braunBottle = 1; braunBottle <= 3; braunBottle++) {
            amountBraunBottle = 30 + amountBraunBottle;
        }
        System.out.println();
        System.out.println("Zöld üvegvisszaváltás összege: " + amountGreenBottle);
        System.out.println("Barna üvegvisszaváltás összege: " + amountBraunBottle);
        System.out.print("Mindösszesen: ");
        System.out.print(amountBraunBottle + amountGreenBottle);
    }
}
