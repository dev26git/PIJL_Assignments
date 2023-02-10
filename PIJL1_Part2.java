/*
 * Devansh Singh
 * 21070126024
 * AIML-A2
 * 
 * Assignment 1 Part2: Implement a simple menu driven calculator in java to implement 
 * add, sub, mul, div, sqrt, power, mean, variance. Implement a separate 
 * Calculator class to include all related function inside that class. 
 * (mean calculation : program reads numbers from the keyboard, 
 * summing them in the process until the user enters the string “end”. 
 * It then stops input & displays the avg. of numbers)
 * 
 * 
 */

package PIJL_Assignments;

import java.util.*;

public class PIJL1_Part2 {

	// Driver code
	public static void main(String args[]) {
		
		int choice;
		ArrayList<Double> inputList; // stores input values
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter 1 to add.\n"
				+ "Enter 2 to subtraction.\n"
				+ "Enter 3 to divide.\n"
				+ "Enter 4 to multiply.\n"
				+ "Enter 5 to square-root.\n"
				+ "Enter 6 to power.\n"
				+ "Enter 7 for mean.\n"
				+ "Enter 8 for variance.");
		
		choice = sc.nextInt();
		
		switch(choice) {
			case 1: 
				System.out.println("Enter two numbers to add:");
				inputList = inputDoubles(2);
				System.out.println("Sum = " + Calc.add(inputList.get(0), inputList.get(1)));
				break;
			case 2:
				System.out.println("Enter two numbers to subtract:");
				inputList = inputDoubles(2);
				System.out.println("Difference = " + Calc.subtract(inputList.get(0), inputList.get(1)));
				break;
			case 3:
				System.out.println("Enter two numbers to divide:");
				inputList = inputDoubles(2);
				System.out.println("Quotient = " + Calc.divide(inputList.get(0), inputList.get(1)));
				break;
			case 4:
				System.out.println("Enter two numbers to multiply:");
				inputList = inputDoubles(2);
				System.out.println("Product = " + Calc.multiply(inputList.get(0), inputList.get(1)));
				break;
			case 5:
				System.out.println("Enter a number to calculate square root:");
				inputList = inputDoubles(1);
				System.out.println("Square-root = " + Calc.sqrt(inputList.get(0)));
				break;
			case 6:
				System.out.println("Enter number and power:");
				inputList = inputDoubles(2);
				System.out.println("answer = " + Calc.power(inputList.get(0), inputList.get(1)));
				break;
			case 7:
				System.out.println("Enter numbers ('end' to stop):");
				inputList = inputDoubles(0);
				System.out.println("mean = " + Calc.mean(inputList));
				break;
			case 8:
				System.out.println("Enter numbers ('end' to stop):");
				inputList = inputDoubles(0);
				System.out.println("Variance = " + Calc.variance(inputList));
				break;
		}
		
		sc.close();
	}

	// method for variable-length input depending on the value passed
	private static ArrayList<Double> inputDoubles(int count) {
		/*
		 * count contains the number of values to be entered.
		 * if count == 0, the method inputs values until 'end' entered.
		 * Returns ArrayList of entered values as double type
		 */
		
		ArrayList<Double> arr = new ArrayList<Double>();
		Scanner sc1  = new Scanner(System.in);
		
		if(count == 0) {
			// add into ArrayList if there is no specific number of input values
			String inp = "";
			while(true) {
				inp = sc1.nextLine();
				if(inp.equals("end"))
					break;
				arr.add(Double.parseDouble(inp));
			}
		}
		else {
			// add into ArrayList when there is a specific number of values defined
			while(count > 0) {
				arr.add(Double.parseDouble(sc1.next()));
				--count;
			}
		}
		
		sc1.close();
		return arr;
	}
	
}


// Mathematical functions to be used by driver class
class Calc {
	
	public static double add(double a, double b) {
		return a+b;
	}
	public static double subtract(double a, double b) {
		return a-b;
	}
	public static double divide(double a, double b) {
		if(b == 0) {
			System.out.println("Cannot Divide By Zero!");
			return 0;
		}
		return a/b;
	}
	public static double multiply(double a, double b) {
		return a*b;
	}
	public static double sqrt(double a) {
		return Math.sqrt(a);
	}
	public static double power(double a, double b) {
		double ans = 1;
		while(b > 0) {
			ans = ans * a;
			b--;
		}
		return ans;
	}
	public static double mean(ArrayList<Double> inputList) {
		double sum = 0;
		int n = inputList.size();
		for(int i=0; i<n; i++) {
			sum = sum + inputList.get(i);
		}
		return (sum/n);
	}
	public static double variance(ArrayList<Double> inputList) {
		double mean = mean(inputList);
		double summation = 0;
		int n = inputList.size();
		for(int i=0; i<n; i++) {
			summation += power((inputList.get(i) - mean), 2);
		}
		return summation/n;
	}

}