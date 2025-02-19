public class MainLSP {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Ostrich ostrich = new Ostrich();
        Penguin penguin = new Penguin();
        Sparrow sparrow = new Sparrow();  
        
        eagle.move();
        eagle.fly();
        
        ostrich.move();
       
        penguin.move();
          
        sparrow.move();
        sparrow.fly();
    }
}
