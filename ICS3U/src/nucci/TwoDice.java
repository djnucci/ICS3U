package nucci;

/*
 * NameRandoms.java
 * this program rolls two dice for each "person" then compares 
 * Daniel Nucci
 * March 23th, 2016
 */

public class TwoDice {

	public static void main(String[] args) {
		
		//make two dice
		int dieOne = (int) (Math.random() * 6) + 1;
		int dieTwo = (int) (Math.random() * 6) + 1;
		
		//add the two
		int userResult = dieOne + dieTwo;
		
		//do the same for the computer
		dieOne = (int) (Math.random() * 6) + 1;
		dieTwo = (int) (Math.random() * 6) + 1;
		
		//add the two
		int aiResult = dieOne + dieTwo;
		
		//determine winner
		if (userResult > aiResult) {
			System.out.println("You won: " + userResult + " to " + aiResult);
		}
		else if (userResult < aiResult) {
			System.out.println("You lost: " + aiResult + " to " + userResult);
		}
		else {
			System.out.println("We tied: " + aiResult + " to " + userResult);
		}
	}

}
