package nucci;

import java.util.Scanner;

/*
 * ArithmaticExpressions.java
 * this program does a sequence of math calculations on 5 numbers provided by the user
 * Daniel Nucci
 * March 9th, 2016
 */

public class ArithmaticExpressions {

	public static void main(String[] args) {

		boolean isFinished = false;
		String finish;
		Scanner read = new Scanner(System.in);

		while (!isFinished) {
		//ints
		int numOne;
		int numTwo;
		int numThree;
		int numFour;
		int numFive;

		//end values
		int numSum;
		int numSub;
		int numProd;
		double numQuot;
		int numRem;
		int numPow;    
		double numSqrt;

		//get ints
		System.out.println("Hello user, please enter your first integer.");
		numOne = Integer.parseInt(read.nextLine());

		System.out.println("Please enter your second integer.");
		numTwo = Integer.parseInt(read.nextLine());

		System.out.println("Please enter your third integer.");
		numThree = Integer.parseInt(read.nextLine());

		System.out.println("Please enter your fourth integer.");
		numFour = Integer.parseInt(read.nextLine());

		System.out.println("Please enter your fifth integer.");
		numFive = Integer.parseInt(read.nextLine());

		System.out.println("__________________________________________________________________________________________________________________________________________________________________________________________________");

		//do calculations
		numSum = numOne + numTwo + numThree + numFour + numFive;
		numSub = numThree - numTwo;
		numProd = numOne * numFive;
		numQuot = numFour / numTwo;
		numRem = numFour % numTwo;
		numPow = (int) Math.pow(numOne, numThree);
		numSqrt = Math.sqrt(numFive);

		//print answers
		System.out.println("The sum of all five numbers is: " + numSum);
		System.out.println("The result after subtracting the second number from the third is: " + numSub);
		System.out.println("The product of the first and fifth numbers is: " + numProd);
		System.out.println("The quotient of the fourth number divided by the second is: " + numQuot);
		System.out.println("The remainder when dividing the fourth number by the second is: " + numRem);
		System.out.println("The first number raised to the power of the third number is: " + numPow);
		System.out.println("The square root of the fifth number is: " + numSqrt);
		
		
		System.out.println("Continue: y/n ?");
		finish = read.nextLine();
		
		if (finish.equals("y")) {
			isFinished = false;
		}
		else {
			isFinished = true;
		}
		}
	}
}
