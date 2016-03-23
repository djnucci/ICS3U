package nucci;

import java.util.Scanner;

/*
 * NameRandoms.java
 * this program asks for a name then says it likes or does not like the name 
 * Daniel Nucci
 * March 23th, 2016
 */

public class NameRandoms {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		//variables
		String userName;
		int chance = (int) (Math.random() * 10) + 1;

		//user input
		System.out.println("What is your name?");
		userName = read.nextLine();

		//print the information
		if (chance <= 3) {
			System.out.println("I hate the name " + userName + ".");
		} else {
			System.out.println("I love the name " + userName + ".");
		}
	}
}
