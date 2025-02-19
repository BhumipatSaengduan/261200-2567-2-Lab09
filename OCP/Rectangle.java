public class Rectangle extends Shape {
    private double width;
    private double height;
    
    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
