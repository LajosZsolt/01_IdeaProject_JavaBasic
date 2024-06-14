package hu.progmatic.Enkapszulacio.practice;

public class CircleExample {

    public static void main(String[] args) {
        Circle circleTheFirst = new Circle(5);

        System.out.println(" Circle the first :");
        System.out.println(" Perimeter: " + circleTheFirst.getPerimeter());
        System.out.println(" Area: " + circleTheFirst.getArea());


        Circle circleTheSecond = circleTheFirst.scale(2);

        System.out.println(" Circle the second :");
        System.out.println(" Perimeter: " + circleTheSecond.getPerimeter());
        System.out.println(" Area: " + circleTheSecond.getArea());

        Circle circleTheThird = circleTheFirst.scale(2);
        Circle circleTheFourth = circleTheSecond.scale(10);

        System.out.println(" Circle the Third :");
        System.out.println(" Perimeter: " + circleTheThird.getPerimeter());
        System.out.println(" Area: " + circleTheThird.getArea());
        System.out.println(" Circle the Fourth :");
        System.out.println(" Perimeter: " + circleTheFourth.getPerimeter());
        System.out.println(" Area: " + circleTheFourth.getArea());


    }
}
