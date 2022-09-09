import java.util.Random;
public class MyBubbleSort
{
   public static void sort(int[] array, int n)
   {
      boolean didSwop;
      for(int i = 0; i < (n - 1); i++)
      {
         didSwop = false;
         for(int j = 0; j < (n - i - 1); j++)
         {
            if(array[j] > array[j + 1])
            {
               int temp = array[j + 1];
               array[j + 1] = array[j];
               array[j] = temp;
               didSwop = true;
            }
         }
         if(!didSwop)
            break;
      }
   }
   
   public static void recursiveSort(int[] array, int n)
   {
      if(n <= 1)
         return;
      for(int i = 0; i < (n - 1); i++)
      {
         if(array[i] > array[i + 1])
         {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
         }
      }
      recursiveSort(array, n - 1);
   }
   
   public static void main(String[] args)
   {
      int[] array = new int[10000];
      Random rand = new Random();
      for(int i = 0; i < array.length; i++)
      {
         array[i] = rand.nextInt(10000);
      }
      recursiveSort(array, array.length);
      
      for(int e : array)
      {
         System.out.println(e);
      }
   }
}