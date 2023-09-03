
public class Square extends Shape implements ShapeCalculate {
    private double sideLength;

    public Square(String name, double sideLength) {
        super(name, ShapeType.SQUARE);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {

        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter() {

        return 4 * sideLength;
    }
}