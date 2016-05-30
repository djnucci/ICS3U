package nucci;

import java.util.Scanner;

public class IsPrime {
	// global variable
	public static int x = 0;
	/**
	 * this is the main method
	 * @param args
	 */
	public static void main(String[] args) {
		// scanner
		Scanner scn = new Scanner(System.in);

		// input prompts
		System.out.println("Please enter a number.");
		x = scn.nextInt();

		if (isPrime(x)) {
			System.out.println(x + " is prime.");
		}
		else {
			System.out.println(x + " is not prime.");
		}

	}
	
	/**
	 * Determines if a number is divisable for all numbers below it
	 * @param x
	 * 			- int first number
	 * @param i
	 * 			- int second number
	 * @return
	 * 			boolean true = divisable, false = not divisable
	 */
	public static boolean isDivisible(int x, int i) {
		if (x % i != 0) {
			return false;
		}

		return true;
	}
	
	/**
	 * Determmines if a number is prime
	 * 
	 * @param x 
	 * 			- int number that is being checked if it is prime
	 * @return 
	 * 			boolean true = prime number, false = not prime number
	 */
	public static boolean isPrime(int x) {
		if (x == 0 || x == 1) {
			return (false);
		}
		for (int i = 2; i < x; i++) {
			if (isDivisible(x, i) == true) {
				return (false);
			}
		}
		return (true);
	}

}
