package PIJL_Assignments;

import java.util.Scanner;

/*
 * Part2: Implement a java function that finds 2 neighboring numbers in an array with the smallest distance to each.
 * The function should return the index of the 1st number.
 */

public class PIJL2_Part2 {
	
	public static void main(String args[]) {
		
		PIJL2_Part2 obj = new PIJL2_Part2();
		
		int n = 5;
		int arr[] = obj.inputArray(n);
		
		obj.printArr(arr, n);
		
		int leastDistanceIndex = obj.getLeastDistanceNeighbour(arr);
		System.out.println("Least Distance Index = " + leastDistanceIndex);
		
	}
	
	// Utility function to input an array
	int[] inputArray(int size) {
		int arr[] = new int[size]; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + size + " integers.");
		for(int i=0; i<size; i++) {
			System.out.print("Enter integer " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	int getLeastDistanceNeighbour(int arr[]) {
		
		int n = arr.length, minDistance=Integer.MAX_VALUE, minIndex=0, currDistance;
		
		if(n < 2)
			return -1;
		
		for(int i=0; i<n-1; i++) {
			currDistance = absolute(arr[i], arr[i+1]);
			if(currDistance < minDistance) {
				minDistance = currDistance;
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	// utility function to return absolute difference
	int absolute(int a, int b) {
		return a-b>=0 ? a-b : b-a;
	}
	
	void printArr(int arr[], int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		
}