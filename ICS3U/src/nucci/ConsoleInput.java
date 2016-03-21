package nucci;

import java.util.Scanner;

/*
 * ConsoleInput.java
 * This program calculates the age of their mother when they were born
 * Daniel Nucci
 * March 8th, 2016
 */

public class ConsoleInput {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		//names
		String motherName; // the mother's name
		String userName; // the user's name

		//ages
		int motherAge; // the mother's age
		int userAge; // the user's age
		int birthAge; // the mothers age when the user was born

		//questions
		System.out.println("What is your mother's name?");
		motherName = read.nextLine();

		System.out.println("What is your mother's birth year?");
		motherAge = Integer.parseInt(read.nextLine());

		System.out.println("What is your name?");
		userName = read.nextLine();

		System.out.println("What is your birth date?");
		userAge = Integer.parseInt(read.nextLine());

		birthAge = userAge - motherAge;

		//print age
		System.out.println("Your mother, " + motherName + ", was aged when you were born, " + userName + ", was " + birthAge + ".");

	}

}
