public class Ellipse extends Shape{
    private double a;
    private double b;
    
    @Override
    public double calculateArea(){
        return Math.PI * this.a * this.b;
    }
}
