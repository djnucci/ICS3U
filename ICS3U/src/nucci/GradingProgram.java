package nucci;

import java.util.Scanner;

/**
 * @author Nucci this program gets grades from a user and tells the user what
 *         grade they received
 * 
 *         March 30th, 2016
 */

public class GradingProgram {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		//variables
		int numTests;
		int temp;

		//ask for # of tests
		System.out.println("How many tests are you entering?");
		numTests = read.nextInt();

		//for loop to get grades
		for (int i = 0; i < numTests; i++) {
			System.out.println("What is the percent of the test?");
			temp = read.nextInt();

			if (temp >= 80 && temp <= 100) {
				System.out.println("A");
			} else if (temp >= 70 && temp <= 100) {
				System.out.println("B");
			} else if (temp >= 60 && temp <= 100) {
				System.out.println("C");
			} else if (temp >= 50 && temp <= 100) {
				System.out.println("D");
			} else if (temp >= 0 && temp <= 100) {
				System.out.println("F");
			} else {
				System.out.println("Err");
			}
		}

	}

}
