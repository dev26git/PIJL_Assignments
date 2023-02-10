package PIJL_Assignments;

import java.util.Scanner;

/*
 * Part1: W.a.p that declares two arrays named ‘even’ and ‘odd’.
 * Accept numbers from the user and move them to respective arrays depending on whether they are even or odd.
 */

public class PIJL2_Part1 {
	
	public static void main(String args[]) {
		
		int O[] = new int[10]; // array stores Odd numbers
		int E[] = new int[10]; // array stores Even numbers
		int n, size_O=0, size_E=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 10 integers.");
		
		// input into respective arrays
		for(int i=0; i<10; i++) {
			System.out.print("Enter integer " + (i+1) + ": ");
			n = sc.nextInt();
			if(n % 2 == 0)
				E[size_E++] = n;
			else
				O[size_O++] = n;
		}
		
		// print arrays by creating object
		PIJL2_Part1 obj = new PIJL2_Part1();
		
		System.out.println();
		System.out.print("Odd array: ");
		obj.printArr(O, size_O);
		System.out.print("Even array: ");
		obj.printArr(E, size_E);
		
		sc.close();
	}
	
	void printArr(int arr[], int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
