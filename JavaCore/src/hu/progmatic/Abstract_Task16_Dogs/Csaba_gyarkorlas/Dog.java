package hu.progmatic.Abstract_Task16_Dogs.Csaba_gyarkorlas;

public class Dog {

    String name;
    String gender;
    String birthday;
    int weight;



    public Dog() {
        this("default", "default", "default", 1);
    }

    public Dog(String name) {
        this(name , "default", "default", 1);
    }

    public Dog(String name, String gender, String birthday, int weight) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                '}';
    }
}
