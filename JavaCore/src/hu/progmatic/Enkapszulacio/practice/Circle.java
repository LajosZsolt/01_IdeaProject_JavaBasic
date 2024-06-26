package hu.progmatic.Enkapszulacio.practice;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public Circle scale(double scalefactor){
        return new Circle(radius* scalefactor);
    }
}
