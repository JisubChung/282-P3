package sort;

import java.io.*;    // for IOException
import java.util.Arrays;  // to compare your sort against Java's
import java.util.Random;

public class test1 {

   public static void main(String[] args) throws IOException {
	   int test[] = {2, 1, 4, 3, 7, 5, -10, 11, 52, 91, 12, 53, 20, 33, 37, 42, 92};
	   int empty[] = {};
	   ArraySorts tester = new ArraySorts();
	   tester.QuickSort2(test, 17);

		for(int i = 0; i < 17; i++) {
			System.out.println(test[i]);
		}
/*
      final int largeSize = 10000000;
      int[] number, goodone;
      int size, differ, sort, fill, i;
      boolean[] Sort_OK = { true, true, true, true, true, true, true, true };
      long before, after, yourtotal, javarandomtotal, javaothertotal;
      String[] SortType = { "QuickSort1", "QuickSort2", "QuickSort3", "QuickSort4",
    		  				"QuickSort5", "QuickSort6", "HeapSort1", "HeapSort2" };
      String[] FillType = { "Increasing", "Decreasing", "Random", "Constant", "Mids" };
      System.out.println("Testing " + ArraySorts.myName() + "'s program.");

//           First check to see if they sort small arrays properly
      for (sort = 0; sort < SortType.length; sort++) {
         System.out.println("Small sorts, " + SortType[sort] + " beginning.");
         for (size = 26; size >= 0 && Sort_OK[sort]; size--) {
            System.out.print(size + ".");
            number = new int[size];
            goodone = new int[size];
            
            for (fill = 0; fill < FillType.length && Sort_OK[sort]; fill++) {
               fillArray(fill, number, 0);
               for (i=0; i<number.length; i++)
                  goodone[i] = number[i];
               callSort(sort+1, number, number.length);
               Arrays.sort(goodone);
               differ = same(goodone, number);
               if (differ != -1) {
                  System.out.println();
                  System.out.println("*** " + FillType[fill] + " sorting error: " + SortType[sort] + ", position #" + differ);
                  System.out.println("*** No more " + SortType[sort] + "s will be tested.  Correct values and your values follow.");
                  Sort_OK[sort] = false;
                  mydisplay(goodone);
                  mydisplay(number);
               }
            }
         }
         System.out.println(" done.");
      }

//              Now check larger arrays
      for (sort = 0; sort < SortType.length; sort++) {
         System.out.print("Bigger, " + SortType[sort] + ": ");
         for (size = 100; size <= 20000 && Sort_OK[sort]; size = size + 531) {
            System.out.print(size + ".");
            if (size == 8596 || size == 16030) {
               System.out.println();
               System.out.print("                    ");
            }
            number = new int[size];
            goodone = new int[size];
            
            for (fill = 0; fill < FillType.length && Sort_OK[sort]; fill++) {
               fillArray(fill, number, 1);
               for (i=0; i<number.length; i++)
                  goodone[i] = number[i];
               callSort(sort+1, number, number.length);
               Arrays.sort(goodone);
               differ = same(goodone, number);
               if (differ != -1) {
                  System.out.println();
                  System.out.println("*** " + FillType[fill] + " sorting error: " + SortType[sort] + ", position #" + differ);
                  System.out.println("*** No more " + SortType[sort] + "s will be tested.  Correct values and your values follow.");
                  Sort_OK[sort] = false;
               }
            }
         }
         System.out.println(" done.");
      }
      System.out.println();

//              Now see how fast your best sorts really are
      if (Sort_OK[6]) {
         System.out.println("Testing your sorts on a huge array.");
         number = new int[largeSize];
         javarandomtotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(2, number, 1);
            before = System.currentTimeMillis();
            Arrays.sort(number);
            after = System.currentTimeMillis();
            javarandomtotal = javarandomtotal + after - before;
         }
         System.out.println("Java's QuickSort on random data runs in " + javarandomtotal/1000 + "." + millis(javarandomtotal%1000) + " seconds.");
         
         javaothertotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(fill, number, 1);
            before = System.currentTimeMillis();
            Arrays.sort(number);
            after = System.currentTimeMillis();
            javaothertotal = javaothertotal + after - before;
         }
         System.out.println("Java's QuickSort on the test sets runs in " + javaothertotal/1000 + "." + millis(javaothertotal%1000) + " seconds.");
         System.out.println();
         
         yourtotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(2, number, 1);
            before = System.currentTimeMillis();
            callSort(1, number, number.length);
            after = System.currentTimeMillis();
            yourtotal = yourtotal + after - before;
         }
         System.out.print("Your QuickSort1 on all random values runs in " + yourtotal/1000 + "." + millis(yourtotal%1000) + " seconds.");
         System.out.println(" Java Ratio = " + (yourtotal/javarandomtotal) + "." + hundreds((int)(((float)(yourtotal)/javarandomtotal - (yourtotal/javarandomtotal))*100)));
         
         yourtotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(fill, number, 1);
            before = System.currentTimeMillis();
            callSort(1, number, number.length);
            after = System.currentTimeMillis();
            yourtotal = yourtotal + after - before;
         }
         System.out.print("Your QuickSort1 on the test sets runs in " + yourtotal/1000 + "." + millis(yourtotal%1000) + " seconds.");
         System.out.println(" Java Ratio = " + (yourtotal/javaothertotal) + "." + hundreds((int)(((float)(yourtotal)/javaothertotal - (yourtotal/javaothertotal))*100)));
         System.out.println();
         
         yourtotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(2, number, 1);
            before = System.currentTimeMillis();
            callSort(2, number, number.length);
            after = System.currentTimeMillis();
            yourtotal = yourtotal + after - before;
         }
         System.out.print("Your QuickSort2 on all random values runs in " + yourtotal/1000 + "." + millis(yourtotal%1000) + " seconds.");
         System.out.println(" Java Ratio = " + (yourtotal/javarandomtotal) + "." + hundreds((int)(((float)(yourtotal)/javarandomtotal - (yourtotal/javarandomtotal))*100)));
         
         yourtotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(fill, number, 1);
            before = System.currentTimeMillis();
            callSort(2, number, number.length);
            after = System.currentTimeMillis();
            yourtotal = yourtotal + after - before;
         }
         System.out.print("Your QuickSort2 on the test sets runs in " + yourtotal/1000 + "." + millis(yourtotal%1000) + " seconds.");
         System.out.println(" Java Ratio = " + (yourtotal/javaothertotal) + "." + hundreds((int)(((float)(yourtotal)/javaothertotal - (yourtotal/javaothertotal))*100)));
         System.out.println();

         yourtotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(2, number, 1);
            before = System.currentTimeMillis();
            callSort(8, number, number.length);
            after = System.currentTimeMillis();
            yourtotal = yourtotal + after - before;
         }
         System.out.print("Your HeapSort2 on all random values runs in " + yourtotal/1000 + "." + millis(yourtotal%1000) + " seconds.");
         System.out.println(" Java Ratio = " + (yourtotal/javarandomtotal) + "." + hundreds((int)(((float)(yourtotal)/javarandomtotal - (yourtotal/javarandomtotal))*100)));
         
         yourtotal = 0;
         for (fill = 1; fill < 5; fill++) {
            fillArray(fill, number, 1);
            before = System.currentTimeMillis();
            callSort(8, number, number.length);
            after = System.currentTimeMillis();
            yourtotal = yourtotal + after - before;
         }
         System.out.print("Your HeapSort2 on the test sets runs in " + yourtotal/1000 + "." + millis(yourtotal%1000) + " seconds.");
         System.out.println(" Java Ratio = " + (yourtotal/javaothertotal) + "." + hundreds((int)(((float)(yourtotal)/javaothertotal - (yourtotal/javaothertotal))*100)));
         System.out.println();
      }
      else
         System.out.println("Sorry. Your sorts did not do well enough for the final test.");

      System.out.println("Output by " + ArraySorts.myName());
   }

   private static void callSort(int which, int[] a, int n) {
      if (which == 1)
         ArraySorts.QuickSort1(a, n);
      else if (which == 2)
         ArraySorts.QuickSort2(a, n);
      else if (which == 3)
         ArraySorts.QuickSort3(a, n);
      else if (which == 4)
         ArraySorts.QuickSort4(a, n);
      else if (which == 5)
         ArraySorts.QuickSort5(a, n);
      else if (which == 6)
          ArraySorts.QuickSort6(a, n);
      else if (which == 7)
          ArraySorts.HeapSort1(a, n);
      else if (which == 8)
         ArraySorts.HeapSort2(a, n);
      else
         System.out.println("No such sort " + which + ".");
   }
      

   private static void fillArray(int fillNumber, int[] number, int BigorSmall) {
      if (fillNumber == 0)
         fillIncreasing(number);
      else if (fillNumber == 1)
         fillDecreasing(number);
      else if (fillNumber == 2) {
         if (BigorSmall == 0)
            fillRandomSmall(number);
         else
            fillRandomBig(number);
      }
      else if (fillNumber == 3)
         fillConstant(number);
      else if (fillNumber == 4)
         fillMids(number);
      else
         System.out.println("No such filling scheme.");
   }
   
   public static int same(int[] a, int[] b) {
      int result = -1;
      for (int i = 0; (i < a.length) && (result == -1); i++)
         if (a[i] != b[i])
            result = i;
      return result;
   }
   
   public static void mydisplay(int [] a) {
      for (int i = 0; i < a.length; i++)
         System.out.print(a[i] + " ");
      System.out.println();
   }
   
   public static void fillMids(int [] a) {
      fillMids(a, 0, a.length - 1, 0);
   }
   
   private static void fillMids(int[] a, int lf, int rt, int ct) {
   
      while (lf <= rt) {
         a[lf] = ct; ct++;  lf++;
         a[rt] = ct; ct++;  rt--;
      }
   }
   
   public static void fillConstant(int a[]) {
      for (int i = 0; i < a.length; i++)
         a[i] = 52;
   }
   
   public static void fillIncreasing(int[] a) {
      for (int i = 0; i < a.length; i++)
         a[i] = i;
      if (a.length > 2) {
         a[a.length - 2] = 2;
         a[1] = a.length - 2;
      }
   }
   
   public static void fillDecreasing(int[] a) {
      for (int i = 0; i < a.length; i++)
         a[i] = a.length - i - 1;
      if (a.length > 2) {
         a[a.length - 2] = a.length - 2;
         a[1] = 1;
      }
   }
   
   public static void fillRandomSmall(int a[]) {
      for (int i = 0; i < a.length; i++)
         a[i] = (int) (Math.random() * a.length);
   }

   public static void fillRandomBig(int a[]) {
      for (int i = 0; i < a.length; i++)
         a[i] = (int) (Math.random() * a.length * 10);
   }
   
   public static String millis(long n) {
      String rtn;
      if (n < 10)
         rtn = "00" + n;
      else if (n < 100)
         rtn = "0" + n;
      else
         rtn = String.valueOf(n);
      return rtn;
   }
   
   public static String hundreds(long n) {
      String rtn;
      if (n < 10)
         rtn = "0" + n;
      else
         rtn = String.valueOf(n);
      return rtn;
*/
   }
}