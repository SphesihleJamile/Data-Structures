import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class MyHashTable4
{
   public static void main(String[] args)
   {
      //No need to mention the Generic type twice
      Map<Integer, String> hm = new HashMap<>();
      
      //Inser elements using the method put()
      hm.put(1, "one");
      hm.put(2, "two");
      hm.put(3, "three");
      
      //Initialization of a Hashtable using Generics
      Hashtable<Integer, String> ht = new Hashtable<Integer, String>(hm);
      
      System.out.println("Mappings og ht " + ht);
   }
}