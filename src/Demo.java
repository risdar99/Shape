import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        Square square = new Square("Square", 4.0);
        Triangle triangle = new Triangle("Triangle", 3.0, 4.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        HalfCircle halfCircle = new HalfCircle("HalfCircle", 7.0);

        System.out.println("The shape is " + circle.getName());
        System.out.println("The shape is " + square.getName());
        System.out.println("The shape is " + triangle.getName());
        System.out.println("The shape is " + rectangle.getName());
        System.out.println("The shape is " + halfCircle.getName());

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Square: " + square.calculatePerimeter());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
        System.out.println("Area of HalfCircle: " + halfCircle.calculateArea());
    }

}
