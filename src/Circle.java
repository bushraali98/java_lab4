public class Circle extends Shape{

    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }
    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (getRadius() * getRadius() * Math.PI);
    }

    @Override
    public double calculateCircumference() {
        return (Math.PI * 2 * getRadius());
    }
}
