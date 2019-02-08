
import java.util.Hashtable;

public class CacheForme {
	
   private static Hashtable<String, Forme> shapeMap  = new Hashtable<String, Forme>();

   public static Forme getForme(String formeId) {
      Forme cachedForme = shapeMap.get(formeId);
      return (Forme) cachedForme.clone();
   }
   
   public static void loadCache() {
      Cercle cercle = new Cercle();
      cercle.setId("1");
      shapeMap.put(cercle.getId(),cercle);

      Carre carre = new Carre();
      carre.setId("2");
      shapeMap.put(carre.getId(),carre);

      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(), rectangle);
   }
}