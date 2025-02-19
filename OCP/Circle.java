public class Circle extends Shape {  
    private double radius;
    
    @Override
    public double calculateArea() {
      return Math.PI * this.radius * this.radius;
    }
}
