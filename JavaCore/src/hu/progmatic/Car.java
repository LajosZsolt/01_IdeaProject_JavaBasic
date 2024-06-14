package hu.progmatic;

public class Car {

    // fields
    private String model;
    private String color;
    // constructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    // getters, setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}