package hu.progmatic;

public class Task12_While {
    public static void main(String[] args) {
        // összesen 8 üvegünk van
        System.out.println("5 zöld üvegünk van, aminek darabja 10 Ft");
        System.out.println("3 barna üvegünk van, aminek darabja 30 Ft");

        int amountGreenBottle = 0;
        int amountBraunBottle = 0;
        int greenBottle = 1;
        int braunBottle = 1;

        while(greenBottle <= 5) {
            amountGreenBottle = 10 + amountGreenBottle;
            greenBottle++;
        }

        while(braunBottle <= 3) {
            amountBraunBottle = 30 + amountBraunBottle;
            braunBottle++;
        }

        System.out.println();
        System.out.println("Zöld üvegvisszaváltás összege: " + amountGreenBottle);
        System.out.println("Barna üvegvisszaváltás összege: " + amountBraunBottle);
        System.out.print("Mindösszesen: ");
        System.out.print(amountBraunBottle + amountGreenBottle);
    }
}
