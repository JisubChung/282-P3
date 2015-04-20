package sort;
/*  My output

Testing Fearless Leader's program.
QuickSort1: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
QuickSort2: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
QuickSort3: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
QuickSort4: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
QuickSort5: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
QuickSort6: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
HeapSort1: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
HeapSort2: 26.25.24.23.22.21.20.19.18.17.16.15.14.13.12.11.10.9.8.7.6.5.4.3.2.1.0.
Bigger, QuickSort1: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.
Bigger, QuickSort2: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.
Bigger, QuickSort3: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.
Bigger, QuickSort4: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.
Bigger, QuickSort5: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.
Bigger, QuickSort6: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.
Bigger, HeapSort1: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.
Bigger, HeapSort2: 100.631.1162.1693.2224.2755.3286.3817.4348.4879.5410.5941.6472.7003.7534.8065.8596.
                    9127.9658.10189.10720.11251.11782.12313.12844.13375.13906.14437.14968.15499.16030.
                    16561.17092.17623.18154.18685.19216.19747. done.

Testing Fearless Leader's sorts on a huge array.
Java's QuickSort on random data runs in 3.380 seconds.
Java's QuickSort on the test sets runs in 1.067 seconds.

Fearless Leader's QuickSort1 on all random values runs in 3.883 seconds. Java Ratio = 1.14
Fearless Leader's QuickSort1 on the test sets runs in 1.783 seconds. Java Ratio = 1.67

Fearless Leader's QuickSort2 on all random values runs in 4.018 seconds. Java Ratio = 1.18
Fearless Leader's QuickSort2 on the test sets runs in 1.844 seconds. Java Ratio = 1.72

Fearless Leader's QuickSort3 on all random values runs in 3.963 seconds. Java Ratio = 1.17

Fearless Leader's QuickSort4 on all random values runs in 5.490 seconds. Java Ratio = 1.62
Fearless Leader's QuickSort4 on the test sets runs in 2.799 seconds. Java Ratio = 2.62

Fearless Leader's QuickSort5 on all random values runs in 4.657 seconds. Java Ratio = 1.37
Fearless Leader's QuickSort5 on the test sets runs in 2.183 seconds. Java Ratio = 2.04

Fearless Leader's QuickSort6 on all random values runs in 4.746 seconds. Java Ratio = 1.40
Fearless Leader's QuickSort6 on the test sets runs in 2.539 seconds. Java Ratio = 2.37

Fearless Leader's HeapSort1 on all random values runs in 7.553 seconds. Java Ratio = 2.23
Fearless Leader's HeapSort1 on the test sets runs in 4.052 seconds. Java Ratio = 3.79

Fearless Leader's HeapSort2 on all random values runs in 7.308 seconds. Java Ratio = 2.16
Fearless Leader's HeapSort2 on the test sets runs in 3.680 seconds. Java Ratio = 3.44

 */

import java.io.*; // for IOException
import java.util.Arrays; // to compare your sort against Java's

public class test1 {

