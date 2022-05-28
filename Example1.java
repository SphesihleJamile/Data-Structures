import java.util.*;

public class Example1
{
   public static void main(String[] args)
   {
      //Calender entries for 1 month
      //Key - the day in the month, from 1 to 30
      //Value - a string message that is a to-do for that day
      
      Hashtable<Integer, String> ht = new Hashtable<Integer, String>(30, 0.99f);
      //I used a fill ration of 0.99 because we don't want the table to be extended unless it it completely full
      
      ht.put(3, "Deliver cable orders to Mr. Parker");
      ht.put(5, "Zoom meeting with Sheryl");
      ht.put(9, "Upload database project to GitHub");
      ht.put(14, "Ressearch project is due");
      ht.put(15, "Dinner at Umhlanga with friends");
      ht.put(21, "Sketch's graduation");
      ht.put(22, "Event on Florida Road from 12:00 to 21:00");
      ht.put(1, "Buy Groceries");
      
      //Print entries to console
      System.out.println("These are your current entries in your calender for June\n");
      for(Map.Entry<Integer, String> e : ht.entrySet())
      {
         System.out.println("Day : " + e.getKey() + "\n\tTo-Do: " + e.getValue());
      }
      
      //Update a few entires
      ht.put(9, "Upload database project to GitHub. Also make sure to add a link to the repository to you LinkedIn");
      
      //Remove a value
      ht.remove(21);
      
      //Print update
      System.out.println("\n\n\nThis is your updated entry\n");
      for(Map.Entry<Integer, String> e : ht.entrySet())
      {
         System.out.println("Day : " + e.getKey() + "\n\tTo-Do: " + e.getValue());
      }
      System.out.println("\nYou have " + ht.size() + " entries in your calender");
   }
}