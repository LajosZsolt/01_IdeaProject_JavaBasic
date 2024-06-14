import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task70_String_ChangeToCapital {

    public static void main(String[] args) {

        String text = " Progmatic ";

        char characterFromText = text.charAt(1);
        System.out.println(characterFromText);
        System.out.println(text.charAt(5));


        // Examples for length()
        System.out.println(text.length());

        // Examples for trim()

        System.out.println(text.trim());
        String textTrimmed = text.trim();

        System.out.println(textTrimmed.length());

        //Save text to char array
        char[] textArray = text.toCharArray();
        System.out.println(textArray);
        System.out.println(textArray[2]);

        // to lower and to upper

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        // substring
        System.out.println(text.substring(0, 11));

        // startsWith
        System.out.println(text.startsWith(" prog"));

        // ends With
        System.out.println(text.endsWith("tic "));

        // contains
        System.out.println(text.contains("ogma"));

        //replace
        System.out.println(text.replace(" Pro", "prooo"));

        //split
        String textWithComma = "5600-Ft";

String[] SplittedPrice = textWithComma.split("-");
        System.out.print(" első split " + SplittedPrice[0]);
        System.out.print(" második split " + SplittedPrice[1]);
        System.out.println(" a split uttánni hossz:  " + SplittedPrice.length);
        int priceInt = Integer.parseInt(SplittedPrice[0]);
        System.out.println(SplittedPrice[0]);


// String értéke nem felülírható

        String bob = "Bob";
        System.out.println(bob);
        bob.toLowerCase();
        System.out.println(bob);

        String adam = "Adam";
        System.out.println(adam);
        adam = adam.toLowerCase();
        System.out.println(adam);


        List<String> names = Arrays.asList("Zsolt", "Viktor", "Jimmy", "Ronaldo");
        List<String> namesWithUpperCase = new ArrayList<>();

        for (String name :names) {
            namesWithUpperCase.add(name.toUpperCase());
        }

        System.out.println(names);
        System.out.println(namesWithUpperCase);
    }
}
