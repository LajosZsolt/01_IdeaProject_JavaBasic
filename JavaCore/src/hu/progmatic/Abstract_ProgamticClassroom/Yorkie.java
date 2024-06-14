package hu.progmatic.Abstract_ProgamticClassroom;

public class Yorkie extends AbstractDog{

    public Yorkie(String name, String gender, String birthDay, double weight) {
        super(name, gender, birthDay, weight);
    }

    public Yorkie(String gender, String birthDay, double weight) {
        super(gender, birthDay, weight);
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String doSomethingBad() {
        return null;
    }
}
