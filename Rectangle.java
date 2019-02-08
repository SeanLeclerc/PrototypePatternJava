
public class Rectangle extends Forme {

   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void dessine() {
      System.out.println("Interieur Rectangle::dessine() method.");
   }
}
