package nucci;

import java.util.Scanner;

/*
 * WordGuessingGame.java
 * This program is a basic hang man game
 * Daniel Nucci
 * May 9th, 2016
 */

public class WordGuessingGame {

	public static void main(String[] args) {

		// my list of words
		String[] words = new String[]{"gyro", "do", "you", "often", "need", "to", "take", "spreadsheet", "of", "data", "and", "convert", "comma", "list", "special", "philatelist"};
		Scanner read = new Scanner(System.in);

		// pick a random word from my words
		int randomWord = (int) (Math.random() * words.length);

		// to keep track of if there are any dashes in the char array
		boolean dashes = true;
		int numGuesses = 0;

		// make the char array of the size of the word the computer wanted
		char[] wordDashes = new char[words[randomWord].length()];
		System.out.println("Word Guessing Game...");

		// make the word of dashes a word of dashes to start
		for (int i = 0; i < words[randomWord].length(); i++) {
			wordDashes[i] = '-';
		}

		// make a char array of the word inside words(the array)
		char[] wordOfWords = words[randomWord].toCharArray();

		// the # is to make sure the value is not null and not a letter in the alphabet
		String userGuess = "#";
		String guessWord;

		// do this loop while it has dashes in it and the user has not said '!'
		while (!userGuess.equalsIgnoreCase("!") && dashes) {
			for (int i = 0; i < wordDashes.length; i++) {

				// if the value is in the other array it will now be in this array
				if (wordOfWords[i] == userGuess.charAt(0)) {
					wordDashes[i] = userGuess.charAt(0);
				}
				System.out.print(wordDashes[i]);
			}

			// finding out if there are any dashes in the array
			for (int i = 0; i < wordDashes.length; i++) {
				if (wordDashes[i] == '-') {
					dashes = true;
					break;
				}
				if (wordDashes[i] != '-') {
					dashes = false;
				}
			}
			System.out.println();

			//only do this if there are dashes
			if (dashes) {
				System.out.print("Enter a letter (or a ! and hit enter to guess the word):");
				userGuess = read.nextLine();
				
				//add a guess
				numGuesses++;
			}
		}

		//if you won with dashes you win automatically
		if (!dashes) {
			System.out.println("Congrats, you won!");
			System.out.println("You guessed the word, it was: " + "'" + words[randomWord] + "'");
		} 
		
		//otherwise you have to guess the answer
		else {
			System.out.println("What is your guess for the word?");
			guessWord = read.nextLine();
			
			//if you got it right you win
			if (guessWord.equalsIgnoreCase(words[randomWord])) {
				System.out.println("Congrats, you won!");
				System.out.println("You guessed the word, it was: " + "'" + words[randomWord] + "'");
			} 
			
			//if you got it wrong you lose
			else {
				System.out.println("You failed the task.");
				System.out.println("You did not guess the word, it was: " + "'" + words[randomWord] + "'");
			}
		}
		
		//tel them the number of guesses it took for them to have lost/won
		System.out.println("It took you " + numGuesses + " guesses to come to that answer.");
	}

}
