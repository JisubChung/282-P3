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

	//  QS1 = "book" partition, random pivot, easiest case = 20
	// i.e. a last small pointer separating lt & gt values
	public static void QuickSort1(int[] a, int n) {		
		QuickSort1(a, 0, n-1);
		InsertionSort(a, n);		
	}

	// a: array to be sorted
	// start: start index of array a
	// end: end index of array a
	private static void QuickSort1(int[] a, int left, int right) {
		//easy case
		if(((right+1)-left) <= 3) {
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
		}
		else {
			int lastSmall = partitionBook(a,left,right);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
	}

	//This partition will separate less than and greater than blocks according
	// to a randomly selected partition value.
	//The partition is part of the less than block
	//The index of the last less element (the pivot) will be returned
	private static int partitionBook(int[] a, int start, int end) {
		int unknown = start+1;
		int lastSmall = start;
		int holdElement = a[start];
		//pick a random pivot and swap to front
		Random r = new Random();
		int pivot = r.nextInt(end-start+1)+start;
		a[start] = a[pivot];
		a[pivot] = holdElement;
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
					holdElement = a[lastSmall];
					a[lastSmall] = a[unknown];
					a[unknown] = holdElement;
				}				
			}
			else {
				//do nothing
				//this is the case where unknown > pivot 
			}
			unknown++;
		}
		holdElement = a[lastSmall];
		a[lastSmall] = a[start];
		a[start] = holdElement;
		return lastSmall;
	}

	public static void QuickSort2(int[] a, int n) {
		QuickSort2(a, 0, n-1);
		InsertionSort(a, n);		
	}

	private static void QuickSort2(int[] a, int left, int right) {
		//easy case
		if(((right+1)-left) <= 3) {
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
			// CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION CHANGE THIS TO MEET SPECIFICATION
		}
		else {
			int lastSmall = partitionBook(a,left,right);
			QuickSort1(a, left, lastSmall-1);

			//this could be optimized
			QuickSort1(a, lastSmall+1, right);
		}
	}
	
	//This partition will move pointers towards each other, swapping elements
	// as needed according to randomly selected partition value.
	//The partition is always swapped
	//The index of the ??????????????????????? will be returned
	private static int partition(int[] a, int left, int right) {
		
	}


	public static void HeapSort1(int[] a, int n) {
		//Shift, no swapping allowed
	}

	public static String myName() {
		return "Ji-Sub Chung";
	}
}