
public class Triangle extends Shape implements ShapeCalculate {
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name, ShapeType.TRIANGLE);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {

        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 0.0;
    }
}