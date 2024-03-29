import java.util.Scanner;

public class LinkedList
{
   Node head;
   
   public void append(int data){
      //The append method is going to add a new node at the end of the linkedList
      if(head == null)
      {
         //if the head does not exist, then we have to create the head, if it does, then append
         head = new Node(data);
         return;
      }
       
      Node current = head;
      //we will use current to keep track of which node we are 
      //on right now in the linkedList
      while(current.next != null) //while there is still another value in the linkedList
      {
         current = current.next;//we move to the next node, and then restart the process
      }
      //we are now at the end of the list, so we have to add a new item
      current.next = new Node(data);
   }
   
   public void prepend(int data)
   {
      Node newHead = new Node(data);
      newHead.next = head;
      head = newHead;
   }
   
   public void deleteWithValue(int data)
   {
      if(head == null) return;
      
      if(head.data == data)
      {
         head = head.next;
      }
      
      Node current = head;
      while(current.next != null)
      {
         if(current.next.data == data)
         {
            current.next = current.next.next;
            return;
         }
         current = current.next;
      }
   }
   
   public void printData(int prediction)
   {
      int count = 0;
      
      if(head == null && prediction == count)
      {
         System.out.println("Empty Set");
         System.out.println("Perfect Score ::-) ");
         return;
      }
      
      if(head == null)
      {
         System.out.println("Empty Set");
         System.out.println("GAME OVER!!, YOU LOST !!!");
      }
      
      Node current = head;
      while(current != null)
      {
         count++;
         if(current.next == null && prediction == count)
         {
            System.out.println("Prediction [" + prediction + "] , Guesses [" + count + "]");
            System.out.println("Perfect Score ::-) ");
         }
         if(current.next == null)
         {
            System.out.println("Prediction [" + prediction + "] , Guesses [" + count + "]");
             System.out.println("GAME OVER!!, YOU LOST !!!");
         }
         current = current.next;
      }
   }

   
   public static void main(String[] args)
   {
      
      Scanner scan = new Scanner(System.in);
      
      while(true)
      {
         LinkedList list = new LinkedList();
         int random_number = (int)(Math.random() * 30);
         while(random_number != 1)
         {
            list.append(random_number);
            random_number = (int)(Math.random() * 30);
         }
         list.printData(5);
         
         System.out.println();
         System.out.println("Do you want to go again? (y/n): ");
         System.out.println();
         if(!scan.next().equalsIgnoreCase("y"))
            break;
      }
   }

}