	public static void main(String[] args) throws IOException {

		final int largeSize = 10000000;
		int[] number, goodone;
		int n, differ, sort, fill, i;
		boolean[] Sort_OK = { true, true, true, true, true, true, true, true };
		long before, after, yourtotal, javarandomtotal, javaothertotal;
		number = new int[20000];
		goodone = new int[20000];
		String[] SortType = { "QuickSort1", "QuickSort2", "QuickSort3",
				"QuickSort4", "QuickSort5", "QuickSort6", "HeapSort1",
				"HeapSort2" };
		String[] FillType = { "Increasing", "Decreasing", "Random", "Constant",
				"Mids" };
		System.out.println("Testing " + ArraySorts.myName() + "'s program.");

		// First check to see if they sort small arrays properly
		for (sort = 0; sort < SortType.length; sort++) {
			System.out.print(SortType[sort] + ": ");
			for (n = 26; n >= 0 && Sort_OK[sort]; n--) {
				System.out.print(n + ".");

				for (fill = 0; fill < FillType.length && Sort_OK[sort]; fill++) {
					fillArray(fill, number, 0, n);
					for (i = 0; i < n; i++)
						goodone[i] = number[i];
					callSort(sort + 1, number, n);
					Arrays.sort(goodone, 0, n);
					differ = same(goodone, number, n);
					if (differ != -1) {
						System.out.println();
						System.out.println("*** " + FillType[fill]
								+ " sorting error: " + SortType[sort]
								+ ", position #" + differ);
						System.out.println("*** No more " + SortType[sort]
								+ "s will be tested.  Correct values and "
								+ ArraySorts.myName() + "'s values follow.");
						Sort_OK[sort] = false;
						mydisplay(goodone, n);
						mydisplay(number, n);
					}
				}
			}
			System.out.println();
		}

		// Now check larger arrays
		for (sort = 0; sort < SortType.length; sort++) {
			System.out.print("Bigger, " + SortType[sort] + ": ");
			for (n = 100; n <= 20000 && Sort_OK[sort]; n = n + 531) {
				System.out.print(n + ".");
				if (n == 8596 || n == 16030) {
					System.out.println();
					System.out.print("                    ");
				}

				for (fill = 0; fill < FillType.length && Sort_OK[sort]; fill++) {
					fillArray(fill, number, 1, n);
					for (i = 0; i < n; i++)
						goodone[i] = number[i];
					callSort(sort + 1, number, n);
					Arrays.sort(goodone, 0, n);
					differ = same(goodone, number, n);
					if (differ != -1) {
						System.out.println();
						System.out.println("*** " + FillType[fill]
								+ " sorting error: " + SortType[sort]
								+ ", position #" + differ);
						System.out.println("*** No more " + SortType[sort]
								+ "s will be tested.  Correct values and "
								+ ArraySorts.myName() + "'s values follow.");
						Sort_OK[sort] = false;
					}
				}
			}
			System.out.println(" done.");
		}
		System.out.println();

		// Now see how fast your sorts really are
		System.out.println("Testing " + ArraySorts.myName()
				+ "'s sorts on a huge array.");
		number = new int[largeSize];
		javarandomtotal = 0;
		for (fill = 1; fill < 5; fill++) {
			fillArray(2, number, 1, largeSize);
			before = System.currentTimeMillis();
			Arrays.sort(number);
			after = System.currentTimeMillis();
			javarandomtotal = javarandomtotal + after - before;
		}
		System.out.println("Java's QuickSort on random data runs in "
				+ javarandomtotal / 1000 + "." + millis(javarandomtotal % 1000)
				+ " seconds.");

		javaothertotal = 0;
		for (fill = 1; fill < 5; fill++) {
			fillArray(fill, number, 1, largeSize);
			before = System.currentTimeMillis();
			Arrays.sort(number);
			after = System.currentTimeMillis();
			javaothertotal = javaothertotal + after - before;
		}
		System.out.println("Java's QuickSort on the test sets runs in "
				+ javaothertotal / 1000 + "." + millis(javaothertotal % 1000)
				+ " seconds.");
		System.out.println();

		for (int sortNum = 0; sortNum < SortType.length; sortNum++) {
			if (Sort_OK[sortNum]) {
				yourtotal = 0;
				for (fill = 1; fill < 5; fill++) {
					fillArray(2, number, 1, largeSize);
					before = System.currentTimeMillis();
					callSort(sortNum + 1, number, largeSize);
					after = System.currentTimeMillis();
					yourtotal = yourtotal + after - before;
				}
				System.out.print(ArraySorts.myName() + "'s "
						+ SortType[sortNum] + " on all random values runs in "
						+ yourtotal / 1000 + "." + millis(yourtotal % 1000)
						+ " seconds.");
				System.out
						.println(" Java Ratio = "
								+ (yourtotal / javarandomtotal)
								+ "."
								+ hundreds((int) (((float) (yourtotal)
										/ javarandomtotal - (yourtotal / javarandomtotal)) * 100)));
				if (sortNum == 2) {
					System.out.println();
					continue; // you didn't see this!
				}
				yourtotal = 0;
				for (fill = 1; fill < 5; fill++) {
					fillArray(fill, number, 1, largeSize);
					before = System.currentTimeMillis();
					callSort(sortNum + 1, number, largeSize);
					after = System.currentTimeMillis();
					yourtotal = yourtotal + after - before;
				}
				System.out.print(ArraySorts.myName() + "'s "
						+ SortType[sortNum] + " on the test sets runs in "
						+ yourtotal / 1000 + "." + millis(yourtotal % 1000)
						+ " seconds.");
				System.out
						.println(" Java Ratio = "
								+ (yourtotal / javaothertotal)
								+ "."
								+ hundreds((int) (((float) (yourtotal)
										/ javaothertotal - (yourtotal / javaothertotal)) * 100)));
				System.out.println();
			} else {
				System.out.println(ArraySorts.myName() + "'s "
						+ SortType[sortNum] + " not tested.");
				System.out.println();
			}
		}
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

	private static void fillArray(int fillNumber, int[] number, int BigorSmall,
			int n) {
		if (fillNumber == 0){
			System.out.print("inc ");
			fillIncreasing(number, n);
		}
		else if (fillNumber == 1){
			System.out.print("dec ");
			fillDecreasing(number, n);
		}
		else if (fillNumber == 2) {
			if (BigorSmall == 0){
				System.out.print("sm ");
				fillRandomSmall(number, n);
			}
			else{
				System.out.print("big ");
				fillRandomBig(number, n);
			}
		} else if (fillNumber == 3) {
			System.out.print("const ");
			fillConstant(number, n); }
		else if (fillNumber == 4) {
			System.out.print("mids ");
			fillMids(number, n);
		}
		else
			System.out.println("No such filling scheme.");
	}

	public static int same(int[] a, int[] b, int n) {
		int result = -1;
		for (int i = 0; (i < n) && (result == -1); i++)
			if (a[i] != b[i])
				result = i;
		return result;
	}

	public static void mydisplay(int[] a, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void fillMids(int[] a, int n) {
		fillMids(a, 0, n - 1, 0);
	}

	private static void fillMids(int[] a, int lf, int rt, int ct) {

		while (lf <= rt) {
			a[lf] = ct;
			ct++;
			lf++;
			a[rt] = ct;
			ct++;
			rt--;
		}
	}

	public static void fillConstant(int a[], int n) {
		int inc = n / Math.max(1, (int) Math.log((double) n));
		for (int i = 0; i < n; i++) {
			a[i] = 52;
		}
		for (int i = 0; i < n; i += inc) {
			if (i % 2 == 0)
				a[i] = 51;
			else
				a[i] = 53;
		}
	}

	public static void fillIncreasing(int[] a, int n) {
		for (int i = 0; i < n; i++)
			a[i] = i;
		if (n > 2) {
			a[n - 2] = 2;
			a[1] = n - 2;
		}
	}

	public static void fillDecreasing(int[] a, int n) {
		for (int i = 0; i < n; i++)
			a[i] = n - i - 1;
		if (n > 2) {
			a[n - 2] = n - 2;
			a[1] = 1;
		}
	}

	public static void fillRandomSmall(int a[], int n) {
		for (int i = 0; i < n; i++)
			a[i] = (int) (Math.random() * n);
	}

	public static void fillRandomBig(int a[], int n) {
		for (int i = 0; i < n; i++)
			a[i] = (int) (Math.random() * n * 10);
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
	}

}