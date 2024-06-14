package hu.progmatic.Enkapszulacio;

public class CircleRunner {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);

        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Perimeter: " + c1.getArea());
        System.out.println();
        c1 = c1.scale(5);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Perimeter: " + c1.getArea());

    }
}
