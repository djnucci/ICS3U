package nucci;
/**
 * ConsoleInput.java
 * This program calculates the age of their mother when they were born
 * @author Daniel Nucci
 */
public class DiceRollingArray {

	public static void main(String[] args) {
		int[] diceRolls = new int[10000];

		int numberOfTwo = 0, numberOfThree = 0, numberOfFour = 0, numberOfFive = 0, numberOfSix = 0, numberOfSeven = 0, numberOfEight = 0, numberOfNine = 0, numberOfTen = 0, numberOfEleven = 0, numberOfTwelve = 0;

		for (int i = 0; i < diceRolls.length; i++) {
			int firstRoll = (int) ((Math.random() * 6) + 1);
			int secondRoll = (int) ((Math.random() * 6) + 1);

			diceRolls[i] = firstRoll + secondRoll;
		}

		for (int i = 0; i < diceRolls.length; i++) {
			if (diceRolls[i] == 2) {
				numberOfTwo++;
			} else if (diceRolls[i] == 3) {
				numberOfThree++;
			} else if (diceRolls[i] == 4) {
				numberOfFour++;
			} else if (diceRolls[i] == 5) {
				numberOfFive++;
			} else if (diceRolls[i] == 6) {
				numberOfSix++;
			} else if (diceRolls[i] == 7) {
				numberOfSeven++;
			} else if (diceRolls[i] == 8) {
				numberOfEight++;
			} else if (diceRolls[i] == 9) {
				numberOfNine++;
			} else if (diceRolls[i] == 10) {
				numberOfTen++;
			} else if (diceRolls[i] == 11) {
				numberOfEleven++;
			} else if (diceRolls[i] == 12) {
				numberOfTwelve++;
			}
		}

		System.out.println("Total:Number Of Rolls");
		System.out.println("2:" + numberOfTwo);
		System.out.println("3:" + numberOfThree);
		System.out.println("4:" + numberOfFour);
		System.out.println("5:" + numberOfFive);
		System.out.println("6:" + numberOfSix);
		System.out.println("7:" + numberOfSeven);
		System.out.println("8:" + numberOfEight);
		System.out.println("9:" + numberOfNine);
		System.out.println("10:" + numberOfTen);
		System.out.println("11:" + numberOfEleven);
		System.out.println("12:" + numberOfTwelve);
		
	}

}
