package hu.progmatic;

import java.util.Random;

public class Task23_szerencsesuti_switch {

    public static void main(String[] args) {
       String computerChoose;
       System.out.println("Hi you will get a fortune cookie!");

       Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(5);

        if (randomNumber == 0) {
            System.out.println("First cookie");
        }else if(randomNumber == 1) {
            System.out.println("Second cookie");
        }else if(randomNumber == 2) {
            System.out.println("Third cookie");
        }else if(randomNumber == 3) {
            System.out.println("Fourth cookie");
        }else {
            System.out.println("Fifth cookie");
        }
    }
}
