public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle(2, 2, 3);

        System.out.println("Circle class test: ");
        System.out.println("The area of circle with " + circle1.getRadius() + " radius is: " + circle1.calculateArea());
        System.out.println("The Circumference of circle with " + circle1.getRadius() + " radius is: " + circle1.calculateCircumference());


        Rectangle rectangle1 = new Rectangle(2,2, 10,5);
        System.out.println("\nRectangle class test: ");
        System.out.println("The area of the rectangle with width " + rectangle1.getWidth() + " and height " + rectangle1.getHeight() + " is: " + rectangle1.calculateArea());
        System.out.println("The perimeter of the rectangle with width " + rectangle1.getWidth() + " and height " + rectangle1.getHeight() + " is: " + rectangle1.calculateCircumference());

        Triangle triangle1 = new Triangle(2,2, 12, 5);
        System.out.println("\nTriangle class test: ");
        System.out.println("The area of the triangle with base " + triangle1.getBase() + " and height " + triangle1.getHeight() + " is: " + triangle1.calculateArea());
        System.out.println("The perimeter of the triangle is: " + triangle1.calculateCircumference());



    }
}