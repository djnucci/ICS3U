package nucci;

import java.util.Scanner;

/*
 * IntegerBasicIf.java
 * this program asks for a number then 
 * Daniel Nucci
 * March 22th, 2016
 */

public class IntBasicIf {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//user integer
		int userNum;
		
		//get number from user
		System.out.println("Please enter an integer.");
		userNum = Integer.parseInt(read.nextLine());
		
		//check if pos
		if (userNum > 0) {
			System.out.println("The number you entered is positive.");
		}
		else {
			System.out.println("The number you entered is negative.");
		}
		
		//check if divisible by 7 and is not zero
		if (userNum % 7 == 0 && userNum != 0) {
			System.out.println("The number you entered is divisible by 7.");
		}
		else {
			System.out.println("The number you entered is not divisible by 7. The remainder is " + Math.abs(userNum % 7) + ".");
		}
	}

}
