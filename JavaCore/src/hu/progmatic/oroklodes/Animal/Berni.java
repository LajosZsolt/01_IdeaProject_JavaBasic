package hu.progmatic.oroklodes.Animal;


public class Berni extends Dog {

    private boolean likesTheCold;
    private boolean alwaysHungry;
    private String stopOnTheHead;

    public Berni(String name, int age, double mass, String toy,
                 boolean likesTheCold, boolean alwaysHungry, String stopOnTheHead) {
        super(name, age, mass, toy);
        this.alwaysHungry = alwaysHungry;
        this.likesTheCold = likesTheCold;
        this.stopOnTheHead = stopOnTheHead;
    }

    public void allOfThemVeryFaithful() {
        System.out.println(getName() + " is a very faithful dog");
    }

    public String getStopOnTheHead() {
        return stopOnTheHead;
    }

    public boolean isLikesTheCold() {
        return likesTheCold;
    }

    public boolean isAlwaysHungry() {
        return alwaysHungry;
    }

    @Override
    public String toString() {
        return "Berni{" +
                "likesTheCold=" + likesTheCold +
                ", alwaysHungry=" + alwaysHungry +
                '}';
    }
}
