

public class HalfCircle extends Shape implements ShapeCalculate {

        private double radius;

        public HalfCircle(String name, double radius) {
            super(name, ShapeType.HALFCIRCLE);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return 2 * 3.14 * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 0.0;
        }

}
