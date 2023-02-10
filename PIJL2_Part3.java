package PIJL_Assignments;

import java.util.*;

/*
 * Part 3: Write a Java program to convert an array into ArrayList and vice versa
 */

public class PIJL2_Part3 {
	
	// Function to convert Array to ArrayList. Returns ArrayList
	ArrayList<Integer> arrayToArrayList(int arr[], int size) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<size; i++) {
			list.add(arr[i]);
		}
		return list;
	}
	
	// Function to convert ArrayList to Array. Returns Array.	
	int[] arrayListToArray(ArrayList<Integer> list) {
		
		int size = list.size();
		int arr[] = new int[size];
		
		for (int i = 0; i < size ; i++)
			arr[i] = list.get(i);
		
		return arr;
	}
}