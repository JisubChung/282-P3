package sort;

import java.io.*;    // for IOException
import java.util.Arrays;  // to compare your sort against Java's
import java.util.Random;

public class test1 {

   public static void main(String[] args) throws IOException {
	   int test[] = {2, 1, 4, 3, 7, 5, -10, 11, 52, 91, 12, 53, 20, 33, 37, 42, 92};
	   int small[] = {7,2,6,1,3,5,4};
	   int empty[] = {};
	   ArraySorts tester = new ArraySorts();

	   ShuffleArray(test);
	   System.out.print("QUICKSORT 1: ");
	   tester.QuickSort1(test, 17);
	   for(int i = 0; i < 17; i++) {
		   System.out.print(test[i] + " ");
	   }
	   System.out.println("");

	   ShuffleArray(test);
	   System.out.print("QUICKSORT 2: ");
	   tester.QuickSort2(test, 17);
	   for(int i = 0; i < 17; i++) {
		   System.out.print(test[i] + " ");
	   }
	   System.out.println("");

	   ShuffleArray(test);
	   System.out.print("QUICKSORT 3: ");
	   tester.QuickSort3(test, 17);
	   for(int i = 0; i < 17; i++) {
		   System.out.print(test[i] + " ");
	   }
	   System.out.println("");

	   ShuffleArray(test);
	   System.out.print("QUICKSORT 4: ");
	   tester.QuickSort4(test, 17);
	   for(int i = 0; i < 17; i++) {
		   System.out.print(test[i] + " ");
	   }
	   System.out.println("");

	   ShuffleArray(test);
	   System.out.print("QUICKSORT 5: ");
	   tester.QuickSort5(test, 17);
	   for(int i = 0; i < 17; i++) {
		   System.out.print(test[i] + " ");
	   }
	   System.out.println("");

	   ShuffleArray(test);
	   System.out.print("QUICKSORT 6: ");
	   tester.QuickSort6(test, 17);
	   for(int i = 0; i < 17; i++) {
		   System.out.print(test[i] + " ");
	   }
	   System.out.println("\n");
	   
	   ////////////////HEAPSOIDS
	   
	   ShuffleArray(small);
	   //tester.heapify(small,7);
	   for(int i = 0; i < 7; i++) {
		   System.out.print(small[i] + " ");
	   }
	   System.out.println("");

   }
   
   private static void ShuffleArray(int[] array)
   {
       int index, temp;
       Random random = new Random();
       for (int i = array.length - 1; i > 0; i--)
       {
           index = random.nextInt(i + 1);
           temp = array[index];
           array[index] = array[i];
           array[i] = temp;
       }
   }
}