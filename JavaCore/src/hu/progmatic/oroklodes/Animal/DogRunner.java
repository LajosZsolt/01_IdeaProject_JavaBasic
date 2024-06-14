package hu.progmatic.oroklodes.Animal;

public class DogRunner {
    public static void main(String[] args) {

        Animal frank = new Animal("Frank", 2, 33.33);
        Dog bob = new Dog("Bob", 7, 33.33, "ball");

        System.out.println("----------Frank-------------");
        System.out.println("Name: "+ frank.getName());
        System.out.println("Age: "+ frank.getAge());
        System.out.println("Mass: "+ frank.getMass());

        System.out.println("----------Bob-------------");
        System.out.println("Name: "+ bob.getName());
        System.out.println("Age: "+ bob.getAge());
        System.out.println("Mass: "+ bob.getMass());
        System.out.println("Toy: "+ bob.getToy());

        bob.play();

        Berni theodor = new Berni("Teo", 4, 37,
                "none", false,true, "definitive");
        System.out.println("----------Theodor-------------");
        System.out.println("Name: "+ theodor.getName());
        System.out.println("Age: "+ theodor.getAge());
        System.out.println("Mass: "+ theodor.getMass());
        System.out.println("Toy: "+ theodor.getToy());
        System.out.println("Is he likes the cold? : "+ theodor.isLikesTheCold());
        System.out.println("Is he always hungry? : "+ theodor.isAlwaysHungry());

        theodor.allOfThemVeryFaithful();


    }
}
