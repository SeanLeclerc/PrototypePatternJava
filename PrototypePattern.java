
public class PrototypePattern {
   public static void main(String[] args) {
      CacheForme.loadCache();

      Forme clonedForme = (Forme) CacheForme.getForme("1");
      System.out.println("Forme : " + clonedForme.getType());		

      Forme clonedForme2 = (Forme) CacheForme.getForme("2");
      System.out.println("Forme : " + clonedForme2.getType());		

      Forme clonedForme3 = (Forme) CacheForme.getForme("3");
      System.out.println("Forme : " + clonedForme3.getType());		
   }
}

