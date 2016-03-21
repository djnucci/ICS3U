package nucci;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * ConsoleInput.java
 * This program calculates both real roots of a quadratic formula
 * Daniel Nucci
 * March 14th, 2016
 */
public class QuadraticFormulaCalculator {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		DecimalFormat answer = new DecimalFormat("0.0#");

		double aValue;
		double bValue;
		double cValue;

		double firstRoot;
		double secondRoot;

		System.out.println("Please enter an 'a' value.");
		aValue = Double.parseDouble(read.nextLine());

		System.out.println("Please enter a 'b' value.");
		bValue = Double.parseDouble(read.nextLine());

		System.out.println("Please enter a 'c' value.");
		cValue = Double.parseDouble(read.nextLine());

		if ((Math.pow(bValue, 2) - (4 * aValue * cValue)) >= 0 || aValue == 0) {
			firstRoot = ((-bValue + Math.sqrt(Math.pow(bValue, 2) - (4 * aValue * cValue))) / (2 * aValue));
			secondRoot = ((-bValue - Math.sqrt(Math.pow(bValue, 2) - (4 * aValue * cValue))) / (2 * aValue));
			System.out.println("These are your roots:" + answer.format(firstRoot) + ", " + answer.format(secondRoot));

		} else {
			System.out.println("There are no real roots or one real root in your equation. Please correct your equation.");
		}

	}
}
