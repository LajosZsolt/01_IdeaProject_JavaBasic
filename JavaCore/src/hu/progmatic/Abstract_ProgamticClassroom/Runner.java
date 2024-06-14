package hu.progmatic.Abstract_ProgamticClassroom;

public class Runner {

    public static void main(String[] args) {
        // AbstractDog abstractDog = new AbstractDog() ;
        // az abstract osztály nem példányosítható, csak a leszármazott

    Yorkie yorkie = new Yorkie("masni", "female", "2021,12.19.", 1.4);

    Yorkie yorkie1 = new Yorkie("female", "2021,12.19.", 1.4);

        System.out.println(yorkie1);
        System.out.println(yorkie);

    }

}