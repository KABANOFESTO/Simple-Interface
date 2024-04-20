public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(6, 8);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}