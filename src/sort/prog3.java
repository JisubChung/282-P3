package sort;

//Name: Jisub Chung
//COMP 282 - MW
//Assignment #3
//4/20/2015
//Description: Sorting

import java.math.*;
//Shift, no swapping allowed

class ArraySorts {
	
	public static void InsertionSort(int[] a, int n) {
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
	
	public static void QuickSort1(int[] a, int n) {
		
	}
	
	private static void QuickSort1(int[] a, int n, int y) {
		
	}
	
	public static void HeapSort1(int[] a, int n) {
		
	}

	public static String myName() {
		return "Ji-Sub Chung";
	}
}