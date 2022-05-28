import java.util.Hashtable;

public class MyHashTable2
{
   public static void main(String[] args)
   {
      //There is no need to mention the Generic type twice.
      Hashtable<Integer, String> ht = new Hashtable<>(4);
      
      //Innitialization of Hashtable using Generics
      Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);
      
      //Insert elements into the hashtable using a metod called put()
      ht.put(1, "one");
      ht.put(2, "two");
      ht.put(3, "three");
      ht.put(4, "four");
      ht.put(5, "five");
      
      ht2.put(6, "six");
      ht2.put(7, "seven");
      ht2.put(8, "eight");
      ht2.put(9, "nine");
      ht2.put(10, "ten");
      
      //Print mappings to the console
      System.out.println("Mapping of ht" + ht);
      System.out.println("Mapping of ht2" + ht2);
   }
}