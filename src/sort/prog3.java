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
		InsertionSort(a, n);		
	}
	
	public static void QuickSort3(int[] a, int n) {
		QuickSort3(a, 0, n-1);	
		InsertionSort(a, n);
	}
	
	public static void QuickSort4(int[] a, int n) {
		QuickSort4(a, 0, n-1);	
	}
	
	public static void QuickSort5(int[] a, int n) {
		QuickSort5(a, 0, n-1);
		InsertionSort(a, n);		
	}

	public static void QuickSort6(int[] a, int n) {
		QuickSort6(a, 0, n-1);	
	}
	
	//QUICKSORT RECURSIVE METHODS
	private static void QuickSort1(int[] a, int left, int right) {
<<<<<<< HEAD
<<<<<<< HEAD
		int partitions[];
		//[0] first index of partitioned pivot elements
		//[1] last index of partitioned pivot elements
		while((right+1) - left > 1) {
			int pivot = 0;//left + (int) (Math.random() * (right - left + 1)); 
			//  book's pivot method
			partitions = partitionBook(a,left, right, pivot);
			//the case where no new elements
			//The case where both partitions are different
			if ( (partitions[0]-1) - left < right - (partitions[1]+1) ) { 
				// left side is smaller
				QuickSort1(a, left, partitions[0]);
				// eliminate the tail recursion by setting the parameters accordingly
				left = partitions[1] + 1;  // QS(a, pivot + 1, rt,)
			} 
			else { // right side is smaller
				QuickSort1(a, partitions[1], right);
				right = partitions[0] - 1; // QS(a, lf, pivot - 1)
			}
			
			
			/*
			
			if(partitions[0] > -1 && a[partitions[0]] != a[partitions[1]]) {
				// figure out which partition is smaller
				if ( (partitions[1] - 1) - left < right - (partitions[0] + 1) ) { // left side is smaller
					QuickSort1(a, left, partitions[0] - 1);
					// eliminate the tail recursion by setting the parameters accordingly
					left = pivot + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[0] + 1, right);
					right = pivot - 1; // QS(a, lf, pivot - 1)
				}
			}
			else {
				if ( (partitions[1] - 1) - left < right - (partitions[1]) ) { // left side is smaller
					QuickSort1(a, left, partitions[0]);
					// eliminate the tail recursion by setting the parameters accordingly
					left = partitions[1] + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[1], right);
					right = partitions[1] - 1; // QS(a, lf, pivot - 1)
				}
			}*/
=======
=======
		//easy case
		if(((right+1)-left) <= 20) {
		}
		else {
			int lastSmall = partitionBook(a,left,right,false);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
	}

	private static void QuickSort2(int[] a, int left, int right) {
>>>>>>> parent of 08eb6b7... Finished
		//easy case
		if(((right+1)-left) <= 20) {
		}
		else {
<<<<<<< HEAD
			int lastSmall = partitionBook(a,left,right,false);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
>>>>>>> parent of 08eb6b7... Finished
		}
	}

	private static void QuickSort2(int[] a, int left, int right) {
=======
			int lastSmall = partition(a,left,right);
			QuickSort1(a, left, lastSmall);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
	}
	
	private static void QuickSort3(int[] a, int left, int right) {
>>>>>>> parent of 08eb6b7... Finished
		//easy case
		if(((right+1)-left) <= 20) {
		}
		else {
<<<<<<< HEAD
			int lastSmall = partition(a,left,right);
			QuickSort1(a, left, lastSmall);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
	}
	
	private static void QuickSort3(int[] a, int left, int right) {
<<<<<<< HEAD
		int partitions[];
		//[0] first index of partitioned pivot elements
		//[1] last index of partitioned pivot elements
		while((right+1) - left > 1) {
			int pivot = left; 
			//  book's pivot method
			partitions = partitionBook(a,left, right, pivot);
			//the case where no new elements
			//The case where both partitions are different
			if ( (partitions[0]-1) - left < right - (partitions[1] + 1) ) { // left side is smaller
				QuickSort3(a, left, partitions[0]-1);
				// eliminate the tail recursion by setting the parameters accordingly
				left = partitions[1] + 1;  // QS(a, pivot + 1, rt,)
			} else { // right side is smaller
				
				QuickSort3(a, partitions[1] + 1, right);
				right = partitions[0] - 1; // QS(a, lf, pivot - 1)
			}
			
			
			/*
			
			if(partitions[0] > -1 && a[partitions[0]] != a[partitions[1]]) {
				// figure out which partition is smaller
				if ( (partitions[1] - 1) - left < right - (partitions[0] + 1) ) { // left side is smaller
					QuickSort1(a, left, partitions[0] - 1);
					// eliminate the tail recursion by setting the parameters accordingly
					left = pivot + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[0] + 1, right);
					right = pivot - 1; // QS(a, lf, pivot - 1)
				}
			}
			else {
				if ( (partitions[1] - 1) - left < right - (partitions[1]) ) { // left side is smaller
					QuickSort1(a, left, partitions[0]);
					// eliminate the tail recursion by setting the parameters accordingly
					left = partitions[1] + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[1], right);
					right = partitions[1] - 1; // QS(a, lf, pivot - 1)
				}
			}*/
=======
		//easy case
		if(((right+1)-left) <= 20) {
		}
		else {
			int lastSmall = partitionBook(a,left,right,true);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
>>>>>>> parent of 08eb6b7... Finished
=======
			int lastSmall = partitionBook(a,left,right,true);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
>>>>>>> parent of 08eb6b7... Finished
		}
	}

	private static void QuickSort4(int[] a, int left, int right) {
		//easy case
		if(((right+1)-left) <= 1) {
		}
		else {
			int lastSmall = partition(a,left,right);
			QuickSort1(a, left, lastSmall);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
	}
	
	private static void QuickSort5(int[] a, int left, int right) {
		//easy case
		if(((right+1)-left) <= 500) {
		}
		else {
			int lastSmall = partition(a,left,right);
			QuickSort1(a, left, lastSmall);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	//something
	private static void QuickSort6(int[] a, int left, int right) {
		int partitions[];
		//[0] first index of partitioned pivot elements
		//[1] last index of partitioned pivot elements
		while((right+1) - left > 1) {
			int pivot = left + (int) (Math.random() * (right - left + 1)); 
			//  book's pivot method
			partitions = partitionBook(a,left, right, pivot);
			//the case where no new elements
			//The case where both partitions are different
			if ( (partitions[0]-1) - left < right - (partitions[1] + 1) ) { // left side is smaller
				QuickSort3(a, left, partitions[0]-1);
				// eliminate the tail recursion by setting the parameters accordingly
				left = partitions[1] + 1;  // QS(a, pivot + 1, rt,)
			} else { // right side is smaller
				
				QuickSort3(a, partitions[1] + 1, right);
				right = partitions[0] - 1; // QS(a, lf, pivot - 1)
			}
			
			
			/*
			
			if(partitions[0] > -1 && a[partitions[0]] != a[partitions[1]]) {
				// figure out which partition is smaller
				if ( (partitions[1] - 1) - left < right - (partitions[0] + 1) ) { // left side is smaller
					QuickSort1(a, left, partitions[0] - 1);
					// eliminate the tail recursion by setting the parameters accordingly
					left = pivot + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[0] + 1, right);
					right = pivot - 1; // QS(a, lf, pivot - 1)
				}
			}
			else {
				if ( (partitions[1] - 1) - left < right - (partitions[1]) ) { // left side is smaller
					QuickSort1(a, left, partitions[0]);
					// eliminate the tail recursion by setting the parameters accordingly
					left = partitions[1] + 1;  // QS(a, pivot + 1, rt,)
				} else { // right side is smaller
					QuickSort1(a, partitions[1], right);
					right = partitions[1] - 1; // QS(a, lf, pivot - 1)
				}
			}*/
=======
	private static void QuickSort6(int[] a, int left, int right) {
=======
	private static void QuickSort6(int[] a, int left, int right) {
>>>>>>> parent of 08eb6b7... Finished
		//easy case
		if(((right+1)-left) <= 1) {
		}
		else {
			int lastSmall = partitionBook(a,left,right,false);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
<<<<<<< HEAD
>>>>>>> parent of 08eb6b7... Finished
=======
>>>>>>> parent of 08eb6b7... Finished
		}
	}
	
	//QUICKSORT PARTITIONS
	private static int partitionBook(int[] a, int start, int end, boolean useLeft) {
		//This partition will separate less than and greater than blocks according
		// to a randomly selected partition value.
		//The pivot is part of the less than block
		//Returns index of the last less element (the pivot)
<<<<<<< HEAD
<<<<<<< HEAD
		
		
		int unknown = start;
		int lfPivot = start;
		int rtPivot = start;
		int piCount = 0;	
		int pivotValue = a[pivot];
		int temp = a[start];
		a[start] = pivotValue;
		a[pivot] = temp;
=======
=======
>>>>>>> parent of 08eb6b7... Finished
		int unknown = start+1;
		int lastSmall = start;
		int holdElement = a[start];
		int pivot;
		if(!useLeft) {
			//pick a random pivot and swap to front
			Random r = new Random();
			pivot = r.nextInt(end-start+1)+start;
			a[start] = a[pivot];
			a[pivot] = holdElement;
		}
		else {} //use left most element
		pivot = a[start];
<<<<<<< HEAD
>>>>>>> parent of 08eb6b7... Finished
=======
>>>>>>> parent of 08eb6b7... Finished
		//begin partitioning
		while(unknown <= end) {
			
			if(a[unknown] < pivotValue) {
				if(lfPivot==start){
					lfPivot++;
					rtPivot++;
					a[start] = a[unknown];
					temp = a[rtPivot];
					a[rtPivot] = pivotValue;
					a[unknown] = temp;
				}
				else {
					//a[lfPivot] = a[unknown];
					rtPivot++;
					a[lfPivot] = a[unknown];
					lfPivot++;
					a[unknown] = a[rtPivot];
					a[rtPivot] = pivotValue;
				}
			}
			else if(a[unknown] == pivotValue) {
				if(unknown==rtPivot) {
					rtPivot=unknown;
					piCount++;
					if(piCount == 0) {
						lfPivot=unknown;
					}
				}
				else {
					rtPivot++;
					piCount++;
					a[unknown] = a[rtPivot];
					a[rtPivot] = pivotValue;
				}
			}
			unknown++;
		}
			
			
			
			/*
			
			
			if(a[unknown] < pivotValue) {
				//special case when ls and uk are next to each other
				if(lastSmall+1 == unknown) {
					lastSmall++;
					//lastPivot++;
				}
				//advance ls and swap w/unknown
				else {
					temp = a[unknown];
					lastSmall++;
<<<<<<< HEAD
					a[unknown] = a[lastSmall];
					a[lastSmall] = temp;
				}
			}
			else if (a[unknown] == pivotValue) {
				lastPivot++;
				lastSmall++;
				temp = a[lastPivot];
				a[lastPivot] = a[unknown];
				a[unknown] = a[lastSmall];
				a[lastSmall] = temp;
			}
			/*				else {
					lastPivot++;
					temp = a[lastPivot];
					a[lastPivot] = a[unknown];
					a[unknown] = temp;
					lastSmall++;
<<<<<<< HEAD
					temp = a[lastSmall];
					a[lastSmall] = a[lastPivot];
					a[lastPivot] = temp;
				}				
		}
			else if (a[unknown] == pivotValue) {
				if(lastPivot <= end) {
				lastPivot++;
				temp = a[unknown];
				a[unknown] = a[lastPivot];
				a[lastPivot] = temp;
				}
				else {
				}
=======
=======
>>>>>>> parent of 08eb6b7... Finished
					holdElement = a[lastSmall];
					a[lastSmall] = a[unknown];
					a[unknown] = holdElement;
				}				
			}
<<<<<<< HEAD
>>>>>>> parent of 08eb6b7... Finished
=======
>>>>>>> parent of 08eb6b7... Finished
			else {
				//do nothing
				//this is the case where unknown > pivot 
			}
			unknown++;
		}
<<<<<<< HEAD
<<<<<<< HEAD
		//temp = a[lastSmall];
		//a[lastSmall] = a[start];
		//a[start] = temp;
		*/
		int[] partitions = {lfPivot, rtPivot};
		//put pivot[s] in the middle
//		for(int i = 0; i <= partitions[1]-start && i <= partitions[0]-start;i++) {
//			temp = a[start+i];
//			a[start+i] = a[partitions[1]-i];
//			a[partitions[1]-i] = temp;
//		}
//		partitions[0]=partitions[1]-partitions[0];
		return partitions;
=======
=======
>>>>>>> parent of 08eb6b7... Finished
		holdElement = a[lastSmall];
		a[lastSmall] = a[start];
		a[start] = holdElement;
		return lastSmall;
<<<<<<< HEAD
>>>>>>> parent of 08eb6b7... Finished
=======
>>>>>>> parent of 08eb6b7... Finished
	}
	
	public static int partition(int[] a, int start, int end) {
		//This partition will move pointers towards each other, swapping elements
		// as needed according to randomly selected partition value.
		//The pivot is always swapped
		//Returns index of last less (may or may not include pivot)
		int smaller = start;
		int larger = end;
		Random r = new Random();
		int pivot = a[r.nextInt(end-start+1)+start];
		int temp;
		while(smaller <= larger) {
			if(a[smaller] < pivot) {
				smaller++;
			}
			else if(a[larger] > pivot) {
				larger--;
			}
			else if((a[smaller] >= pivot) && (a[larger] <= pivot)) {
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
	
	//TOP DOWN
	public static void HeapSort1(int[] a, int n) {
		//Shift, no swapping allowed
		//reorganize data into a heap
		buildHeapFromTop(a, n);
		//reorganize data in sorted order
		int endHeap = n;
		int temp;
		while(endHeap > 0) {
			temp = a[n-endHeap];
			for(int i = 0; i < endHeap; i++) {
				a[i] = a[i+1];
			}
			a[endHeap] = temp;
			endHeap--;
			trickleUp(a, 0, endHeap);
		}
	}
	
	//start from the beginning of the heap (single root)
	// then add more elements to the heap
	public static void buildHeapFromTop(int[] a, int n) {
		int end = 1;
		while (end < n) {
			trickleUp(a, 0, end);
			end++;
		}
	}
	
	//Move out of order elements UP to their proper position
	private static void trickleUp(int[] a, int start, int endHeap) {
		int temp;
		int child = endHeap;
		int parent = (child-1)/2;
		boolean isHeap = false;
		while(!isHeap) {
			if(a[parent] < a[child]) {
				temp = a[child];
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
	
	//Start from the end of the heap
	//add elements going towards the front
	public static void buildHeapFromBottom(int[] a, int n) {
		
	}
	
	//Move out of order elements DOWN to their proper position
	private static void trickleDown(int[] a, int start, int endHeap) {
		
	}
	
	public static String myName() {
		return "Ji-Sub Chung";
	}
}