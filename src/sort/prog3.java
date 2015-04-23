package sort;

//Name: Jisub Chung
//COMP 282 - MW
//Assignment #3
//4/23/2015
//Description: Sorting

//import java.math.*;



class ArraySorts {

	private static void InsertionSort(int[] a, int n) {
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
		int pivot;
		while((right+1) - left > 20) {
			pivot = left + (int) (Math.random() * (right - left + 1)); 
			int temp[] = partitionBook(a,left, right, pivot);
			int leftPivot = temp[0];
			int rightPivot = temp[1];
			if ( leftPivot - left < right - rightPivot) { 
				// left side is smaller
				QuickSort1(a, left, leftPivot-1);
				left = rightPivot + 1;  // QS(a, pivot + 1, rt,)
			} else { 
				// right side is smaller
				QuickSort1(a, rightPivot + 1, right);
				right = leftPivot - 1; // QS(a, lf, pivot - 1)
			}
		}
	}

	private static void QuickSort2(int[] a, int left, int right) {
		while (right - left>= 20) {
			int pivot = left + (int) (Math.random() * (right - left + 1));  
			pivot = partition(a,left, right, pivot);
			if ( (pivot - 1) - left < right - (pivot + 1) ) { 
				QuickSort2(a, left, pivot);
				left = pivot + 1;  
			} else { 
				QuickSort2(a, pivot + 1, right);
				right = pivot; 
			}
		}
	}


	private static void QuickSort3(int[] a, int left, int right) {
		while((right+1) - left > 20) {
			int temp[] = partitionBook(a,left, right, left);
			int leftPivot = temp[0];
			int rightPivot = temp[1];
			if ( leftPivot - left < right - rightPivot) { 
				QuickSort3(a, left, leftPivot-1);
				left = rightPivot + 1;
			} else {
				QuickSort3(a, rightPivot + 1, right);
				right = leftPivot - 1; 
			}
		}
	}

	private static void QuickSort4(int[] a, int left, int right) {
		while (right - left>= 1) {
			int pivot = left + (int) (Math.random() * (right - left + 1)); 
			pivot = partition(a,left, right, pivot);
			if ( (pivot - 1) - left < right - (pivot + 1) ) { 
				QuickSort4(a, left, pivot);
				left = pivot + 1; 
			} else {
				QuickSort4(a, pivot + 1, right);
				right = pivot; 
			}
		}
	}

	private static void QuickSort5(int[] a, int left, int right) {
		while (right - left>= 500) {
			int pivot = left + (int) (Math.random() * (right - left + 1)); 
			pivot = partition(a,left, right, pivot);
			if ( (pivot - 1) - left < right - (pivot + 1) ) { 
				QuickSort5(a, left, pivot);
				left = pivot + 1; 
			} else { 
				QuickSort5(a, pivot + 1, right);
				right = pivot;
			}
		}
	}

	private static void QuickSort6(int[] a, int left, int right) {
		int pivot;
		while((right+1) - left > 1) {
			pivot = left + (int) (Math.random() * (right - left + 1)); 
			int temp[] = partitionBook(a,left, right, pivot);
			int leftPivot = temp[0];
			int rightPivot = temp[1];
			if ( leftPivot - left < right - rightPivot) {
				QuickSort6(a, left, leftPivot-1);
				left = rightPivot + 1;
			} else {
				QuickSort6(a, rightPivot + 1, right);
				right = leftPivot - 1;
			}
		}
	}

	//QUICKSORT PARTITIONS
	private static int[] partitionBook(int[] a, int start, int end, int pivot) {
		//This partition will separate less than and greater than blocks according
		// to a randomly selected partition value.
		//Returns index of the left most pivot and the right most pivot 
		int unknown = start+1;
		int leftPivot = start;
		int rightPivot = start;
		int temp;
		int pVal = a[pivot];
		a[pivot] = a[start];
		a[start] = pVal;		
		//begin partitioning
		//Essentially what's going on here is that the pivot is a block of ints
		// in the array. This way multiple copies of the pivot are dealt with
		while(unknown <= end) {
			if(a[unknown] == pVal) {
				rightPivot++;
				if(unknown > rightPivot) {
					temp = a[rightPivot];
					a[rightPivot] = a[unknown];
					a[unknown] = temp;
				}
			}
			else if(a[unknown] < pVal) {
				rightPivot++;
				a[leftPivot] = a[unknown];
				a[unknown] = a[rightPivot];
				a[rightPivot] = pVal;
				leftPivot++;
			}
			else { //unknown > pivot
			}
			unknown++;
		}
		int[] pivots = {leftPivot, rightPivot};
		return pivots;
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
			trickleDown(a, 0, endHeap);
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
			trickleDown(a, 0, endHeap);
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