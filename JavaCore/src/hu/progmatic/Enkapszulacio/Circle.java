package hu.progmatic.Enkapszulacio;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    // ezért nincs set az osztályban, a scale - meghívása után egy új kör objektum jön létre.

    public Circle scale(double scaleFactor) {
        return new Circle(radius * scaleFactor);
    }


}