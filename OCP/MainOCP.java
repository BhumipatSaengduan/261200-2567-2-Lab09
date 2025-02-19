public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Ellipse ellipse = new Ellipse(5, 10);
        
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(ellipse.calculateArea());
    }
}
