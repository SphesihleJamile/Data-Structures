public class Stack<E>
{
   Node<E> head;
   
   public Stack()
   {
      this.head = null;
   }
   
   public void push(E data)
   {
      if(head == null)
      {
         head = new Node<E>(data);
         return;
      }
      
      Node<E> newHead = new Node<E>(data);
      newHead.next = head;
      head = newHead;
   }
   
   public E peek()
   {
      if(head == null) return null;
      return head.data;
   }
   
   public E pop()
   {
      if(head == null) return null;
      else
      {
         Node<E> oldHead = (Node<E>) head;
         head = (Node<E>) head.next;
         return (E) oldHead.data;
      }
         
   }
   
   public boolean empty()
   {
      return head == null;
   }
   
   public int search(E data)
   {
      if(head == null) return -1;
      int count = 0;
      
      Node<E> current = head;
      while(current != null)
      {
         if(current.data == data)
         {
            return count;
         }
         count++;
         current = current.next;
      }
      return -1;
   }
   
   public int search(Node<E> node)
   {
      if(head == null) return -1;
      int count = 0;
      
      Node<E> current = head;
      while(current != null)
      {
         if(current == node)
            return count;
         count++;
         current = current.next;
      }
      return -1;
   }
   
   public static class Node<E>
   {
      E data;
      Node next;
      
      public Node(E data)
      {
         this.data = data;
      }
   }
   
      
   public static void main(String[] args)
   {
      Stack<Integer> stack = new Stack<Integer>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      
      System.out.println(stack.pop());
      System.out.println(stack.peek());
   }
}
