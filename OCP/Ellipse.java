public class Ellipse extends Shape{
    private double a;
    private double b;
    
    public Ellipse(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double calculateArea(){
        return Math.PI * this.a * this.b;
    }
}
