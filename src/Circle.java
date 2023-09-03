
public class Circle extends Shape  implements ShapeCalculate {
    private double radius;

    public Circle(String name, double radius) {
        super(name, ShapeType.CIRCLE);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}