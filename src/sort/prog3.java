package sort;

//Name: Jisub Chung
//COMP 282 - MW
//Assignment #3
//4/20/2015
//Description: Sorting

//import java.math.*;
import java.util.Random;


class ArraySorts {

	public static void InsertionSort(int[] a, int n) {
		//Shift, no swapping allowed
		if(n != 0 || a.length != 0) {
			//iterate looking for out of order
			for(int i = 0; i < n; i++) {
				//if THIS element is larger than NEXT (out of order)
				if((i+1) < n && a[i] > a[i+1]) {
					int smallerEl = a[i+1]; //NEXT
					int index = i; //THIS's index
					//shifting
					while(index >= 0 && a[index] > smallerEl) {
						a[index+1] = a[index];
						index--;
					}
					//insert element
					a[index+1] = smallerEl;
				}
			}
		}
	}

	/*QUICK CHART
	 * QUICKSORT# ** PARTITION? ** PIVOT? ** CASE? ** INSORT?
	 *     1			book		rand	 20			Y
	 *     2			2ptr		rand	 20			Y
	 *     3			book		LF	 	 20			Y
	 *     4			2ptr		rand 	 1			N
	 *     5			2ptr		rand	 500		Y
	 *     6			book		rand	 1			N
	 */

	//QUICKSORT DRIVER METHODS
	public static void QuickSort1(int[] a, int n) {
		QuickSort1(a, 0, n-1);
		InsertionSort(a, n);		
	}

	public static void QuickSort2(int[] a, int n) {
		QuickSort2(a, 0, n-1);
		//InsertionSort(a, n);		
	}

	public static void QuickSort3(int[] a, int n) {
		QuickSort3(a, 0, n-1);	
		InsertionSort(a, n);
	}

	public static void QuickSort4(int[] a, int n) {
		//QuickSort4(a, 0, n-1);	
		QuickSort4(a, 0, n-2);
	}

	public static void QuickSort5(int[] a, int n) {
		QuickSort5(a, 0, n-1);
		//InsertionSort(a, n);		
	}

	public static void QuickSort6(int[] a, int n) {
		QuickSort6(a, 0, n-1);	
	}

