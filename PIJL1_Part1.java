/*
 * Programming in Java Lab Assignment 1 Part 1
 * 
 * Implement a menu-driven Java program (like fib or factorial) to implement these 
 * input methods in java (command line args, Scanner, BufferedReader, DataInputStream, Console )
 */

package PIJL_Assignments;

import java.io.*;
import java.util.*;

public class PIJL1_Part1 {
	
	/* 0 for BufferedReader
	 * 1 for Scanner
	 * 2 for Console
	 * 
	 * By default the input method will be BufferedReader
	 */
	int input_choice;
	
	// Default Constructor
	public PIJL1_Part1() {
		input_choice = 0;
	}
	
	// Driver Code
	public static void main(String args[]) throws IOException{
		
		int n, task_choice;
		PIJL1_Part1 obj = new PIJL1_Part1();
		
		System.out.print("Enter 0 for BufferedReader.\nEnter 1 for Scanner.\nEnter your choice:");
		obj.input_choice = inputSC();
		
		System.out.print("\nEnter 1 for factorial.\nEnter 2 for fibonacci.\nEnter your choice: ");
		task_choice = input_handler(obj.input_choice);
		
		System.out.print("\nEnter value of n: ");
		n = input_handler(obj.input_choice);
		
		if(task_choice == 1)
			System.out.println("Factorial of " + n + " is " + factorial(n));
		else if(task_choice == 2)
			fibonacci(n);
	}
	
	// Decides which input method to use based on input_choice by the user
	static int input_handler(int input_choice) throws IOException{
		switch(input_choice) {
			case 0: return inputBR();
			case 1: return inputSC();
//			case 2: return inputConsole();
			default: System.out.println("Incorrect Input Choice.");
		}
		
		// if incorrect choice is made then return min value of int
		return Integer.MIN_VALUE;
	}
	
	
	// Input using BufferedReader
	private static int inputBR() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(br.readLine());
	}
	
		
	// Input using Scanner
	private static int inputSC() throws IOException {
		Scanner sc = new Scanner(System.in);
		int toReturn = sc.nextInt();
//		sc.close();
		return toReturn;
		
	}
	
	// Input using Console
	
//	private static int inputConsole() {
//		return Integer.parseInt(System.console().readLine());
//	}

	// Returns factorial of a number
	static long factorial(int n) {
		if(n < 0) {
			System.out.println("Factorial for a negative number cannot be calculated.");
			return -1;
		}
		
		int fact = 1;
		while(n > 1)
			fact = fact * n--;
		return fact;
	}
	
	
	// Prints fibonacci series upto the supplied limit
	static void fibonacci(int limit) {

		int a = 0, b = 1, c;
		
		System.out.println();
		while(a <= limit) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}