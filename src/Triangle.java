public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle(int x, int y, double height, double base) {
        super(x, y);
        this.height = height;
        this.base = base;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    // Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return ((getBase() * getHeight()) / 2);
    }

    @Override
    public double calculateCircumference() {
        return (getBase() + getBase() + getBase());
    }
}
