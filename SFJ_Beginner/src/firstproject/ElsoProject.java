package firstproject;


import java.util.ArrayList;
import java.util.Arrays;

public class ElsoProject {

    public static void main(String[] args) {
        Human first = new Human();

        first.setName("Gyula");

        first.writeMyName();
        first.setAge(18);

//        boolean empty = (first.getName() == null);
//        System.out.println(empty == true ? "Üres" : "Nem üres, az értéke " + first.getName());
        System.out.println(first.getName() == null ? "Üres" : "Nem üres, az értéke " + first.getName());

        System.out.print((first.getAge())+ "\n");


        ArrayList<Animal> cats = new ArrayList<Animal>();
        Cat sziamiau = new Cat("sziamiau");

        cats.add(sziamiau);

        System.out.println(cats.get(0).getName());
        System.out.println(cats.size());
    }







}
