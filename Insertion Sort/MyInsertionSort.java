public class MyInsertionSort
{
   public static void sort(int[] array)
   {
      int n = array.length;
      for(int i = 1; i < n; i++)
      {
         int key = array[i]; //the key will keep track of the current element that we're on in the array
         int j = i - 1; //j will start a the element previous to this one, as we will first compare which one is bigger and then swap
         while(j >= 0 && array[j] > key)
         {
            /*
               Here if j > key, then we will swap the two values and decrement the value of k;
               then we will compare the smaller swapped value with it's previous value.
               
               This is to make sure that the sorted part of our array remains sorted as we continue iterating through the array.
            */
            array[j + 1] = array[j];
            j = j - 1;
         }
         array[j + 1] = key;
      }
   }
   public static void main(String[] args)
   {
      int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
      sort(array);
      for(int i : array)
      {
         System.out.print(i + " ");
      }
   }
}