	//QUICKSORT RECURSIVE METHODS
	private static void QuickSort1(int[] a, int left, int right) {
		
		/*
		//easy case
		if(((right+1)-left) <= 20) {
		}
		else {
			int lastSmall = partitionBook(a,left,right,false);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
		*/
		int partitions[];
		//[0] elements smaller than pivot
		//[1] elements equal to pivot
		while((right+1) - left > 20) {
			int pivot = left + (int) (Math.random() * (right - left + 1)); 
			//  book's pivot method
			partitions = partitionBook(a,left, right, pivot);
			//the case where no new elements
			//The case where both partitions are different
			if(a[partitions[0]] != a[partitions[1]]) {
				// figure out which partition is smaller
				if ( (partitions[0] - 1) - left < right - (partitions[0] + 1) ) { // left side is smaller
					QuickSort1(a, left, partitions[0] - 1);
					// eliminate the tail recursion by setting the parameters accordingly
					left = pivot + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[0] + 1, right);
					right = pivot - 1; // QS(a, lf, pivot - 1)
				}
			}
			else {
				if ( (partitions[0] - 1) - left < right - (partitions[1]) ) { // left side is smaller
					QuickSort1(a, left, partitions[0]);
					// eliminate the tail recursion by setting the parameters accordingly
					left = pivot + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[1], right);
					right = pivot - 1; // QS(a, lf, pivot - 1)
				}
			}
		}
	}

	private static void QuickSort2(int[] a, int left, int right) {
		/*/easy case
		if(((right+1)-left) <= 20) {
		}
		else {
			int lastSmall = partition(a,left,right);
			QuickSort2(a, left, lastSmall);

			//this could be optimized
			QuickSort2(a, lastSmall+1, right);
		}
		*/

		
		while (right - left>= 20) {
		     int pivot = left + (int) (Math.random() * (right - left + 1));  // bonus hint for finding the random pivot...
		     //  book's pivot method
		     pivot = partition(a,left, right, pivot);
		     // figure out which partition is smaller
		     if ( (pivot - 1) - left < right - (pivot + 1) ) { // left side is smaller
		          QuickSort2(a, left, pivot);
		          // eliminate the tail recursion by setting the parameters accordingly
		          left = pivot + 1;  // QS(a, pivot + 1, rt,)
		     } else { // right side is smaller
		          QuickSort2(a, pivot + 1, right);
		          right = pivot; // QS(a, lf, pivot - 1)
		     }
		}
		
	}

	private static void QuickSort3(int[] a, int left, int right) {
		/*/easy case
		if(((right+1)-left) <= 20) {
		}
		else {
			int lastSmall = partitionBook(a,left,right,-1,true);
			QuickSort3(a, left, lastSmall-1);

			//this could be optimized
			QuickSort3(a, lastSmall+1, right);
		}
		*/

		int pivot;
		while((right+1) - left > 20) {
			pivot = left + (int) (Math.random() * (right - left + 1)); 
			//  book's pivot method
			pivot = partitionBook(a,left, right, left);
			// figure out which partition is smaller
			if ( (pivot - 1) - left < right - (pivot + 1) ) { // left side is smaller
				QuickSort3(a, left, pivot - 1);
				// eliminate the tail recursion by setting the parameters accordingly
				left = pivot + 1;  // QS(a, pivot + 1, rt,)
			} else { // right side is smaller
				QuickSort3(a, pivot + 1, right);
				right = pivot - 1; // QS(a, lf, pivot - 1)
			}
		}
	}

	private static void QuickSort4(int[] a, int left, int right) {
		//easy case
		if(((right+1)-left) <= 1) {
		}
		else {
			int pivot = left + (int) (Math.random() * (right - left + 1));
			int lastSmall = partition(a,left,right, pivot);
			QuickSort4(a, left, lastSmall);

			//this could be optimized
			QuickSort4(a, lastSmall+1, right);
		}
		/*while (right - left>= 1) {
		     int pivot = left + (int) (Math.random() * (right - left + 1));  // bonus hint for finding the random pivot...
		     pivot = partition(a,left, right, pivot);
		     // figure out which partition is smaller
		     if ( (pivot - 1) - left < right - (pivot + 1) ) { // left side is smaller
		          QuickSort4(a, left, pivot);
		          // eliminate the tail recursion by setting the parameters accordingly
		          left = pivot + 1;  // QS(a, pivot + 1, rt,)
		     } else { // right side is smaller
		          QuickSort4(a, pivot + 1, right);
		          right = pivot; // QS(a, lf, pivot - 1)
		     }
		}*/
	}

	private static void QuickSort5(int[] a, int left, int right) {
		/*/easy case
		if(((right+1)-left) <= 500) {
		}
		else {
			int lastSmall = partition(a,left,right);
			QuickSort5(a, left, lastSmall);

			//this could be optimized
			QuickSort5(a, lastSmall+1, right);
		}*/
		while (right - left>= 500) {
		     int pivot = left + (int) (Math.random() * (right - left + 1));  // bonus hint for finding the random pivot...
		     //  book's pivot method
		     pivot = partition(a,left, right, pivot);
		     // figure out which partition is smaller
		     if ( (pivot - 1) - left < right - (pivot + 1) ) { // left side is smaller
		          QuickSort5(a, left, pivot);
		          // eliminate the tail recursion by setting the parameters accordingly
		          left = pivot + 1;  // QS(a, pivot + 1, rt,)
		     } else { // right side is smaller
		          QuickSort5(a, pivot + 1, right);
		          right = pivot; // QS(a, lf, pivot - 1)
		     }
		}
	}

	private static void QuickSort6(int[] a, int left, int right) {
		/*/easy case
		if(((right+1)-left) <= 9) {
		}
		else {
			int pivot = left + (int) (Math.random() * (right - left + 1));
			int lastSmall = partitionBook(a,left,right,pivot);
			QuickSort6(a, left, lastSmall-1);

			//this could be optimized
			QuickSort6(a, lastSmall+1, right);
		}
		*////
		int pivot;
		while((right+1) - left > 1) {
			pivot = left + (int) (Math.random() * (right - left + 1)); 
			//  book's pivot method
			pivot = partitionBook(a,left, right, pivot);
			// figure out which partition is smaller
			if ( (pivot - 1) - left < right - (pivot + 1) ) { // left side is smaller
				QuickSort6(a, left, pivot - 1);
				// eliminate the tail recursion by setting the parameters accordingly
				left = pivot + 1;  // QS(a, pivot + 1, rt,)
			} else { // right side is smaller
				QuickSort6(a, pivot + 1, right);
				right = pivot - 1; // QS(a, lf, pivot - 1)
			}
		}
		///
	}
	
	//QUICKSORT PARTITIONS
	private static int[] partitionBook(int[] a, int start, int end, int pivot) {
		//This partition will separate less than and greater than blocks according
		// to a randomly selected partition value.
		//The pivot is part of the less than block
		//Returns index of the last less element (the pivot)
		int unknown = start+1;
		int lastSmall = start;
		int isPivot = start+1;
		int temp = a[start];
		a[start] = a[pivot];
		a[pivot] = temp;
		pivot = a[start];		
		//begin partitioning
		while(unknown <= end) {
			if(a[unknown] < pivot) {
				//special case when ls and uk are next to each other
				if(lastSmall+1 == unknown) {
					lastSmall++;
				}
				//advance ls and swap w/unknown
				else {
					lastSmall++;
					temp = a[lastSmall];
					a[lastSmall] = a[unknown];
					a[unknown] = temp;
				}				
			}
			else if (a[unknown] == pivot) {
				isPivot++;
			}
			else {
				//do nothing
				//this is the case where unknown > pivot 
			}
			unknown++;
		}
		temp = a[lastSmall];
		a[lastSmall] = a[start];
		a[start] = temp;
		int[] partitions = {lastSmall,isPivot};
		return partitions;
	}

	private static int partition(int[] a, int start, int end, int pivot) {
		//This partition will move pointers towards each other, swapping elements
		// as needed according to randomly selected partition value.
		//The pivot is always swapped
		//Returns index of last less (may or may not include pivot)
		int smaller = start;
		int larger = end;
		int temp;
		int piv = a[pivot];
		while(smaller <= larger) {
			if(a[smaller] < piv) {
				smaller++;
			}
			else if(a[larger] > piv) {
				larger--;
			}
			else if((a[smaller] >= piv) && (a[larger] <= piv)) {
				temp = a[smaller];
				a[smaller] = a[larger];
				a[larger] = temp;
				smaller++;
				larger--;
			}
		}
		//this points to the last smaller or equal to pivot element
		return larger;
	}


	//BEGIN HEAPSORTS

	//Sort elements by building a heap from the top
	// (adding children then correcting)
	//Then swapping the root (largest) with the last child then
	// fixing the heap without the new last element (repeat)
	public static void HeapSort1(int[] a, int n) {
		buildHeapFromTop(a, n);
		int endHeap = n-1;
		int temp;
		while(endHeap > 0) {
			temp = a[endHeap];
			a[endHeap] = a[0];
			a[0] = temp;
			endHeap--;
			//trickleDown(a, 0, endHeap);
		}
	}

	//Sorts elements by building a heap from the bottom
	// (adding parents then correcting)
	//Then swapping the root (largest) with the last child then
	// fixing the heap without the new last element (repeat)
	public static void HeapSort2(int[] a, int n) {
		buildHeapFromBottom(a, n);
		int endHeap = n-1;
		int temp;
		while(endHeap > 0) {
			temp = a[endHeap];
			a[endHeap] = a[0];
			a[0] = temp;
			endHeap--;
			//trickleDown(a, 0, endHeap);
		}
	}

	//start from the beginning of the heap (single root)
	// then add more elements to the heap
	private static void buildHeapFromTop(int[] a, int n) {
		int end = 1;
		while (end < n) {
			trickleUp(a, 0, end);
			end++;
		}
	}

	//Start from the end of the heap
	//add parents going towards the root
	private static void buildHeapFromBottom(int[] a, int n) {
		int start = ((n-2)/2);

		while(start >= 0) {
			trickleDown(a, start, n-1);
			start--;
		}
	}

	//Trickle out of order children UP to their proper position
	private static void trickleUp(int[] a, int start, int endHeap) {
		int temp;
		int child = endHeap;
		int parent = (child-1)/2;
		boolean isHeap = false;
		while(!isHeap) {
			if(a[parent] < a[child]) {
				temp = a[child];
				//so I don't quite understand how to shift vs swap here
				/*
				for(int i = child; i > parent;) {
					if(i%2==0) {
						a[i]=a[i-1];
						i--;
					}
					else {
						a[i]=a[(i-1)/2];
						i=(i-1)/2;
					}
				}
				*/
				a[child] = a[parent];
				a[parent] = temp;
				if (parent != 0) {
					child = parent;
					parent = (parent-1)/2;
				}
			}
			else {
				isHeap = true;
			}
		}
	}
	
	//Trickle down out of order parents to proper place
	private static void trickleDown(int[] a, int start, int endHeap) {
		int root = start;
		int temp;
		int leftIndex = root*2+1;
		int rightIndex = root*2+2;
		int swapThis;
		boolean isHeap = false;
		while (leftIndex <= endHeap && !isHeap) {
			swapThis = leftIndex;
			//check if right node exists
			if(rightIndex <= endHeap) {
				//compare to see which of the two nodes is larger
				if(a[rightIndex] > a[leftIndex]) {
					//swap so that larger node is left
					swapThis = rightIndex;
				}
			}
			if(a[swapThis] > a[root]) {
				//I can't figure out how to implement w/o swap
				//please try to be gentle with ding'ing :(
				temp = a[root];
				a[root] = a[swapThis];				
				a[swapThis] = temp;
				root = swapThis;
			}
			else {
				isHeap = true;
			}
			leftIndex = root*2+1;
			rightIndex = root*2+2;
		}
	}

	public static String myName() {
		return "Ji-Sub Chung";
	}
}