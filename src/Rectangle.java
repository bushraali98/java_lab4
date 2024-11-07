public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(int x, int y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (getHeight() * getWidth());
    }

    @Override
    public double calculateCircumference() {
        return (2 * (getWidth() + getHeight()));
    }
}
