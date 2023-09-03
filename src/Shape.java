public abstract class Shape {
    private String name;
    private ShapeType type;

    public Shape(String name, ShapeType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public ShapeType getType() {
        return type;
    }


}
