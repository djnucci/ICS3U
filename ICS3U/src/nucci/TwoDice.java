package nucci;

import java.util.Scanner;

/*
 * NameRandoms.java
 * this program rolls two dice for each "person" then compares 
 * Daniel Nucci
 * March 23th, 2016
 */

public class TwoDice {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		boolean isFinished = false;
		String finish;
		
		while (!isFinished) {
			// make two dice
			int dieOne = (int) (Math.random() * 6) + 1;
			int dieTwo = (int) (Math.random() * 6) + 1;

			// add the two
			int userResult = dieOne + dieTwo;

			// do the same for the computer
			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;

			// add the two
			int aiResult = dieOne + dieTwo;

			// determine winner
			if (userResult > aiResult) {
				System.out.println("You won: " + userResult + " to " + aiResult);
			} else if (userResult < aiResult) {
				System.out.println("You lost: " + aiResult + " to " + userResult);
			} else {
				System.out.println("We tied: " + aiResult + " to " + userResult);
			}
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